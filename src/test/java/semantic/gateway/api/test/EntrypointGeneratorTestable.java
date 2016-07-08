package semantic.gateway.api.test;

import java.util.Map;
import java.util.Set;

import com.jayway.jsonpath.JsonPath;

import br.ufsc.inf.lapesd.semantic.gateway.api.GatewayEntrypointGenerator;
import br.ufsc.inf.lapesd.semantic.gateway.api.documentation.hydra.Entrypoint;

public class EntrypointGeneratorTestable extends GatewayEntrypointGenerator{
	
	private String stringEntrypoint;
	
	public void setStringEntrypoint(String stringEntrypoint) {
		this.stringEntrypoint = stringEntrypoint;
	}
	
	@Override
	public Entrypoint lookUpEntryPoint(String ipAddressEntrypoint) {
		
		Entrypoint entrypoint = new Entrypoint();
		
		Map<?, ?> obj = JsonPath.read(this.stringEntrypoint, "$");
		Set<?> keySet = obj.keySet();
		for (Object key : keySet) {
			if(key.toString().equalsIgnoreCase("@context")){
				continue;
			}
			if(key.toString().equalsIgnoreCase("@id")){
				continue;
			}
			entrypoint.addLink(key.toString(), obj.get(key).toString());
		}
		
		return entrypoint;
	}

}
