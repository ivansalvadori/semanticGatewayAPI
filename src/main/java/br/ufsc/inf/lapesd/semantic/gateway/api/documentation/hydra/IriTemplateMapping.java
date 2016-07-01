package br.ufsc.inf.lapesd.semantic.gateway.api.documentation.hydra;

public class IriTemplateMapping {

	public IriTemplateMapping(String id, String variable, boolean required, String range) {
		super();
		this.id = id;
		this.variable = variable;
		this.required = required;
		this.range = range;
	}

	private final String type = "IriTemplateMapping";

	private final String id;

	private final String variable;

	private final boolean required;

	private final String range;

}