package br.ufsc.inf.lapesd.semantic.gateway.api;

import java.util.Map;
import java.util.Set;

import br.ufsc.inf.lapesd.semantic.gateway.api.documentation.hydra.Entrypoint;
import br.ufsc.inf.lapesd.semantic.gateway.api.documentation.hydra.HydraDocumentation;

public class GatewayEntrypointGenerator {
	
	private Entrypoint gatewayApiEntrypoint = new Entrypoint();

	
	public void registry(HydraDocumentation apiDocumentation, String microserviceID) {
		 Entrypoint lookUpEntryPoint = lookUpEntryPoint(apiDocumentation.getEntrypoint());
		 gatewayApiEntrypoint.addLinks(lookUpEntryPoint.getLinks());
		 addMicroserviceId( microserviceID);
	}
	
	public void addMicroserviceId(String microserviceID){
		Map<String, String> links = gatewayApiEntrypoint.getLinks();
		Set<String> keySet = links.keySet();
		for (String key : keySet) {
			String url = links.get(key);
			String finalUrl = "/" +microserviceID + url;
			gatewayApiEntrypoint.addLink(key, finalUrl);
		}
		
	}
	
	public Entrypoint lookUpEntryPoint(String ipAddressEntrypoint){
		Entrypoint entrypoint = null;
		
		return entrypoint;
		
	}
	
	public Entrypoint getGatewayApiEntrypoint() {
		return gatewayApiEntrypoint;
	}

}
