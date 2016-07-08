package br.ufsc.inf.lapesd.semantic.gateway.api.documentation.hydra;

import com.google.gson.annotations.SerializedName;

public class SupportedProperty{

	@SerializedName("@id")
    private String id;

    private String property;

    @SerializedName("@type")
    private String type;

    private boolean writeonly = false;
    private boolean readonly = false;
    private boolean required = false;
    
}