package net.i2cat.geysers.web.web.shared;

import java.util.List;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface InfrastructureManagementServiceAsync {

	void addDomain(String user, String password, String domainName,
			AsyncCallback<Boolean> callback);

	void addInterdomainLink(String user, String password, String description,
			String domain, String _interface, String type,
			String additionalInformation, AsyncCallback<Boolean> callback);

	void addLink(String user, String password, String desc,
			String sourceInterfaceId, String sinkInterfaceId,
			String additionalInformation, AsyncCallback<Boolean> callback);

	void addMultipleLinks(String user, String password,
			String linksInformation, AsyncCallback<Boolean> callback);

	void addMultiplePRs(String user, String password, String PRsInformation,
			AsyncCallback<Boolean> callback);

	void addPRByIP(String user, String password, String prDescription,
			String PRAdapterType, String accessConfigurationFile,
			String deviceConfigurationFile, AsyncCallback<Boolean> callback);

	void addPRByURL(String user, String password, String PRDescription,
			String managementURL, String authToken, String PRAdapterType,
			String configurationFile, AsyncCallback<Boolean> callback);

	void addSlaTemplate(String file, String user, String password,
			AsyncCallback<Boolean> callback);

	void addTestbed(String user, String password, String testbedInformation,
			AsyncCallback<Boolean> callback);

	void deleteDomain(String user, String password, String domainName,
			AsyncCallback<Boolean> callback);

	void deleteLink(String user, String password, String idLink,
			AsyncCallback<Boolean> callback);

	void deletePR(String user, String password, String PRIdentifier,
			AsyncCallback<Boolean> callback);

	void getPR(AsyncCallback<List<PhysicalResource>> asyncCallback);

}
