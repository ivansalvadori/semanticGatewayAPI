package br.ufsc.inf.lapesd.semantic.gateway.api;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import br.ufsc.inf.lapesd.semantic.gateway.api.documentation.hydra.HydraDocumentation;

public class SemanticGatewayApi {
	
	private Map<String, String> mapMicroserviceIdIpAddress = new HashMap<>();
	
	private GatewayApiDocGenerator gatewayApiDocGenerator = new GatewayApiDocGenerator();
	private GatewayEntrypointGenerator gatewayEntrypointGenerator = new GatewayEntrypointGenerator();
	
	public void registry(HydraDocumentation apiDocumentation, String ipAddress) {
		String newMicroserviceID = UUID.randomUUID().toString();
		mapMicroserviceIdIpAddress.put(newMicroserviceID, ipAddress);
		this.gatewayApiDocGenerator.registry(apiDocumentation, ipAddress);
		this.gatewayEntrypointGenerator.registry(apiDocumentation, newMicroserviceID);		
	}
	
	public void activate(){
		
	}

}
