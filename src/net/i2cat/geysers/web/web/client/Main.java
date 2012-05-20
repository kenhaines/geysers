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
	//private final Message message = new Message(errorMsg(), Message.PULSATE, 0.75);
	
	
	public void onModuleLoad() {
		
		
		final RootPanel rootPanel = RootPanel.get();
		HTML htmlGeysersLogo = new HTML("</br><img src='logo.png' alt='GEYSERS Logotype'/></br>");
		htmlGeysersLogo.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_LEFT);
		rootPanel.add(htmlGeysersLogo);
		
		final TextBox username = new TextBox();
		username.setAlignment(TextAlignment.LEFT);
		rootPanel.add(username, 144, 131);
		username.setSize("143px", "14px");
		final PasswordTextBox password = new PasswordTextBox();
		password.setAlignment(TextAlignment.LEFT);
		rootPanel.add(password, 144, 168);
		password.setSize("143px", "14px");
		
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
				login.isVIP(username.getText(),password.getText(),
						new LoginCallbackExecuter(password, username, rootPanel));
			}
		});
		rootPanel.add(btnLogin, 254, 202);
		btnLogin.setSize("45px", "22px");
		
		Label lblUsername = new Label("Username");
		lblUsername.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		lblUsername.setStyleName("gui-Label");
		rootPanel.add(lblUsername, 5, 131);
		
		Label lblPassword = new Label("Password");
		lblPassword.setStyleName("gui-Label");
		rootPanel.add(lblPassword, 5, 168);
		lblPassword.setSize("60px", "19px");
		
		btnAddViRequest = new Button("Add VI request");
		btnAddViRequest.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				
				AddRequest.addRequestCall(new AddRequest());
			}

			
		});
		rootPanel.add(btnAddViRequest, 199, 268);
		btnAddViRequest.setSize("100px", "22px");
		
		Label lblVioAddVi = new Label("VIO? Add VI request");
		lblVioAddVi.setStyleName("gui-Label");
		rootPanel.add(lblVioAddVi, 5, 271);
		lblVioAddVi.setSize("128px", "19px");
		
		Label lblSignIn = new Label("Sign In to GEYSERS LICL");
		lblSignIn.setStyleName("gui-Label-big");
		
		rootPanel.add(lblSignIn, 5, 82);
		}
}
