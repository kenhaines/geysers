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

public class PipLeftMenuLayout extends Composite {
	private MenuItem mntmRequestVi;
	private String WidthPxl = "128px";
	private CaptionPanel panel;

	public PipLeftMenuLayout() {
		
		FlowPanel tab1Menu = new FlowPanel();
		initWidget(tab1Menu);
		tab1Menu.setHeight("100%");
		tab1Menu.setWidth("100%");
		
		TabPanel tabPanel = new TabPanel();
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
		tab1Menu.add(tabPanel);
		
		MenuBar menuBar = new MenuBar(true);
		tabPanel.add(menuBar, "PIP", false);
		menuBar.setSize("128px\r\n", "3cm");
		menuBar.setAutoOpen(true);
		//menu.setWidth("100px");
		//menu.setHeight("25px");
		menuBar.setAnimationEnabled(true);
		MenuBar menuBar_1 = new MenuBar(true);
		
		MenuItem mntmVi = new MenuItem("Physical Resources", false, menuBar_1);
		mntmVi.setStyleName("gwt-MenuLeft-item");
		
		MenuItem mntmShowVis = new MenuItem("search PR", false, (Command) null);
		menuBar_1.addItem(mntmShowVis);
		
		MenuItemSeparator separator = new MenuItemSeparator();
		menuBar_1.addSeparator(separator);
		
		mntmRequestVi = new MenuItem("add PR", false, new Command() {
			public void execute() {
				//AddRequest.addRequestCall(new AddRequest());
			}
			
		});
		menuBar_1.addItem(mntmRequestVi);
		
		MenuItemSeparator separator_1 = new MenuItemSeparator();
		menuBar_1.addSeparator(separator_1);
		
		MenuItem mntmRemoveRequest = new MenuItem("remove PR", false, (Command) null);
		menuBar_1.addItem(mntmRemoveRequest);
		menuBar.addItem(mntmVi);
		
		MenuItem mntmPips = new MenuItem("List of VIPs", false, (Command) null);
		mntmPips.setStyleName("gwt-MenuLeft-item");
		menuBar.addItem(mntmPips);
		
		MenuItem mntmVios = new MenuItem("Register inter-domain link", false, (Command) null);
		mntmVios.setStyleName("gwt-MenuLeft-item");
		menuBar.addItem(mntmVios);
		
		Tree tree = new Tree();
		tabPanel.add(tree, "PR", false);
		tree.setSize(WidthPxl, "3cm");
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
