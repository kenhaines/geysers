package net.i2cat.geysers.web.web.client.widgets;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.event.logical.shared.SelectionHandler;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.ui.CaptionPanel;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.MenuBar;
import com.google.gwt.user.client.ui.MenuItem;
import com.google.gwt.user.client.ui.MenuItemSeparator;
import com.google.gwt.user.client.ui.TabPanel;
import com.google.gwt.user.client.ui.Tree;
import com.google.gwt.user.client.ui.TreeItem;

public class LeftMenuLayout extends Composite {
	private MenuItem mntmRequestVi;
	private String WidthPxl = "100%";
	private CaptionPanel panel;
	

	public LeftMenuLayout() {
		
		FlowPanel tab1Menu = new FlowPanel();
		initWidget(tab1Menu);
		tab1Menu.setHeight("100%");
		tab1Menu.setWidth("100%");
		
		final TabPanel tabPanel = new TabPanel();
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
		tabPanel.setWidth("100%");
		
		//MENU MAIN
		MenuBar menuBar = new MenuBar(true);
		tabPanel.add(menuBar, "VIP", false);
		menuBar.setSize("100%", "");
		menuBar.setAutoOpen(true);
		//menu.setWidth("100px");
		//menu.setHeight("25px");
		menuBar.setAnimationEnabled(true);
		MenuBar menuBar_1 = new MenuBar(true);
		
		MenuItem mntmVi = new MenuItem("Virtual Infrastucture", false, menuBar_1);
		mntmVi.setStyleName("gwt-MenuLeft-item");
		
		MenuItem mntmShowVis = new MenuItem("show VI details", false, new Command() {
			public void execute() {
				tabPanel.selectTab(1);
				
			}
		});
		menuBar_1.addItem(mntmShowVis);
		
		MenuItemSeparator separator = new MenuItemSeparator();
		menuBar_1.addSeparator(separator);
		
		mntmRequestVi = new MenuItem("add request", false, new Command() {
			public void execute() {
				AddRequest.addRequestCall(new AddRequest());
			}
			
		});
		menuBar_1.addItem(mntmRequestVi);
		
		MenuItemSeparator separator_1 = new MenuItemSeparator();
		menuBar_1.addSeparator(separator_1);
		
		MenuItem mntmRemoveRequest = new MenuItem("remove request", false, (Command) null);
		menuBar_1.addItem(mntmRemoveRequest);
		menuBar.addItem(mntmVi);
		
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
		mntmVios.setStyleName("gwt-MenuLeft-item");
		menuBar.addItem(mntmVios);
		
		Tree tree = new Tree();
		tabPanel.add(tree, "VI", false);
		tree.setSize(WidthPxl, "");
		
		TreeItem trtmVi = new TreeItem("VI");
		tree.addItem(trtmVi);
		trtmVi.setWidth("100%");
		
		TreeItem trtmVr = new TreeItem("VR");
		trtmVi.addItem(trtmVr);
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
