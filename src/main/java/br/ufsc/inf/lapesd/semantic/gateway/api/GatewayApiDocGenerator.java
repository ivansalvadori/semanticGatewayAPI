package br.ufsc.inf.lapesd.semantic.gateway.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.ufsc.inf.lapesd.semantic.gateway.api.documentation.hydra.HydraDocumentation;
import br.ufsc.inf.lapesd.semantic.gateway.api.documentation.hydra.SupportedClass;

public class GatewayApiDocGenerator {

	private Map<String, ApiDocumentation> mapIpApiDoc = new HashMap<>();
	private Map<String, List<String>> mapIpSupportedClass = new HashMap<>();
	private HydraDocumentation gatewayApiDoc = new HydraDocumentation();

	public void registry(HydraDocumentation apiDocumentation, String ipAddress) {
		this.mapIpApiDoc.put(ipAddress, apiDocumentation);
		appendSupportedClass(apiDocumentation, ipAddress);
	}

	public HydraDocumentation getHydraDocumentation() {
		return gatewayApiDoc;

	}

	private void appendSupportedClass(HydraDocumentation hydraDoc, String ipAddress) {
		gatewayApiDoc.putContext(hydraDoc.getContext());
		List<SupportedClass> supportedClasses = hydraDoc.getSupportedClass();
		for (SupportedClass supportedClass : supportedClasses) {
			gatewayApiDoc.addSupportedClass(supportedClass);
			if(mapIpSupportedClass.get(supportedClass.getId()) == null){
				mapIpSupportedClass.put(supportedClass.getId(), new ArrayList<>());			
			}
			List<String> ips = mapIpSupportedClass.get(supportedClass.getId());
			ips.add(ipAddress);
			mapIpSupportedClass.put(supportedClass.getId(), ips);
		}
	}

}
