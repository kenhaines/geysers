package net.i2cat.geysers.web.web.server;

import java.net.URL;
import java.rmi.RemoteException;
import java.util.LinkedList;
import java.util.List;

import net.i2cat.geysers.web.web.shared.InfrastructureManagementService;
import net.i2cat.geysers.web.web.shared.PhysicalResource;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import eu.geysers.bundles.licl.pr.management.InfrastructureManagementSvcProxy;

public class InfrastructureManagementServiceImpl extends RemoteServiceServlet
		implements InfrastructureManagementService {

	InfrastructureManagementSvcProxy  service= new InfrastructureManagementSvcProxy("http://geysers.eu/ws");
	@Override
	public boolean deleteLink(String user, String password, String idLink)
			 {
		//normally we would create a InfrastructureManagementProxy and call their methods
		// return service.deleteLink(user,password,idLink);
		//but since it is WOP we send mock answers
		
		return true;
	}

	@Override
	public boolean deletePR(String user, String password, String PRIdentifier)
			 {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean addPRByURL(String user, String password,
			String PRDescription, String managementURL, String authToken,
			String PRAdapterType, String configurationFile)
			 {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean addTestbed(String user, String password,
			String testbedInformation)  {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean addSlaTemplate(String file, String user, String password)
			 {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean addMultipleLinks(String user, String password,
			String linksInformation)  {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean addLink(String user, String password, String desc,
			String sourceInterfaceId, String sinkInterfaceId,
			String additionalInformation)  {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean addPRByIP(String user, String password,
			String prDescription, String PRAdapterType,
			String accessConfigurationFile, String deviceConfigurationFile) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean addInterdomainLink(String user, String password,
			String description, String domain, String _interface, String type,
			String additionalInformation) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean addMultiplePRs(String user, String password,
			String PRsInformation) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean addDomain(String user, String password, String domainName) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean deleteDomain(String user, String password, String domainName)
			 {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public List<PhysicalResource> getPR() {
		List<PhysicalResource> list = new LinkedList<PhysicalResource>();
		
		list.add(new PhysicalResource("pr 1","192.168.0.1","9000","root","toor","router","config.txt"));
		list.add(new PhysicalResource("pr 2","192.168.0.2","9001","toor","root","coffee machine","N/A"));

		return list;
	}

}
