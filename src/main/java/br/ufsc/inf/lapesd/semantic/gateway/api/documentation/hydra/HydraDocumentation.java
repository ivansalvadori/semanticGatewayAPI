package br.ufsc.inf.lapesd.semantic.gateway.api.documentation.hydra;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import br.ufsc.inf.lapesd.semantic.gateway.api.ApiDocumentation;

public class HydraDocumentation extends ApiDocumentation{

	@SerializedName("@context")
    private final String context = "http://www.w3.org/ns/hydra/context.jsonld";

	@SerializedName("@type")
    private final String type = "ApiDocumentation";

    private List<SupportedClass> supportedClasses = new ArrayList<>();

	public HydraDocumentation(List<SupportedClass> supportedClasses) {
		super();
		this.supportedClasses = supportedClasses;
	}

	public List<SupportedClass> getSupportedClasses() {
		return supportedClasses;
	}

	public void setSupportedClasses(List<SupportedClass> supportedClasses) {
		this.supportedClasses = supportedClasses;
	}

	public String getContext() {
		return context;
	}

	public String getType() {
		return type;
	}
	
	
    
    

    

}