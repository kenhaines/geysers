package net.i2cat.geysers.web.web.client.widgets;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;

public class ListPIP extends Composite {

	public ListPIP() {
		
		FlowPanel mainPanel = new FlowPanel();
		initWidget(mainPanel);
		
		Label lblListOfPips = new Label("List of PIPs");
		lblListOfPips.setStyleName("gui-Label-list");
		lblListOfPips.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_LEFT);
		mainPanel.add(lblListOfPips);
		
		FlexTable flexTable = new FlexTable();
		flexTable.setStyleName("gui-listHeader");
		//add top cells to list
		flexTable.setText(0, 0, "Role");
		flexTable.setText(0, 1, "ResourceKinds");
		flexTable.setText(0, 2, "Domains");
		flexTable.setText(0, 3, "Granularity");
		flexTable.setText(0, 4, "Country");
		flexTable.setText(0, 5, "City");
		flexTable.setText(0, 6, "Coordinates");
		
		mainPanel.add(flexTable);
		
		
		
		//public static void addPipList(final ListPIP listPip) {
			////final ListPIP listPIP.flexTableshowlistPIP.show();
			//popup position
			//&&addRequest.setPopupPosition(50, 20);
		
	}

}
