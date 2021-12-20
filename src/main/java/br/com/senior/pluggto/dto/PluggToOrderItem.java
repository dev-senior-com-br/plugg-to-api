package br.com.senior.pluggto.dto;

import java.math.BigDecimal;

import org.apache.camel.component.jackson.JacksonDataFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection(serialization = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class PluggToOrderItem {

    public static final JacksonDataFormat PLUGG_TO_ORDER_ITEM_FORMAT = new JacksonDataFormat(PluggToOrderItem.class);

    @JsonProperty("commission")
    public PluggToCommission commission;
    @JsonProperty("variation")
    public PluggToOrderItemVariation variation;
    @JsonProperty("name")
    public String name;
    @JsonProperty("sku")
    public String sku;
    @JsonProperty("quantity")
    public Long quantity;
    @JsonProperty("price")
    public BigDecimal price;
    @JsonProperty("total")
    public BigDecimal total;
    @JsonProperty("original_sku")
    public String originalSku;
    @JsonProperty("id")
    public String id;
    @JsonProperty("location")
    public String location;
    @JsonProperty("discount")
    public String discount;
    @JsonProperty("external")
    public String external;
    @JsonProperty("supplier_id")
    public String supplierId;
    @JsonProperty("stock_code")
    public String stockCode;
    @JsonProperty("place_code")
    public String placeCode;
    @JsonProperty("price_code")
    public String priceCode;
    @JsonProperty("shipping_cost")
    public String shippingCost;
    @JsonProperty("photo_url")
    public String photoUrl;

}
