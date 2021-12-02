package br.com.senior.pluggto.dto;

import java.util.List;

import org.apache.camel.component.jackson.JacksonDataFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection(serialization = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PluggToOrderItemVariation {

    public static final JacksonDataFormat PLUGG_TO_ORDER_ITEM_VARIATION_FORMAT = new JacksonDataFormat(PluggToOrderItemVariation.class);

    public List<Object> attributes;
    public String id;
    public String name;
    public String external;
    public String sku;
    public String ean;
    @JsonProperty("photo_url")
    public String photoUrl;

}
