package br.ufsc.inf.lapesd.semantic.gateway.api.documentation.hydra;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import br.ufsc.inf.lapesd.semantic.gateway.api.ApiDocumentation;

public class HydraDocumentation extends ApiDocumentation{

	@SerializedName("@context")
    private Map<String, String> context = new HashMap<>();

	@SerializedName("@type")
    private final String type = "ApiDocumentation";
	
	private String entrypoint;

    private List<SupportedClass> supportedClass = new ArrayList<>();
    
    public void addSupportedClass(SupportedClass supportedClass){
    	this.supportedClass.add(supportedClass);
    }
    
    public void putContext(Map<String, String> context){
    	this.context.putAll(context);
    }
    
    public void addSupportedClasses(List<SupportedClass> supportedClasses){
    	this.supportedClass.addAll(supportedClasses);
    }
    
    
    public String getEntrypoint() {
		return entrypoint;
	}

    public List<SupportedClass> getSupportedClass() {
		return supportedClass;
	}
	

	public Map<String, String> getContext() {
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