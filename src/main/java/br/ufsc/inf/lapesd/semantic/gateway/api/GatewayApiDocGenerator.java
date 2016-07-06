package br.ufsc.inf.lapesd.semantic.gateway.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.ufsc.inf.lapesd.semantic.gateway.api.documentation.hydra.HydraDocumentation;
import br.ufsc.inf.lapesd.semantic.gateway.api.documentation.hydra.SupportedClass;

public class GatewayApiDocGenerator {

	private Map<String, ApiDocumentation> docsOfRegisteredApis = new HashMap<>();
	private Map<String, List<String>> mapSupportedClassIp = new HashMap<>();

	private HydraDocumentation gatewayApiDoc = new HydraDocumentation();

	public void registry(HydraDocumentation apiDocumentation, String ipAddress) {
		this.docsOfRegisteredApis.put(ipAddress, apiDocumentation);
		appendSupportedClass(apiDocumentation, ipAddress);

	}

	public HydraDocumentation getHydraDocumentation() {
		System.out.println(mapSupportedClassIp);
		return gatewayApiDoc;

	}

	private void appendSupportedClass(HydraDocumentation hydraDoc, String ipAddress) {
		List<SupportedClass> supportedClasses = hydraDoc.getSupportedClass();
		for (SupportedClass supportedClass : supportedClasses) {
			gatewayApiDoc.addSupportedClass(supportedClass);
			if(mapSupportedClassIp.get(supportedClass.getId()) == null){
				mapSupportedClassIp.put(supportedClass.getId(), new ArrayList<>());			
			}
			List<String> ips = mapSupportedClassIp.get(supportedClass.getId());
			ips.add(ipAddress);
			mapSupportedClassIp.put(supportedClass.getId(), ips);
		}
	}

}
