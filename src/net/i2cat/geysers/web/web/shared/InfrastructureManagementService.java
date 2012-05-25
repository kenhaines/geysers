package net.i2cat.geysers.web.web.shared;

import java.util.List;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
@RemoteServiceRelativePath("PRManagement")
public interface InfrastructureManagementService extends RemoteService {
	//copied from InfrastructureManagentSvc interface ()the one generated automatically
	    public boolean deleteLink(java.lang.String user, java.lang.String password, java.lang.String idLink) ;
	    public boolean deletePR(java.lang.String user, java.lang.String password, java.lang.String PRIdentifier);
	    public boolean addPRByURL(java.lang.String user, java.lang.String password, java.lang.String PRDescription, java.lang.String managementURL, java.lang.String authToken, java.lang.String PRAdapterType, java.lang.String configurationFile) ;
	    public boolean addTestbed(java.lang.String user, java.lang.String password, java.lang.String testbedInformation);
	    public boolean addSlaTemplate(java.lang.String file, java.lang.String user, java.lang.String password)  ;
	    public boolean addMultipleLinks(java.lang.String user, java.lang.String password, java.lang.String linksInformation) ;
	    public boolean addLink(java.lang.String user, java.lang.String password, java.lang.String desc, java.lang.String sourceInterfaceId, java.lang.String sinkInterfaceId, java.lang.String additionalInformation) ;
	    public boolean addPRByIP(java.lang.String user, java.lang.String password, java.lang.String prDescription, java.lang.String PRAdapterType, java.lang.String accessConfigurationFile, java.lang.String deviceConfigurationFile) ;
	    public boolean addInterdomainLink(java.lang.String user, java.lang.String password, java.lang.String description, java.lang.String domain, java.lang.String _interface, java.lang.String type, java.lang.String additionalInformation) ;
	    public boolean addMultiplePRs(java.lang.String user, java.lang.String password, java.lang.String PRsInformation) ;
	    public boolean addDomain(java.lang.String user, java.lang.String password, java.lang.String domainName) ;
	    public boolean deleteDomain(java.lang.String user, java.lang.String password, java.lang.String domainName) ;

	    //our own methods for getting things
	    public List<PhysicalResource> getPR();
}
