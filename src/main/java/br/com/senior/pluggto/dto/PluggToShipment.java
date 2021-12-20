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
public class PluggToShipment {

    public static final JacksonDataFormat PLUGG_TO_SHIPMENT_FORMAT = new JacksonDataFormat(PluggToShipment.class);

    @JsonProperty("label_info")
    public PluggToLabelInfo labelInfo;
    @JsonProperty("issues")
    public List<Object> issues;
    @JsonProperty("shipping_items")
    public List<Object> shippingItems;
    @JsonProperty("documents")
    public List<Object> documents;
    @JsonProperty("shipping_method")
    public String shippingMethod;
    @JsonProperty("shipping_company")
    public String shippingCompany;
    @JsonProperty("estimate_delivery_date")
    public String estimateDeliveryDate;
    @JsonProperty("external")
    public String external;
    @JsonProperty("error_message")
    public String errorMessage;
    @JsonProperty("quote")
    public String quote;
    @JsonProperty("shipping_method_id")
    public String shippingMethodId;
    @JsonProperty("description")
    public String description;
    @JsonProperty("track_code")
    public String trackCode;
    @JsonProperty("track_url")
    public String trackUrl;
    @JsonProperty("status")
    public String status;
    @JsonProperty("comment")
    public String comment;
    @JsonProperty("date_shipped")
    public String dateShipped;
    @JsonProperty("date_delivered")
    public String dateDelivered;
    @JsonProperty("date_cancelled")
    public String dateCancelled;
    @JsonProperty("nfe_key")
    public String nfeKey;
    @JsonProperty("nfe_link")
    public String nfeLink;
    @JsonProperty("nfe_number")
    public String nfeNumber;
    @JsonProperty("nfe_serie")
    public String nfeSerie;
    @JsonProperty("nfe_date")
    public String nfeDate;
    @JsonProperty("cfops")
    public String cfops;
    @JsonProperty("printed")
    public String printed;
    @JsonProperty("label_type")
    public String labelType;
    @JsonProperty("id")
    public String id;

}
