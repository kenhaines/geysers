package net.i2cat.geysers.web.web.client.widgets;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.Label;

public class ListVIP extends Composite {

	public ListVIP() { 
		FlowPanel mainPanel = new FlowPanel();
		initWidget(mainPanel);
		
		Label lblListOfVios = new Label("List of VIPs");
		lblListOfVios.setStyleName("gui-Label-list");
		lblListOfVios.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_LEFT);
		mainPanel.add(lblListOfVios);
		
		FlexTable flexTable = new FlexTable();
		flexTable.setStyleName("gui-listHeader");
		flexTable.setText(0, 0, "ID");
		flexTable.setText(0, 1, "Country");
		flexTable.setText(0, 2, "City");
		flexTable.setText(0, 3, "VI requested");
		//to do VI: resource kinds, status of the VI (down, accepted, scheduled, completed, etc.)
		
		mainPanel.add(flexTable);
		
	}

}
