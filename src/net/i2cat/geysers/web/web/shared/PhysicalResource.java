package net.i2cat.geysers.web.web.shared;

import java.io.Serializable;

public class PhysicalResource implements Serializable{

	

	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String description; 
	 private String IP;
	 private String  port;
	 private String PRUser;
	 private  String PRPassword;
	 private String adapterType;
	 private String configFile;
	 
	 public PhysicalResource(){
		 
	 }
	 
	 public PhysicalResource(String description, String ip, String port, String user, String password, String type, String configFile){
		 this.description=description;
		 this.IP=ip;
		 this.port=port;
		 this.PRUser=user;
		 this.PRPassword=password;
		 this.adapterType=type;
		 this.configFile=configFile;
		 
	 }
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getIP() {
		return IP;
	}
	public void setIP(String iP) {
		IP = iP;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	public String getPRUser() {
		return PRUser;
	}
	public void setPRUser(String pRUser) {
		PRUser = pRUser;
	}
	public String getPRPassword() {
		return PRPassword;
	}
	public void setPRPassword(String pRPassword) {
		PRPassword = pRPassword;
	}
	public String getAdapterType() {
		return adapterType;
	}
	public void setAdapterType(String adapterType) {
		this.adapterType = adapterType;
	}
	public String getConfigFile() {
		return configFile;
	}
	public void setConfigFile(String configFile) {
		this.configFile = configFile;
	}
	 
	 
}
