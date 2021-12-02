package br.com.senior.pluggto.dto;

import java.math.BigDecimal;

import org.apache.camel.component.jackson.JacksonDataFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection(serialization = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PluggToPayment {

    public static final JacksonDataFormat PLUGG_TO_PAYMENT_FORMAT = new JacksonDataFormat(PluggToPayment.class);

    @JsonProperty("payment_total")
    public BigDecimal paymentTotal;
    @JsonProperty("payment_type")
    public String paymentType;
    @JsonProperty("payment_method")
    public String paymentMethod;
    @JsonProperty("payment_installments")
    public String paymentInstallments;
    @JsonProperty("payment_quota")
    public BigDecimal paymentQuota;
    @JsonProperty("payment_additional_info")
    public String paymentAdditionalInfo;
    @JsonProperty("payment_interest")
    public String paymentInterest;
    public String external;
    public String id;
}
