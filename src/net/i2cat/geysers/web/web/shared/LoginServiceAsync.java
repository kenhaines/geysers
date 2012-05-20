package net.i2cat.geysers.web.web.shared;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface LoginServiceAsync {

	void isVIP(String username, String password, AsyncCallback<String> callback);

}
