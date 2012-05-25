package net.i2cat.geysers.web.web.client.widgets;

import java.util.List;

import net.i2cat.geysers.web.web.shared.InfrastructureManagementService;
import net.i2cat.geysers.web.web.shared.InfrastructureManagementServiceAsync;
import net.i2cat.geysers.web.web.shared.PhysicalResource;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;

public class PRtable extends Composite {

	
	private VerticalPanel verticalPanel;
	private FlexTable flexTable;
	private HorizontalPanel horizontalPanel;
	private Button btnRemove;
	private Button btnAddNew;
	private Label lblRequests;
	private Button btnRefresh;
	//private com.smartgwt.client.widgets.Button btnAddNew;
	//private com.smartgwt.client.widgets.Button btnRemove;
	public PRtable() {
		


			
			verticalPanel = new VerticalPanel();
			initWidget(verticalPanel);
			
			lblRequests = new Label("Requests");
			lblRequests.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_LEFT);
			lblRequests.setStyleName("gui-Label-list");
			verticalPanel.add(lblRequests);
			
			ScrollPanel scroll = new ScrollPanel();
			verticalPanel.add(scroll);
			
			
			flexTable = new FlexTable();
			flexTable.setStyleName("gui-listHeader");
			
			flexTable.setText(0, 0, "Description");
			flexTable.setText(0, 1, "IP");
			flexTable.setText(0, 2, "Port");
			flexTable.setText(0, 3, "User");
			flexTable.setText(0, 4, "Password");
			flexTable.setText(0, 5, "Type");
			flexTable.setText(0, 6, "Config");
			flexTable.setText(0,7, "Remove");
			
			scroll.add(flexTable);
			
			horizontalPanel = new HorizontalPanel();
			verticalPanel.add(horizontalPanel);
			
			btnAddNew = new Button("Add New");
			btnAddNew.addClickHandler(new ClickHandler() {
				public void onClick(ClickEvent event) {
					AddRequest.addRequestCall(new AddRequest());
				}
			});
			horizontalPanel.add(btnAddNew);
			
			btnRemove = new Button("Remove");
			horizontalPanel.add(btnRemove);
			
			btnRefresh = new Button("Refresh");
			btnRefresh.addClickHandler(new ClickHandler() {
				public void onClick(ClickEvent event) {
					//call our service
					InfrastructureManagementServiceAsync service=(InfrastructureManagementServiceAsync)GWT.create(InfrastructureManagementService.class);
					service.getPR(new  AsyncCallback<List<PhysicalResource>>(){

						@Override
						public void onFailure(Throwable caught) {
							int row = flexTable.getRowCount();
							flexTable.setText(row, 0,caught.getMessage());
							
						}

						@Override
						public void onSuccess(List<PhysicalResource> results) {
							int j=flexTable.getRowCount();
							for (int i=1;i<j;i++) {
								flexTable.removeRow(1);
							} 
							for(PhysicalResource resource:results){
								Button  button = new Button("X");
								
								int row = flexTable.getRowCount();
								flexTable.setText(row, 0, resource.getDescription());
								flexTable.setText(row, 1, resource.getIP());
								flexTable.setText(row, 2, resource.getPort());
								flexTable.setText(row, 3, resource.getPRUser());
								flexTable.setText(row, 4, resource.getPRPassword());
								flexTable.setText(row, 5, resource.getAdapterType());
								flexTable.setText(row, 6, resource.getConfigFile());
								flexTable.setWidget(row,7,button);
								
							}
							
						}
						
						
					});
				}
			});
			horizontalPanel.add(btnRefresh);
			
		//	btnAddNew = new com.smartgwt.client.widgets.Button("Add New");
			//horizontalPanel.add(btnAddNew);
			
			//btnRemove = new com.smartgwt.client.widgets.Button("Remove");
			//horizontalPanel.add(btnRemove);
		
		
	}

}
