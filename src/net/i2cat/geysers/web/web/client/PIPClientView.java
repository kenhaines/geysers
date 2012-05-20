package net.i2cat.geysers.web.web.client;

import net.i2cat.geysers.web.web.client.widgets.LeftMenuLayout;
import net.i2cat.geysers.web.web.client.widgets.ListPIP;
import net.i2cat.geysers.web.web.client.widgets.PipLeftMenuLayout;
import net.i2cat.geysers.web.web.client.widgets.Requests;
import net.i2cat.geysers.web.web.client.widgets.TopPanel;
import net.i2cat.geysers.web.web.client.widgets.UserInfo;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.CaptionPanel;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;


public class PIPClientView extends Composite {

	private VerticalPanel mainPanel;
	private HorizontalPanel topMenu;


	public PIPClientView() {
		mainPanel = new VerticalPanel();
		initWidget(mainPanel);
		setWidth("100%");
		setHeight("100%");
		
		topMenu = new HorizontalPanel();
		mainPanel.add(topMenu);
		mainPanel.setCellHeight(topMenu, "100%");
		mainPanel.setCellWidth(topMenu, "100%");
		mainPanel.setCellHorizontalAlignment(topMenu, HasHorizontalAlignment.ALIGN_CENTER);
		topMenu.setSize("100%", "40px");
		
		TopPanel topPanel = new TopPanel();
		topMenu.add(topPanel);
		topMenu.setCellHeight(topPanel, "100%");
		topMenu.setCellWidth(topPanel, "100%");
		topPanel.setSize("100%", "100%");
		
		HTML htmlGeysersLogo = new HTML("</br><img src='logo.png' alt='GEYSERS Logotype'/></br></br>");
		mainPanel.add(htmlGeysersLogo);
		mainPanel.setCellHorizontalAlignment(htmlGeysersLogo, HasHorizontalAlignment.ALIGN_CENTER);
		//topMenu.setWidgetLeftRight(menuTop, 0.0, Unit.PX, 294.0, Unit.PX);
		//topMenu.setCellHorizontalAlignment(btnLogout, HasHorizontalAlignment.ALIGN_RIGHT);
		
		//create Main View (center of Page)
		HorizontalPanel mainView = new HorizontalPanel();
		mainPanel.add(mainView);
		mainView.setWidth("100%");
		mainView.setHeight("100%");
		mainView.setVerticalAlignment(HasVerticalAlignment.ALIGN_TOP);

		
		//create Lower View 
		HorizontalPanel lowView = new HorizontalPanel();
		mainPanel.add(lowView);
		mainView.setCellHeight(lowView, "100%");		
		
		PipLeftMenuLayout pipLeftMenuLayout = new PipLeftMenuLayout();
		mainView.add(pipLeftMenuLayout);
		mainView.setCellHeight(pipLeftMenuLayout, "100%");
		mainView.setCellWidth(pipLeftMenuLayout, "30%");
		pipLeftMenuLayout.setSize("30%", "100%");
		
		
		//create main view
		CaptionPanel centerPanel = new CaptionPanel();
		pipLeftMenuLayout.setPanel(centerPanel);
		//centerPanel.setCaptionText("center");
		mainView.add(centerPanel);
		
		

		lowView.setWidth("100%");
		lowView.setHeight("100%");
		lowView.setVerticalAlignment(HasVerticalAlignment.ALIGN_TOP);
		
		//add User Info Panel
		CaptionPanel userInfoPanel = new CaptionPanel();
		userInfoPanel.setCaptionText("User Information");
		
		lowView.add(userInfoPanel);
		lowView.setCellWidth(userInfoPanel, "30%");
		lowView.setCellHeight(userInfoPanel, "100%");
		userInfoPanel.setSize("30%\r\n", "100%");
		
		UserInfo userInfo = new UserInfo();
		userInfoPanel.setContentWidget(userInfo);
		userInfo.setSize("5cm", "3cm");
		

		//add Panel
		CaptionPanel requestsPanel = new CaptionPanel();
		requestsPanel.setCaptionText("Requests");
		lowView.add(requestsPanel);
		requestsPanel.setSize("281", "133");
		
		Requests requests = new Requests();
		requestsPanel.setContentWidget(requests);
		requests.setSize("5cm", "3cm");
		
		//footer
		HorizontalPanel footerPanel = new HorizontalPanel();
		mainPanel.add(footerPanel);
		footerPanel.setSize("100%", "100%");
		
		LayoutPanel layoutPanel = new LayoutPanel();
		footerPanel.add(layoutPanel);
		layoutPanel.setSize("100%\r\n", "40px");
		footerPanel.setCellVerticalAlignment(layoutPanel, HasVerticalAlignment.ALIGN_MIDDLE);
		footerPanel.setCellHorizontalAlignment(layoutPanel, HasHorizontalAlignment.ALIGN_CENTER);
		footerPanel.setCellWidth(layoutPanel, "100%");
		footerPanel.setCellHeight(layoutPanel, "100%");
		
		Label lblc = new Label("(copyright)");
		layoutPanel.add(lblc);
		layoutPanel.setWidgetTopHeight(lblc, 0.0, Unit.PX, 42.0, Unit.PX);
		lblc.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		lblc.setDirectionEstimator(true);

	}
	
	
}
