package br.ufsc.inf.lapesd.semantic.gateway.api.documentation.hydra;

import java.util.List;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public class SupportedClass {

	@SerializedName("@context")
	private String context;

	@SerializedName("@id")
	private String id;

	@SerializedName("@type")
	private SemanticClassType type;

	private List<SupportedProperty> supportedProperty;

	private List<SupportedOperation> supportedOperation;

	public String getContext() {
		return context;
	}

	public String getId() {
		return id;
	}

	public SemanticClassType getType() {
		return type;
	}

	public List<SupportedProperty> getSupportedProperty() {
		return supportedProperty;
	}

	public List<SupportedOperation> getSupportedOperation() {
		return supportedOperation;
	}

	@Override
	public String toString() {
		return new Gson().toJson(this);
	}

}