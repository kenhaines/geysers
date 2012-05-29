package net.i2cat.geysers.web.web.client.widgets;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.MenuBar;
import com.google.gwt.user.client.ui.MenuItem;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.ui.CaptionPanel;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.MenuItemSeparator;
import com.google.gwt.user.client.ui.TabPanel;
import com.google.gwt.user.client.ui.Tree;
import com.google.gwt.event.logical.shared.SelectionHandler;
import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.user.client.ui.TabLayoutPanel;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.TreeItem;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class PipLeftMenuLayout extends Composite {
	private String WidthPxl = "128px";
	private CaptionPanel panel;

	public PipLeftMenuLayout() {
		
		final TabPanel tabPanel = new TabPanel();
		tabPanel.setStyleName("gwt-TabBar");
		
		
		initWidget(tabPanel);
		
		VerticalPanel verticalPanel = new VerticalPanel();
		verticalPanel.setStyleName("gwt-TabBar .gwt-TabBarFirst");
		tabPanel.add(verticalPanel, "PIP Menu", false);
		verticalPanel.setSize("5cm", "3cm");
		
		tabPanel.addSelectionHandler(new SelectionHandler<Integer>() {
			public void onSelection(SelectionEvent<Integer> event) {
				if(panel!=null){
					ListPIP listPIP = new ListPIP();
					panel.setContentWidget(listPIP);
					//listPIP.setSize("5cm", "3cm");
				}
				
			}
		});
		
		MenuBar menuBar = new MenuBar(true);
		verticalPanel.add(menuBar);
		menuBar.setStyleName("gwt-TabBar .gwt-TabBarFirst");
		menuBar.setAnimationEnabled(true);
		menuBar.setAutoOpen(true);
		
		MenuItem mntmPr = new MenuItem("Physical Resources", false, (Command) null);
		mntmPr.setStyleName("gwt-MenuLeft-item");
		menuBar.addItem(mntmPr);
		
		MenuItem mntmShowPr = new MenuItem("show PR", false, new Command() {
			public void execute() {
				tabPanel.selectTab(1);	
				if(panel!=null){
					PRtable topologyPR = new PRtable();
					panel.setContentWidget(topologyPR);
				}
			}
		});
		menuBar.addItem(mntmShowPr);
		
		MenuItemSeparator separator_2 = new MenuItemSeparator();
		separator_2.setStyleName("gwt-MenuItem");
		menuBar.addSeparator(separator_2);
		
		MenuItem mntmSearchPr = new MenuItem("search PR", false, (Command) null);
		menuBar.addItem(mntmSearchPr);
		
		MenuItemSeparator separator = new MenuItemSeparator();
		menuBar.addSeparator(separator);
		
		MenuItem mntmNewItem_1 = new MenuItem("add PR", false, (Command) null);
		menuBar.addItem(mntmNewItem_1);
		
		MenuItemSeparator separator_1 = new MenuItemSeparator();
		menuBar.addSeparator(separator_1);
		
		MenuItem mntmRemovePr = new MenuItem("remove PR", false, (Command) null);
		menuBar.addItem(mntmRemovePr);
		
		MenuItem mntmShowPrTopology = new MenuItem("Show PR Topology", false, new Command() {
			public void execute() {
				if(panel!=null){
					PRtable topologyPR = new PRtable();
					panel.setContentWidget(topologyPR);
				}
			}
		});
		mntmShowPrTopology.setStyleName("gwt-MenuLeft-item");
		menuBar.addItem(mntmShowPrTopology);
		
		MenuItem mntmRegisterInterdomainLink = new MenuItem("Register Inter-Domain Link", false, new Command() {
			public void execute() {
				//todo - upload file?
			}
		});
		mntmRegisterInterdomainLink.setStyleName("gwt-MenuLeft-item");
		menuBar.addItem(mntmRegisterInterdomainLink);
		
		MenuItem mntmNewItem = new MenuItem("List of VIPs", false, new Command() {
			public void execute() {
				if(panel!=null){
					ListVIP listVIP = new ListVIP();
					panel.setContentWidget(listVIP);
				}
			}
		});
		//todo - add register multiple links or multiple PRs from config
		mntmNewItem.setStyleName("gwt-MenuLeft-item");
		menuBar.addItem(mntmNewItem);
		
		ScrollPanel scrollPanel = new ScrollPanel();
		tabPanel.add(scrollPanel, "PR", false);
		scrollPanel.setSize("5cm", "3cm");
		//scrollPanel.setWidth(""+menuBar.getOffsetWidth()+"px");
		//scrollPanel.setPixelSize(menuBar.getOffsetWidth(),menuBar.getOffsetHeight());
		
		Tree tree = new Tree();
		scrollPanel.setWidget(tree);
		tree.setSize("100%", "100%");
		
		TreeItem trtmPr = new TreeItem("PR");
		tree.addItem(trtmPr);
		
		tabPanel.selectTab(0);
	}

	public CaptionPanel getPanel() {
		return panel;
	}

	public void setPanel(CaptionPanel panel) {
		this.panel = panel;
		
	}
	
	
}
