package net.i2cat.geysers.web.web.client.widgets;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.event.logical.shared.SelectionHandler;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.ui.CaptionPanel;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.MenuBar;
import com.google.gwt.user.client.ui.MenuItem;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.TabPanel;
import com.google.gwt.user.client.ui.Tree;
import com.google.gwt.user.client.ui.TreeItem;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.MenuItemSeparator;

public class LeftMenuLayout extends Composite {
	private MenuItem mntmRequestVi;
	private CaptionPanel panel;
	

	public LeftMenuLayout() {
		
		/*FlowPanel tab1Menu = new FlowPanel();
		initWidget(tab1Menu);
		tab1Menu.setSize("100%", "100%");*/
		
		final TabPanel tabPanel = new TabPanel();
		initWidget(tabPanel);
		tabPanel.setSize("100%", "100%");
		tabPanel.addSelectionHandler(new SelectionHandler<Integer>() {
			public void onSelection(SelectionEvent<Integer> event) {
				//here, see which one was selected
				// and do something like
				// if(operation1)... panel.add(operation1PAnel);
				if(panel!=null){
					ListPIP listPIP = new ListPIP();
					panel.setContentWidget(listPIP);
					//listPIP.setSize("5cm", "3cm");
				}
				
			}
		});
	//	tab1Menu.add(tabPanel);
		
		
		//MENU MAIN
		
		VerticalPanel verticalPanel = new VerticalPanel();
		verticalPanel.setStyleName("gwt-TabBar .gwt-TabBarItem-selected");
		tabPanel.add(verticalPanel, "VIP Menu", false);
		verticalPanel.setSize("5cm", "3cm");
		
		MenuBar menuBar = new MenuBar(true);
		menuBar.setStyleName("gwt-MenuBar-vertical");
		verticalPanel.add(menuBar);
		menuBar.setSize("188px", "158px");
		
		menuBar.setAutoOpen(true);
		//menu.setWidth("100px");
		//menu.setHeight("25px");
		menuBar.setAnimationEnabled(true);
		
		MenuItem mntmVi = new MenuItem("Virtual Infrastructure", false, (Command) null);
		mntmVi.setStyleName("gwt-MenuLeft-item");
		menuBar.addItem(mntmVi);
		mntmVi.setSize("184", "19");
		
		MenuItem mntmShowVis = new MenuItem("show VI details", false, new Command() {
			public void execute() {
				tabPanel.selectTab(1);
				
			}
		});
		menuBar.addItem(mntmShowVis);
		
		MenuItemSeparator separator = new MenuItemSeparator();
		menuBar.addSeparator(separator);
		
		mntmRequestVi = new MenuItem("add request", false, new Command() {
			public void execute() {
				AddRequest.addRequestCall(new AddRequest());
			}
			
		});
		menuBar.addItem(mntmRequestVi);
		
		MenuItemSeparator separator_1 = new MenuItemSeparator();
		menuBar.addSeparator(separator_1);
		
		
		MenuItem mntmRemoveRequest = new MenuItem("remove request", false, (Command) null);
		menuBar.addItem(mntmRemoveRequest);
		
		MenuItem mntmShowViTopology = new MenuItem("Show VI Topology", false, new Command() {
			public void execute() {
				TopologyVI topologyVI = new TopologyVI();
				panel.setContentWidget(topologyVI);
			}
		});
		mntmShowViTopology.setStyleName("gwt-MenuLeft-item");
		menuBar.addItem(mntmShowViTopology);
		
		MenuItem mntmPips = new MenuItem("List of PIPs", false, new Command() {
			public void execute() {
				//open list of pips in client view
				if(panel!=null){
					ListPIP listPIP = new ListPIP();
					panel.setContentWidget(listPIP);
					//listPIP.setSize("5cm", "3cm");
				}
			}
		});
		mntmPips.setStyleName("gwt-MenuLeft-item");
		menuBar.addItem(mntmPips);
		mntmPips.setSize("184", "19");
		
		MenuItem mntmVios = new MenuItem("List of VIOs", false, new Command() {
			public void execute() {
				//opens vio panel in client view
				if(panel!=null){
					ListVIO listVIO = new ListVIO();
					panel.setContentWidget(listVIO);
					//listVIO.setSize("5cm", "3cm");
				}
			}
		});
		//todo add Re-plan request
		mntmVios.setStyleName("gwt-MenuLeft-item");
		menuBar.addItem(mntmVios);
		mntmVios.setSize("184", "19");
		
		//add second tab
		ScrollPanel scrollPanel = new ScrollPanel();
		scrollPanel.setStyleName("gwt-TabBar .gwt-TabBarRest");
		tabPanel.add(scrollPanel, "VI", false);
		scrollPanel.setSize("5cm", "3cm");
		
		Tree tree = new Tree();
		scrollPanel.setWidget(tree);
		
		
		//Tree tree = new Tree();
		//scrollPanel.add(tree, "VI", false);
		//tree.setHeight(""+menuBar.getOffsetHeight()+"px");
		//tree.setWidth(""+menuBar.getOffsetWidth()+"px");
		
		TreeItem trtmVi = new TreeItem("VI");
		tree.addItem(trtmVi);
		
		TreeItem trtmVr = new TreeItem("VR");
		trtmVi.addItem(trtmVr);
		trtmVr.setHeight("100%");
		trtmVr.setState(true);
		
		Label label = new Label("VR");
		label.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				if(panel!=null){
					treeVrId treeVrId = new treeVrId();
					panel.setContentWidget(treeVrId);
					//treeVrId.setSize("5cm", "3cm");
		}
			}
		});
		TreeItem treeItem = trtmVi.addItem(label);
		trtmVi.setState(true);
		
		//tabPanel.setSize(""+menuBar.getOffsetWidth()+"px",""+menuBar.getOffsetHeight()+"px");
		
		//sctnstcksctnVios.addItem(sectionStack);
		
		tabPanel.selectTab(0);
	}
		
		public CaptionPanel getPanel() {
			return panel;
		}

		public void setPanel(CaptionPanel panel) {
			this.panel = panel;
			
		}

	
		
	
}
