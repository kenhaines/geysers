package net.i2cat.geysers.web.web.client.widgets;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.ClickEvent;

public class Requests extends Composite {
	private VerticalPanel verticalPanel;
	private FlexTable flexTable;
	private HorizontalPanel horizontalPanel;
	private Button btnRemove;
	private Button btnAddNew;
	//private com.smartgwt.client.widgets.Button btnAddNew;
	//private com.smartgwt.client.widgets.Button btnRemove;

	public Requests() {
		
		verticalPanel = new VerticalPanel();
		initWidget(verticalPanel);
		
		flexTable = new FlexTable();
		
		flexTable.setText(0, 0, "ID");
		flexTable.setText(0, 1, "ResourceKinds");
		flexTable.setText(0, 2, "Country");
		flexTable.setText(0, 3, "City");
		flexTable.setText(0, 4, "Status");
		
		verticalPanel.add(flexTable);
		
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
		
	//	btnAddNew = new com.smartgwt.client.widgets.Button("Add New");
		//horizontalPanel.add(btnAddNew);
		
		//btnRemove = new com.smartgwt.client.widgets.Button("Remove");
		//horizontalPanel.add(btnRemove);
	}

}
