package br.com.senior.pluggto.dto;

import org.apache.camel.component.jackson.JacksonDataFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection(serialization = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PluggToToken {

    public static final JacksonDataFormat PLUGG_TO_TOKEN_FORMAT = new JacksonDataFormat(PluggToToken.class);

    @JsonProperty("expires_in")
    public Long expiresIn;

    @JsonProperty("token_type")
    public String tokenType;

    @JsonProperty("access_token")
    public String accessToken;

    @JsonProperty("refresh_token")
    public String refreshToken;

}
