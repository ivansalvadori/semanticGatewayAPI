package br.ufsc.inf.lapesd.semantic.gateway.api.documentation.hydra;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.gson.annotations.SerializedName;

public class SupportedClass {

	@SerializedName("@context")
    private Map<String, String> context = new HashMap<>();

	@SerializedName("@id")
    private List<String> id;

	@SerializedName("@type")
    private SemanticClassType type;

    private List<SupportedProperty> supportedProperty;

    private List<SupportedOperation> supportedOperation;


    

}