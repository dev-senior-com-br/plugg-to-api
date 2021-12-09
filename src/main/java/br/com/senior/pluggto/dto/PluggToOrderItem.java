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

    public PluggToCommission commission;
    public PluggToOrderItemVariation variation;
    public String name;
    public String sku;
    public Long quantity;
    public BigDecimal price;
    public BigDecimal total;
    @JsonProperty("original_sku")
    public String originalSku;
    public String id;
    public String location;
    public String discount;
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
