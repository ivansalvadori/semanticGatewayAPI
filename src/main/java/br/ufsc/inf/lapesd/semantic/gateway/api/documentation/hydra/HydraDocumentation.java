package br.ufsc.inf.lapesd.semantic.gateway.api.documentation.hydra;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import br.ufsc.inf.lapesd.semantic.gateway.api.ApiDocumentation;

public class HydraDocumentation extends ApiDocumentation{

	@SerializedName("@context")
    private final String context = "http://www.w3.org/ns/hydra/context.jsonld";

	@SerializedName("@type")
    private final String type = "ApiDocumentation";

    private List<SupportedClass> supportedClass = new ArrayList<>();
    
    public void addSupportedClass(SupportedClass supportedClass){
    	this.supportedClass.add(supportedClass);
    }
    
    public void addSupportedClasses(List<SupportedClass> supportedClasses){
    	this.supportedClass.addAll(supportedClasses);
    }
    

    public List<SupportedClass> getSupportedClass() {
		return supportedClass;
	}
	

	public String getContext() {
		return context;
	}

	public String getType() {
		return type;
	}

	@Override
	public String toString() {
		return new Gson().toJson(this);
	}

}