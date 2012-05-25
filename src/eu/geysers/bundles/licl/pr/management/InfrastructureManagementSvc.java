/**
 * InfrastructureManagementSvc.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.geysers.bundles.licl.pr.management;

public interface InfrastructureManagementSvc extends java.rmi.Remote {
    public boolean deleteLink(java.lang.String user, java.lang.String password, java.lang.String idLink) throws java.rmi.RemoteException;
    public boolean deletePR(java.lang.String user, java.lang.String password, java.lang.String PRIdentifier) throws java.rmi.RemoteException;
    public boolean addPRByURL(java.lang.String user, java.lang.String password, java.lang.String PRDescription, java.lang.String managementURL, java.lang.String authToken, java.lang.String PRAdapterType, java.lang.String configurationFile) throws java.rmi.RemoteException;
    public boolean addTestbed(java.lang.String user, java.lang.String password, java.lang.String testbedInformation) throws java.rmi.RemoteException;
    public boolean addSlaTemplate(java.lang.String file, java.lang.String user, java.lang.String password) throws java.rmi.RemoteException;
    public boolean addMultipleLinks(java.lang.String user, java.lang.String password, java.lang.String linksInformation) throws java.rmi.RemoteException;
    public boolean addLink(java.lang.String user, java.lang.String password, java.lang.String desc, java.lang.String sourceInterfaceId, java.lang.String sinkInterfaceId, java.lang.String additionalInformation) throws java.rmi.RemoteException;
    public boolean addPRByIP(java.lang.String user, java.lang.String password, java.lang.String prDescription, java.lang.String PRAdapterType, java.lang.String accessConfigurationFile, java.lang.String deviceConfigurationFile) throws java.rmi.RemoteException;
    public boolean addInterdomainLink(java.lang.String user, java.lang.String password, java.lang.String description, java.lang.String domain, java.lang.String _interface, java.lang.String type, java.lang.String additionalInformation) throws java.rmi.RemoteException;
    public boolean addMultiplePRs(java.lang.String user, java.lang.String password, java.lang.String PRsInformation) throws java.rmi.RemoteException;
    public boolean addDomain(java.lang.String user, java.lang.String password, java.lang.String domainName) throws java.rmi.RemoteException;
    public boolean deleteDomain(java.lang.String user, java.lang.String password, java.lang.String domainName) throws java.rmi.RemoteException;
}
