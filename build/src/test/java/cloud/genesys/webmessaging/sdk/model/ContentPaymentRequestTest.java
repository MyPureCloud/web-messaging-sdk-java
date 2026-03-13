package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for ContentPaymentRequest model.
 */
public class ContentPaymentRequestTest {

    private ContentPaymentRequest instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new ContentPaymentRequest();
        objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
    }

    @Test
    public void testConstruction() {
        assertNotNull(instance);
    }

    @Test
    public void testEqualsSameInstance() {
        assertEquals(instance, instance);
    }

    @Test
    public void testEqualsNull() {
        assertNotEquals(instance, null);
    }

    @Test
    public void testEqualsDifferentType() {
        assertNotEquals(instance, "a string");
    }

    @Test
    public void testEqualsEmptyInstances() {
        ContentPaymentRequest a = new ContentPaymentRequest();
        ContentPaymentRequest b = new ContentPaymentRequest();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        ContentPaymentRequest a = new ContentPaymentRequest();
        ContentPaymentRequest b = new ContentPaymentRequest();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class ContentPaymentRequest"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        ContentPaymentRequest deserialized = objectMapper.readValue(json, ContentPaymentRequest.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_countryCode() {
        ContentPaymentRequest result = instance.countryCode(null);
        assertSame(instance, result, "Fluent setter for countryCode should return the same instance");
    }

    @Test
    public void testFluentSetter_currencyCode() {
        ContentPaymentRequest result = instance.currencyCode(null);
        assertSame(instance, result, "Fluent setter for currencyCode should return the same instance");
    }

    @Test
    public void testFluentSetter_lineItems() {
        ContentPaymentRequest result = instance.lineItems(null);
        assertSame(instance, result, "Fluent setter for lineItems should return the same instance");
    }

    @Test
    public void testFluentSetter_orderTotal() {
        ContentPaymentRequest result = instance.orderTotal(null);
        assertSame(instance, result, "Fluent setter for orderTotal should return the same instance");
    }

    @Test
    public void testFluentSetter_paymentPlatform() {
        ContentPaymentRequest result = instance.paymentPlatform(null);
        assertSame(instance, result, "Fluent setter for paymentPlatform should return the same instance");
    }

    @Test
    public void testFluentSetter_receivedMessage() {
        ContentPaymentRequest result = instance.receivedMessage(null);
        assertSame(instance, result, "Fluent setter for receivedMessage should return the same instance");
    }

    @Test
    public void testFluentSetter_replyMessage() {
        ContentPaymentRequest result = instance.replyMessage(null);
        assertSame(instance, result, "Fluent setter for replyMessage should return the same instance");
    }

    @Test
    public void testFluentSetter_requiredContactFields() {
        ContentPaymentRequest result = instance.requiredContactFields(null);
        assertSame(instance, result, "Fluent setter for requiredContactFields should return the same instance");
    }

    @Test
    public void testFluentSetter_shippingOptions() {
        ContentPaymentRequest result = instance.shippingOptions(null);
        assertSame(instance, result, "Fluent setter for shippingOptions should return the same instance");
    }
}
