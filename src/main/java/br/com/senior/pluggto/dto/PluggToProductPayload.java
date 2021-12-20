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
public class PluggToProductPayload {

    public static final JacksonDataFormat PLUGG_TO_PRODUCT_FORMAT = new JacksonDataFormat(PluggToProductPayload.class);

    /*
     * Code
     **/
    @JsonProperty("sku")
    public String sku;

    /*
     * Description
     **/
    @JsonProperty("name")
    public String name;

    /*
     * barcode
     **/
    @JsonProperty("ean")
    public String ean;

    /*
     * Additional Description
     **/
    @JsonProperty("short_description")
    public String shortDescription;

    /*
     * id
     **/
    @JsonProperty("external")
    public String external;

    /*
     * taxProduct->cest
     **/
    @JsonProperty("cest")
    public String cest;

    /*
     * StockProduct->costPrice
     **/
    @JsonProperty("cost")
    public String cost;

}
