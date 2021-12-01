package br.com.senior.pluggto.dto;

import org.apache.camel.component.jackson.JacksonDataFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection(serialization = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PluggToProduct {

    public static final JacksonDataFormat PLUGG_TO_PRODUCT_FORMAT = new JacksonDataFormat(PluggToProduct.class);

    /*
     * Code
     **/
    public String sku;

    /*
     * Description
     **/
    public String name;

    /*
     * barcode
     **/
    public String ean;

    /*
     * Additional Description
     **/
    @JsonProperty("short_description")
    public String shortDescription;

    /*
     * id
     **/
    public String external;

    /*
     * taxProduct->cest
     **/
    public String cest;

    /*
     * StockProduct->costPrice
     **/
    public String cost;

}
