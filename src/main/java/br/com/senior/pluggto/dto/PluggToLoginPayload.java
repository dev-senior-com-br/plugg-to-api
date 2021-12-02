package br.com.senior.pluggto.dto;

import org.apache.camel.component.jackson.JacksonDataFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection(serialization = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PluggToLoginPayload {

    public static final JacksonDataFormat PLUGG_TO_LOGIN_FORMAT = new JacksonDataFormat(PluggToLoginPayload.class);

    @JsonProperty("client_id")
    public String clientId;
    @JsonProperty("client_secret")
    public String clientSecret;
    @JsonProperty("username")
    public String userName;
    public String password; // NOSONAR
    @JsonProperty("grant_type")
    public String grantType = "password";

    public String asFormUrlEncoded() {
        return String.format("client_id=%s&" //
                + "client_secret=%s&" //
                + "username=%s&" //
                + "password=%s&" //
                + "grant_type=%s" //
                , clientId, clientSecret, userName, password, grantType);
    }

}
