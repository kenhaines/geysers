package net.i2cat.geysers.web.web.client.widgets;

import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.CaptionPanel;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.MenuBar;
import com.google.gwt.user.client.ui.MenuItem;
import com.google.gwt.user.client.ui.MenuItemSeparator;

public class PipTopPanel extends Composite {

	protected static final LeftMenuLayout LeftMenuLayout = null;
	Requests requests = new Requests();
	private CaptionPanel panel;
	
	public PipTopPanel() {
		
		LayoutPanel layoutPanel = new LayoutPanel();
		initWidget(layoutPanel);
		layoutPanel.setHeight("75px");
		
		// Create a menu bar
	    MenuBar menu = new MenuBar();
	    layoutPanel.add(menu);
	    menu.setAutoOpen(true);
	    menu.setWidth("100px");
	    menu.setHeight("25px");
	    menu.setAnimationEnabled(true);
	    MenuBar menuBar_1 = new MenuBar(true);
	    
	    MenuItem mntmMenu = new MenuItem("Menu", false, menuBar_1);
	    
	    MenuItem mntmpr = new MenuItem("PR", false, new Command() {
	    	public void execute() {
	    		//LeftMenuLayout left = new LeftMenuLayout;todo
	    	}
	    });
	    mntmpr.setHTML("show PR");
	    menuBar_1.addItem(mntmpr);
	    
	    MenuItemSeparator separator_1 = new MenuItemSeparator();
	    menuBar_1.addSeparator(separator_1);
	    
	    MenuItem mntmShowListOf_1 = new MenuItem("show PR topology", false, new Command() {
	    	public void execute() {
		    		if(panel!=null){
						ListVIO listVIO = new ListVIO();
						panel.setContentWidget(listVIO);
						//listPIP.setSize("5cm", "3cm");
					}
	    		
	    	}
	    });
	    menuBar_1.addItem(mntmShowListOf_1);
	    
	    MenuItemSeparator separator_2 = new MenuItemSeparator();
	    menuBar_1.addSeparator(separator_2);
	    
	    MenuItem mntmShowListOf = new MenuItem("show list of VIPs", false, new Command() {
	    	public void execute() {
	    		if(panel!=null){
					ListVIP listVIP = new ListVIP();
					panel.setContentWidget(listVIP);
					//listPIP.setSize("5cm", "3cm");
				}
	    	}
	    });
	    mntmShowListOf.setHTML("show list of VIPs");
	    menuBar_1.addItem(mntmShowListOf);
	    
	    MenuItemSeparator separator_3 = new MenuItemSeparator();
	    menuBar_1.addSeparator(separator_3);
	    
	    MenuItem mntmAddRequest = new MenuItem("add request", false, new Command() {
	    	public void execute() {
	    		AddRequest.addRequestCall(new AddRequest());
	    	}
	    });
	    menuBar_1.addItem(mntmAddRequest);
	    menu.addItem(mntmMenu);
	    MenuBar menuBar = new MenuBar(true);
	    
	    MenuItem mntmHelp = new MenuItem("Help", false, menuBar);
	    
	    MenuItem mntmHelp_1 = new MenuItem("Help", false, (Command) null);
	    menuBar.addItem(mntmHelp_1);
	    
	    MenuItemSeparator separator = new MenuItemSeparator();
	    menuBar.addSeparator(separator);
	    
	    MenuItem mntmAbout = new MenuItem("About", false, (Command) null);
	    menuBar.addItem(mntmAbout);
	    menu.addItem(mntmHelp);
	    
	    MenuItem mntmLogout = new MenuItem("Logout", false, new Command() {
	    	public void execute() {
	    		//return to login page
	    		
	    		Window.Location.reload();
	    		
	    	}
	    });
	    menu.addItem(mntmLogout);
	    
	}
	public CaptionPanel getPanel() {
		return panel;
	}

	public void setPanel(CaptionPanel panel) {
		this.panel = panel;
		
	}

}
