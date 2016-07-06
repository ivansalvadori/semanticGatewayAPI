package br.ufsc.inf.lapesd.semantic.gateway.api;

import com.google.gson.Gson;

public abstract class ApiDocumentation {
	
	private String ipAddress;
	
	
	public String getIpAddress() {
		return ipAddress;
	}
	
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	
	
	@Override
	public String toString() {
		return new Gson().toJson(this);
	}

}
