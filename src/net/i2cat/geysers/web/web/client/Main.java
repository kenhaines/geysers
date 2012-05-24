package net.i2cat.geysers.web.web.client;

import net.i2cat.geysers.web.web.client.widgets.AddRequest;
import net.i2cat.geysers.web.web.shared.LoginServiceAsync;
import net.i2cat.geysers.web.web.shared.LoginService;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.ValueBoxBase.TextAlignment;
import com.google.gwt.event.dom.client.KeyPressHandler;
import com.google.gwt.event.dom.client.KeyPressEvent;

public class Main implements EntryPoint {
	private final class LoginCallbackExecuter implements AsyncCallback<String> {
		private final PasswordTextBox password;
		private final TextBox username;
		private final RootPanel rootPanel;

		private LoginCallbackExecuter(PasswordTextBox password,
				TextBox username, RootPanel rootPanel) {
			this.password = password;
			this.username = username;
			this.rootPanel = rootPanel;
		}

		@Override
		public void onFailure(Throwable caught) {
			GWT.log("error signing in", caught);
		}

		@Override
		public void onSuccess(String result) {
			if(result ==null){
				username.setText("I dont know you");
			}else if(result.equals("vip") ){
				ClientView clientView= new ClientView();
				rootPanel.clear();
				rootPanel.add(clientView);
			}else if(result.equals("pip")){
				PIPClientView pipView= new PIPClientView();
				rootPanel.clear();
				rootPanel.add(pipView);
			}else {
				username.setText("I dont know your role");
			}
			
		}
	}


	private Button btnLogin;
	;
	private Button btnAddViRequest;
	private PasswordTextBox password_1;
	//private final Message message = new Message(errorMsg(), Message.PULSATE, 0.75);
	
	
	public void onModuleLoad() {
		
		
		final RootPanel rootPanel = RootPanel.get();
		HTML htmlGeysersLogo = new HTML("</br><img src='logo.png' alt='GEYSERS Logotype'/></br>");
		htmlGeysersLogo.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_LEFT);
		rootPanel.add(htmlGeysersLogo);
		
		final TextBox username = new TextBox();
		username.setAlignment(TextAlignment.LEFT);
		rootPanel.add(username, 165, 167);
		username.setSize("143px", "14px");
		password_1 = new PasswordTextBox();
		password_1.addKeyPressHandler(new KeyPressHandler() {
			public void onKeyPress(KeyPressEvent event) {
				
//				if (event.getCharCode() == KeyCodes.KEY_ENTER){
//					//todo same as for login button
//				}
			}
		});
		password_1.setAlignment(TextAlignment.LEFT);
		rootPanel.add(password_1, 165, 204);
		password_1.setSize("143px", "14px");
		
		btnLogin = new Button("Login");
		btnLogin.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				/*if (username.getText().length() == 0
						|| password.getText().length() == 0) {
						Window.alert("Username or password is empty."); 
					}*/
				LoginServiceAsync login = (LoginServiceAsync)GWT.create(LoginService.class);
				ServiceDefTarget endpoint = (ServiceDefTarget) login;
				endpoint.setServiceEntryPoint(GWT.getModuleBaseURL()+"login");
				login.isVIP(username.getText(),password_1.getText(),
						new LoginCallbackExecuter(password_1, username, rootPanel));
			}
		});
		rootPanel.add(btnLogin, 275, 238);
		btnLogin.setSize("45px", "22px");
		
		Label lblUsername = new Label("Username");
		lblUsername.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		lblUsername.setStyleName("gui-Label");
		rootPanel.add(lblUsername, 26, 167);
		
		Label lblPassword = new Label("Password");
		lblPassword.setStyleName("gui-Label");
		rootPanel.add(lblPassword, 26, 204);
		lblPassword.setSize("60px", "19px");
		
		btnAddViRequest = new Button("Add VI request");
		btnAddViRequest.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				
				AddRequest.addRequestCall(new AddRequest());
			}

			
		});
		rootPanel.add(btnAddViRequest, 220, 304);
		btnAddViRequest.setSize("100px", "22px");
		
		Label lblVioAddVi = new Label("VIO? Add VI request");
		lblVioAddVi.setStyleName("gui-Label");
		rootPanel.add(lblVioAddVi, 26, 307);
		lblVioAddVi.setSize("128px", "19px");
		
		Label lblSignIn = new Label("Sign In to GEYSERS LICL");
		lblSignIn.setStyleName("gui-Label-big");
		
		rootPanel.add(lblSignIn, 26, 118);
		}
}
