package net.i2cat.geysers.web.web.shared;

import com.google.gwt.user.client.rpc.RemoteService;

public interface LoginService extends RemoteService{

	public boolean isVIP(String username, String password);
	
}
