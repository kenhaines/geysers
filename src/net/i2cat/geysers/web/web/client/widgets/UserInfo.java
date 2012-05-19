package net.i2cat.geysers.web.web.client.widgets;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;



public class UserInfo extends Composite {
	private com.google.gwt.user.client.ui.Label lblSmthHere;
	private com.google.gwt.user.client.ui.Label lblNamespace;
	private com.google.gwt.user.client.ui.Label lblLocation;

	public UserInfo() {
		
		//LayoutPanel pnlClientInformation = new LayoutPanel();
		
		FlowPanel verticalPanel = new FlowPanel();
		//pnlClientInformation.add(verticalPanel);
		initWidget(verticalPanel);
		verticalPanel.setHeight("100%");
		verticalPanel.setWidth("100%");
		
		lblSmthHere = new com.google.gwt.user.client.ui.Label("role");
		verticalPanel.add(lblSmthHere);
		
		lblNamespace = new com.google.gwt.user.client.ui.Label("namespace");
		verticalPanel.add(lblNamespace);
		
		lblLocation = new com.google.gwt.user.client.ui.Label("location");
		verticalPanel.add(lblLocation);	
		
		
		//pnlClientInformation.setCollapsible(true);
		//initWidget(pnlClientInformation);
		//pnlClientInformation.setSize("152px", "184px");
	}

}
