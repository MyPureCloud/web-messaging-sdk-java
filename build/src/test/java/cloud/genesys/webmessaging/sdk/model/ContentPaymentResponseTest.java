package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for ContentPaymentResponse model.
 */
public class ContentPaymentResponseTest {

    private ContentPaymentResponse instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new ContentPaymentResponse();
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
        ContentPaymentResponse a = new ContentPaymentResponse();
        ContentPaymentResponse b = new ContentPaymentResponse();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        ContentPaymentResponse a = new ContentPaymentResponse();
        ContentPaymentResponse b = new ContentPaymentResponse();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class ContentPaymentResponse"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        ContentPaymentResponse deserialized = objectMapper.readValue(json, ContentPaymentResponse.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_failureReason() {
        ContentPaymentResponse result = instance.failureReason(null);
        assertSame(instance, result, "Fluent setter for failureReason should return the same instance");
    }

    @Test
    public void testFluentSetter_originatingMessageId() {
        ContentPaymentResponse result = instance.originatingMessageId(null);
        assertSame(instance, result, "Fluent setter for originatingMessageId should return the same instance");
    }

    @Test
    public void testFluentSetter_paymentStatus() {
        ContentPaymentResponse result = instance.paymentStatus(null);
        assertSame(instance, result, "Fluent setter for paymentStatus should return the same instance");
    }
}
