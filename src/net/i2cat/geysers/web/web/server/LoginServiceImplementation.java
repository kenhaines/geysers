package net.i2cat.geysers.web.web.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import net.i2cat.geysers.web.web.shared.LoginService;

public class LoginServiceImplementation extends RemoteServiceServlet implements LoginService {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public boolean isVIP(String username, String password) {
		if(username.equals("vip") && password.equals("vip")){
			return true;
		}else{
		return false;
		}
	}

}
