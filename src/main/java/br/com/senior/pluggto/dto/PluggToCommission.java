package br.com.senior.pluggto.dto;

import org.apache.camel.component.jackson.JacksonDataFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection(serialization = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class PluggToCommission {

    public static final JacksonDataFormat PLUGG_TO_COMISSION_FORMAT = new JacksonDataFormat(PluggToCommission.class);

    @JsonProperty("fixed")
    public String fixed;
    @JsonProperty("tax")
    public String tax;
    @JsonProperty("total_charged")
    public String totalCharged;
    @JsonProperty("comment")
    public String comment;
}
