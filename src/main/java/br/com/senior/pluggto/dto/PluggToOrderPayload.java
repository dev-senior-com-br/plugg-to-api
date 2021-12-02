package br.com.senior.pluggto.dto;

import org.apache.camel.component.jackson.JacksonDataFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection(serialization = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PluggToOrderPayload {

    public static final JacksonDataFormat PLUGG_TO_ORDER_PAYLOAD_FORMAT = new JacksonDataFormat(PluggToOrderPayload.class);

    @JsonProperty("Order")
    public PluggToOrder order;

}
