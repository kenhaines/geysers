package eu.geysers.bundles.licl.pr.management;

public class InfrastructureManagementSvcProxy implements eu.geysers.bundles.licl.pr.management.InfrastructureManagementSvc {
  private String _endpoint = null;
  private eu.geysers.bundles.licl.pr.management.InfrastructureManagementSvc infrastructureManagementSvc = null;
  
  public InfrastructureManagementSvcProxy() {
    _initInfrastructureManagementSvcProxy();
  }
  
  public InfrastructureManagementSvcProxy(String endpoint) {
    _endpoint = endpoint;
    _initInfrastructureManagementSvcProxy();
  }
  
  private void _initInfrastructureManagementSvcProxy() {
    try {
      infrastructureManagementSvc = (new eu.geysers.bundles.licl.pr.management.InfrastructureManagementSvcServiceLocator()).getInfrastructureManagementSvcPort();
      if (infrastructureManagementSvc != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)infrastructureManagementSvc)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)infrastructureManagementSvc)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (infrastructureManagementSvc != null)
      ((javax.xml.rpc.Stub)infrastructureManagementSvc)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public eu.geysers.bundles.licl.pr.management.InfrastructureManagementSvc getInfrastructureManagementSvc() {
    if (infrastructureManagementSvc == null)
      _initInfrastructureManagementSvcProxy();
    return infrastructureManagementSvc;
  }
  
  public boolean deleteLink(java.lang.String user, java.lang.String password, java.lang.String idLink) throws java.rmi.RemoteException{
    if (infrastructureManagementSvc == null)
      _initInfrastructureManagementSvcProxy();
    return infrastructureManagementSvc.deleteLink(user, password, idLink);
  }
  
  public boolean deletePR(java.lang.String user, java.lang.String password, java.lang.String PRIdentifier) throws java.rmi.RemoteException{
    if (infrastructureManagementSvc == null)
      _initInfrastructureManagementSvcProxy();
    return infrastructureManagementSvc.deletePR(user, password, PRIdentifier);
  }
  
  public boolean addPRByURL(java.lang.String user, java.lang.String password, java.lang.String PRDescription, java.lang.String managementURL, java.lang.String authToken, java.lang.String PRAdapterType, java.lang.String configurationFile) throws java.rmi.RemoteException{
    if (infrastructureManagementSvc == null)
      _initInfrastructureManagementSvcProxy();
    return infrastructureManagementSvc.addPRByURL(user, password, PRDescription, managementURL, authToken, PRAdapterType, configurationFile);
  }
  
  public boolean addTestbed(java.lang.String user, java.lang.String password, java.lang.String testbedInformation) throws java.rmi.RemoteException{
    if (infrastructureManagementSvc == null)
      _initInfrastructureManagementSvcProxy();
    return infrastructureManagementSvc.addTestbed(user, password, testbedInformation);
  }
  
  public boolean addSlaTemplate(java.lang.String file, java.lang.String user, java.lang.String password) throws java.rmi.RemoteException{
    if (infrastructureManagementSvc == null)
      _initInfrastructureManagementSvcProxy();
    return infrastructureManagementSvc.addSlaTemplate(file, user, password);
  }
  
  public boolean addMultipleLinks(java.lang.String user, java.lang.String password, java.lang.String linksInformation) throws java.rmi.RemoteException{
    if (infrastructureManagementSvc == null)
      _initInfrastructureManagementSvcProxy();
    return infrastructureManagementSvc.addMultipleLinks(user, password, linksInformation);
  }
  
  public boolean addLink(java.lang.String user, java.lang.String password, java.lang.String desc, java.lang.String sourceInterfaceId, java.lang.String sinkInterfaceId, java.lang.String additionalInformation) throws java.rmi.RemoteException{
    if (infrastructureManagementSvc == null)
      _initInfrastructureManagementSvcProxy();
    return infrastructureManagementSvc.addLink(user, password, desc, sourceInterfaceId, sinkInterfaceId, additionalInformation);
  }
  
  public boolean addPRByIP(java.lang.String user, java.lang.String password, java.lang.String prDescription, java.lang.String PRAdapterType, java.lang.String accessConfigurationFile, java.lang.String deviceConfigurationFile) throws java.rmi.RemoteException{
    if (infrastructureManagementSvc == null)
      _initInfrastructureManagementSvcProxy();
    return infrastructureManagementSvc.addPRByIP(user, password, prDescription, PRAdapterType, accessConfigurationFile, deviceConfigurationFile);
  }
  
  public boolean addInterdomainLink(java.lang.String user, java.lang.String password, java.lang.String description, java.lang.String domain, java.lang.String _interface, java.lang.String type, java.lang.String additionalInformation) throws java.rmi.RemoteException{
    if (infrastructureManagementSvc == null)
      _initInfrastructureManagementSvcProxy();
    return infrastructureManagementSvc.addInterdomainLink(user, password, description, domain, _interface, type, additionalInformation);
  }
  
  public boolean addMultiplePRs(java.lang.String user, java.lang.String password, java.lang.String PRsInformation) throws java.rmi.RemoteException{
    if (infrastructureManagementSvc == null)
      _initInfrastructureManagementSvcProxy();
    return infrastructureManagementSvc.addMultiplePRs(user, password, PRsInformation);
  }
  
  public boolean addDomain(java.lang.String user, java.lang.String password, java.lang.String domainName) throws java.rmi.RemoteException{
    if (infrastructureManagementSvc == null)
      _initInfrastructureManagementSvcProxy();
    return infrastructureManagementSvc.addDomain(user, password, domainName);
  }
  
  public boolean deleteDomain(java.lang.String user, java.lang.String password, java.lang.String domainName) throws java.rmi.RemoteException{
    if (infrastructureManagementSvc == null)
      _initInfrastructureManagementSvcProxy();
    return infrastructureManagementSvc.deleteDomain(user, password, domainName);
  }
  
  
}