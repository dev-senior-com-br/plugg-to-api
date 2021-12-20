package br.com.senior.pluggto.dto;

import java.util.List;

import org.apache.camel.component.jackson.JacksonDataFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection(serialization = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class PluggToOrderItemVariation {

    public static final JacksonDataFormat PLUGG_TO_ORDER_ITEM_VARIATION_FORMAT = new JacksonDataFormat(PluggToOrderItemVariation.class);

    @JsonProperty("attributes")
    public List<Object> attributes;
    @JsonProperty("id")
    public String id;
    @JsonProperty("name")
    public String name;
    @JsonProperty("external")
    public String external;
    @JsonProperty("sku")
    public String sku;
    @JsonProperty("ean")
    public String ean;
    @JsonProperty("photo_url")
    public String photoUrl;

}
