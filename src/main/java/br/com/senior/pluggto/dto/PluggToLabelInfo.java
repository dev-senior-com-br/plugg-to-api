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
public class PluggToLabelInfo {

    public static final JacksonDataFormat PLUGG_TO_LABEL_INFO_FORMAT = new JacksonDataFormat(PluggToLabelInfo.class);

    @JsonProperty("plp")
    public String plp;
    @JsonProperty("logotipo")
    public String logotipo;
    @JsonProperty("sender_name")
    public String senderName;
    @JsonProperty("sender_address")
    public String senderAddress;
    @JsonProperty("sender_city")
    public String senderCity;
    @JsonProperty("sender_state")
    public String senderState;
    @JsonProperty("sender_zipcode")
    public String senderZipCode;

}
