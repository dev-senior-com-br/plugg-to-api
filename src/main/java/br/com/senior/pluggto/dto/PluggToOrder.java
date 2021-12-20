package br.com.senior.pluggto.dto;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.apache.camel.component.jackson.JacksonDataFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection(serialization = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class PluggToOrder {

    public static final JacksonDataFormat PLUGG_TO_ORDER_FORMAT = new JacksonDataFormat(PluggToOrder.class);

    @JsonProperty("tags")
    public Map<String, String> tags;
    @JsonProperty("commmission")
    public PluggToCommission commmission;
    @JsonProperty("status_history")
    public List<Object> statusHistory;
    @JsonProperty("substatus_history")
    public List<Object> subStatusHistory;
    @JsonProperty("log_history")
    public List<Object> logHistory;
    @JsonProperty("log_permanent")
    public List<Object> logPermanent;
    @JsonProperty("payments")
    public List<PluggToPayment> payments;
    @JsonProperty("items")
    public List<PluggToOrderItem> items;
    @JsonProperty("shipments")
    public List<PluggToShipment> shipments;
    @JsonProperty("channel")
    public String channel;
    @JsonProperty("receiver_name")
    public String receiverName;
    @JsonProperty("receiver_cpf")
    public String receiverCpf;
    @JsonProperty("receiver_lastname")
    public String receiverLastName;
    @JsonProperty("receiver_address_number")
    public String receiverAddressNumber;
    @JsonProperty("receiver_address")
    public String receiverAddress;
    @JsonProperty("receiver_address_complement")
    public String receiverAddressComplement;
    @JsonProperty("receiver_address_reference")
    public String receiverAddressReference;
    @JsonProperty("receiver_city")
    public String receiverCity;
    @JsonProperty("receiver_state")
    public String receiverState;
    @JsonProperty("receiver_email")
    public String receiverEmail;
    @JsonProperty("receiver_zipcode")
    public String receiverZipCode;
    @JsonProperty("receiver_phone")
    public String receiverPhone;
    @JsonProperty("receiver_phone_area")
    public String receiverPhoneArea;
    @JsonProperty("receiver_neighborhood")
    public String receiverNeighborhood;
    @JsonProperty("payer_name")
    public String payerName;
    @JsonProperty("payer_lastname")
    public String payerLastName;
    @JsonProperty("payer_address")
    public String payerAddress;
    @JsonProperty("payer_address_number")
    public String payerAddressNumber;
    @JsonProperty("payer_address_complement")
    public String payerAddressComplement;
    @JsonProperty("payer_additional_info")
    public String payerAdditionalInfo;
    @JsonProperty("payer_neighborhood")
    public String payerNeighborhood;
    @JsonProperty("payer_city")
    public String payerCity;
    @JsonProperty("payer_state")
    public String payerState;
    @JsonProperty("payer_zipcode")
    public String payerZipCode;
    @JsonProperty("payer_phone_area")
    public String payerPhoneArea;
    @JsonProperty("payer_phone")
    public String payerPhone;
    @JsonProperty("payer_cpf")
    public String payerCpf;
    @JsonProperty("payer_razao_social")
    public String payerCorporateName;
    @JsonProperty("payer_email")
    public String payerEmail;
    @JsonProperty("total")
    public BigDecimal total;
    @JsonProperty("total_paid")
    public BigDecimal totalPaid;
    @JsonProperty("shipping")
    public Long shipping;
    @JsonProperty("subtotal")
    public BigDecimal subTotal;
    @JsonProperty("status")
    public String status;
    @JsonProperty("external")
    public Map<String, String> external;
    @JsonProperty("original_id")
    public String originalId;
    @JsonProperty("user_id")
    public String userId;
    @JsonProperty("created")
    public String created;
    @JsonProperty("created_by")
    public String createdBy;
    @JsonProperty("ack")
    public Boolean ack;
    @JsonProperty("modified")
    public String modified;
    @JsonProperty("modified_by")
    public String modifiedBy;
    @JsonProperty("timestamp")
    public Long timestamp;
    @JsonProperty("expected_send_date")
    public String expectedSendDate;
    @JsonProperty("order_id")
    public Long orderId;
    @JsonProperty("user_client_id")
    public String userClientId;
    @JsonProperty("input_service")
    public String inputService;
    @JsonProperty("sub_status")
    public String subStatus;
    @JsonProperty("discount")
    public String discount;
    @JsonProperty("discount_description")
    public String discountDescription;
    @JsonProperty("channel_account")
    public String channelAccount;
    @JsonProperty("currency")
    public String currency;
    @JsonProperty("receiver_additional_info")
    public String receiverAdditionalInfo;
    @JsonProperty("receiver_country")
    public String receiverCountry;
    @JsonProperty("receiver_phone2_area")
    public String receiverPhone2Area;
    @JsonProperty("receiver_phone2")
    public String receiverPhone2;
    @JsonProperty("expected_delivery_date")
    public String expectedDeliveryDate;
    @JsonProperty("receiver_schedule_date")
    public String receiverScheduleDate;
    @JsonProperty("receiver_schedule_period")
    public String receiverSchedulePeriod;
    @JsonProperty("delivery_type")
    public String deliveryType;
    @JsonProperty("payer_fullname")
    public String payerFullName;
    @JsonProperty("payer_gender")
    public String payerGender;
    @JsonProperty("payer_address_reference")
    public String payerAddressReference;
    @JsonProperty("payer_country")
    public String payerCountry;
    @JsonProperty("payer_phone2_area")
    public String payerPhone2Area;
    @JsonProperty("payer_phone2")
    public String payerPhone2;
    @JsonProperty("payer_schedule_date")
    public String payerScheduleDate;
    @JsonProperty("payer_schedule_period")
    public String payerSchedulePeriod;
    @JsonProperty("payer_cnpj")
    public String payerCnpj;
    @JsonProperty("payer_ie")
    public String payerIe;
    @JsonProperty("payer_im")
    public String payerIm;
    @JsonProperty("payer_tax_id")
    public String payerTaxId;
    @JsonProperty("payer_document")
    public String payerDocument;
    @JsonProperty("payer_company_name")
    public String payerCompanyName;
    @JsonProperty("deleted")
    public String deleted;
    @JsonProperty("comission")
    public String comission;
    @JsonProperty("sale_intermediary")
    public String saleIntermediary;
    @JsonProperty("payment_intermediary")
    public String paymentIntermediary;
    @JsonProperty("intermediary_seller_id")
    public String intermediarySellerId;
    @JsonProperty("invoicing_accepted")
    public String invoicingAccepted;
    @JsonProperty("invoicing_accepted_date")
    public String invoicingAcceptedDate;
    @JsonProperty("shipping_accepted")
    public String shippingAccepted;
    @JsonProperty("shipping_accepted_date")
    public String shippingAcceptedDate;
    @JsonProperty("delivery_accepted")
    public String deliveryAccepted;
    @JsonProperty("delivery_accepted_date")
    public String deliveryAcceptedDate;
    @JsonProperty("invoicing_informed")
    public String invoicingInformed;
    @JsonProperty("invoicing_informed_date")
    public String invoicingInformedDate;
    @JsonProperty("shipping_informed")
    public String shipping_informed;
    @JsonProperty("shipping_informed_date")
    public String shipping_informedDate;
    @JsonProperty("delivery_informed")
    public String deliveryInformed;
    @JsonProperty("delivery_informed_date")
    public String deliveryInformedDate;
    @JsonProperty("sla_ship")
    public String slaShip;
    @JsonProperty("sla_delivery")
    public String slaDelivery;
    @JsonProperty("label_printed")
    public String labelPrinted;
    @JsonProperty("auto_reserve")
    public String autoReserve;
    @JsonProperty("id")
    public String id;
}
