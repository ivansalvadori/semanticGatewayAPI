package semantic.gateway.api.test;

import static org.junit.Assert.*;

import java.io.IOException;


import org.apache.commons.io.IOUtils;
import org.junit.Test;


import com.google.gson.Gson;

import br.ufsc.inf.lapesd.semantic.gateway.api.GatewayApiDocGenerator;
import br.ufsc.inf.lapesd.semantic.gateway.api.documentation.hydra.HydraDocumentation;


public class GatewayApiTest {

	@Test
	public void generateDocumentation() throws IOException {
		String stringOfHydraDoc1 = IOUtils.toString(this.getClass().getResourceAsStream("/hydraDoc1.jsonld"), "UTF-8");
		HydraDocumentation hydraDoc1 = new Gson().fromJson(stringOfHydraDoc1, HydraDocumentation.class);
		
		String stringOfHydraDoc2 = IOUtils.toString(this.getClass().getResourceAsStream("/hydraDoc2.jsonld"), "UTF-8");
		HydraDocumentation hydraDoc2 = new Gson().fromJson(stringOfHydraDoc2, HydraDocumentation.class);
		
		GatewayApiDocGenerator generator = new GatewayApiDocGenerator();
		generator.registry(hydraDoc1, "10.1.1.1");
		generator.registry(hydraDoc2, "10.1.1.2");
		
		HydraDocumentation hydraDocumentation = generator.getHydraDocumentation();
		int numberOfSupportedClasses = hydraDocumentation.getSupportedClass().size();
		int expectedNumberOfSupportedClasses = 2;
		assertEquals(numberOfSupportedClasses, expectedNumberOfSupportedClasses);
		
		System.out.println(hydraDocumentation);
		
	}

}
