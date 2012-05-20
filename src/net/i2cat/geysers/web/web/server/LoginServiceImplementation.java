package net.i2cat.geysers.web.web.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import net.i2cat.geysers.web.web.shared.LoginService;
//import eu.geysers.bundles.licl.imf.create.model.IMFActor;
public class LoginServiceImplementation extends RemoteServiceServlet implements LoginService {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String isVIP(String username, String password) {
		
//		new IMFActor actor= callWebServiceTogetUser(username, password);
//		
//		if(actor !=null){
//			return actor.getRole();
//		}else{
//			return null;
//		}
		
		if(username.equals("vip")){
			return "vip";
		}else if(username.equals("pip")){
			return "pip";
		}else {
		return null;
		}
	}

//	private net.i2cat.geysers.web.web.server.IMFActor callWebServiceTogetUser(
//			String username, String password) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
