package net.i2cat.geysers.web.web.client.widgets;



import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.FileUpload;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.ClickEvent;

public class AddRequest extends DialogBox {
	private VerticalPanel verticalPanel;
	private Label lblAttachAnowl;
	private FileUpload fileUpload;
	private LayoutPanel layoutPanel;
	private Button btnCancel;
	private Button btnSendRequest;

	public void remove(Panel panel){
		panel.remove(this);
	}
	
	public AddRequest() {
		setHTML("Add VI Request");
		
		verticalPanel = new VerticalPanel();
		setWidget(verticalPanel);
		verticalPanel.setSize("302px", "132px");
		
		lblAttachAnowl = new Label("Attach an *.owl file with VI description");
		verticalPanel.add(lblAttachAnowl);
		
		fileUpload = new FileUpload();
		verticalPanel.add(fileUpload);
		
		layoutPanel = new LayoutPanel();
		verticalPanel.add(layoutPanel);
		layoutPanel.setHeight("26px");
		
		btnSendRequest = new com.google.gwt.user.client.ui.Button("Send Request");
		btnSendRequest.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				String filename = fileUpload.getFilename();
				if (filename.length() == 0){
					Window.alert("No file selected!");
				}
				else{//todo
					Window.alert("File upload successful");
				}
			}
		});
		layoutPanel.add(btnSendRequest);
		layoutPanel.setWidgetLeftWidth(btnSendRequest, 76.0, Unit.PX, 78.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(btnSendRequest, 0.0, Unit.PX, 24.0, Unit.PX);
		
		btnCancel = new com.google.gwt.user.client.ui.Button("Cancel");
		btnCancel.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				//remove the popup
				hide();
			}
		});
		layoutPanel.add(btnCancel);
		layoutPanel.setWidgetLeftWidth(btnCancel, 160.0, Unit.PX, 78.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(btnCancel, 0.0, Unit.PX, 24.0, Unit.PX);
	}
	public static void addRequestCall(final AddRequest addRequest) {
		addRequest.show();
		//popup position
		addRequest.setPopupPosition(100, 100);
	}

}
