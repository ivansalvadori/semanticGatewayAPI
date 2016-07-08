package br.ufsc.inf.lapesd.semantic.gateway.api.documentation.hydra;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;

public class Entrypoint {
	
	
	private Map<String, String> links = new HashMap<>();
	
	public void addLink(String key, String value){
		this.links.put(key, value);
	}
	
	public void addLinks(Map<String, String> links){
		this.links.putAll(links);
	}
	
	public Map<String, String> getLinks() {
		return links;
	}
	
	
	@Override
	public String toString() {
		return new Gson().toJson(this);
	}
	
	
	

}
