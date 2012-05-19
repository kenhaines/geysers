package net.i2cat.geysers.web.web.client.widgets;

import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CaptionPanel;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.MenuBar;
import com.google.gwt.user.client.ui.MenuItem;
import com.google.gwt.user.client.ui.MenuItemSeparator;



public class TopPanel extends Composite {

	;
	protected static final LeftMenuLayout LeftMenuLayout = null;
	Requests requests = new Requests();
	private Button btnLogout;
	private CaptionPanel panel;
	
	public TopPanel() {
		
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
	    
	    MenuItem mntmVi = new MenuItem("VI", false, new Command() {
	    	public void execute() {
	    		//LeftMenuLayout left = new LeftMenuLayout;todo
	    	}
	    });
	    mntmVi.setHTML("show VI");
	    menuBar_1.addItem(mntmVi);
	    
	    MenuItemSeparator separator_1 = new MenuItemSeparator();
	    menuBar_1.addSeparator(separator_1);
	    
	    MenuItem mntmAddRequest = new MenuItem("add request", false, new Command() {
	    	public void execute() {
	    		AddRequest.addRequestCall(new AddRequest());
	    	}
	    });
	    menuBar_1.addItem(mntmAddRequest);
	    
	    MenuItemSeparator separator_2 = new MenuItemSeparator();
	    menuBar_1.addSeparator(separator_2);
	    
	    MenuItem mntmShowListOf = new MenuItem("show list of PIPs", false, new Command() {
	    	public void execute() {
	    		if(panel!=null){
					ListPIP listPIP = new ListPIP();
					panel.setContentWidget(listPIP);
					//listPIP.setSize("5cm", "3cm");
				}
	    	}
	    });
	    menuBar_1.addItem(mntmShowListOf);
	    
	    MenuItemSeparator separator_3 = new MenuItemSeparator();
	    menuBar_1.addSeparator(separator_3);
	    
	    MenuItem mntmShowListOf_1 = new MenuItem("show list of VIOs", false, new Command() {
	    	public void execute() {
		    		if(panel!=null){
						ListVIO listVIO = new ListVIO();
						panel.setContentWidget(listVIO);
						//listPIP.setSize("5cm", "3cm");
					}
	    		
	    	}
	    });
	    menuBar_1.addItem(mntmShowListOf_1);
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
	    		//todo return to login page
	    	}
	    });
	    menu.addItem(mntmLogout);
	    
	    
	    
	   // MenuItem mntmLogout = new MenuItem("Log out", false, menuBar);
	  //  menu.addItem(mntmLogout);
		
		/*Label lblGeysers = new Label("GEYSERS");
		lblGeysers.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		layoutPanel.add(lblGeysers);
		layoutPanel.setWidgetLeftWidth(lblGeysers, 194.0, Unit.PX, 56.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(lblGeysers, 0.0, Unit.PX, 16.0, Unit.PX);*/
		
		/*btnLogout = new Button("Logout");
		btnLogout.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				
			}
		});
		layoutPanel.add(btnLogout);
		btnLogout.setSize("60", "25");
		layoutPanel.setWidgetLeftWidth(btnLogout, 697.0, Unit.PX, 78.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(btnLogout, 0.0, Unit.PX, 24.0, Unit.PX);*/

		

	}
	public CaptionPanel getPanel() {
		return panel;
	}

	public void setPanel(CaptionPanel panel) {
		this.panel = panel;
		
	}
}
