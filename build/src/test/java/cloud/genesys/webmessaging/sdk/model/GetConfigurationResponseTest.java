package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for GetConfigurationResponse model.
 */
public class GetConfigurationResponseTest {

    private GetConfigurationResponse instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new GetConfigurationResponse();
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
        GetConfigurationResponse a = new GetConfigurationResponse();
        GetConfigurationResponse b = new GetConfigurationResponse();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        GetConfigurationResponse a = new GetConfigurationResponse();
        GetConfigurationResponse b = new GetConfigurationResponse();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class GetConfigurationResponse"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        GetConfigurationResponse deserialized = objectMapper.readValue(json, GetConfigurationResponse.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_tracingId() {
        GetConfigurationResponse result = instance.tracingId(null);
        assertSame(instance, result, "Fluent setter for tracingId should return the same instance");
    }

    @Test
    public void testFluentSetter_allowedMedia() {
        GetConfigurationResponse result = instance.allowedMedia(null);
        assertSame(instance, result, "Fluent setter for allowedMedia should return the same instance");
    }

    @Test
    public void testFluentSetter_blockedExtensions() {
        GetConfigurationResponse result = instance.blockedExtensions(null);
        assertSame(instance, result, "Fluent setter for blockedExtensions should return the same instance");
    }

    @Test
    public void testFluentSetter_maxCustomDataBytes() {
        GetConfigurationResponse result = instance.maxCustomDataBytes(null);
        assertSame(instance, result, "Fluent setter for maxCustomDataBytes should return the same instance");
    }

    @Test
    public void testFluentSetter_messageRoutingEnabled() {
        GetConfigurationResponse result = instance.messageRoutingEnabled(null);
        assertSame(instance, result, "Fluent setter for messageRoutingEnabled should return the same instance");
    }

    @Test
    public void testFluentSetter_sessionDurationSeconds() {
        GetConfigurationResponse result = instance.sessionDurationSeconds(null);
        assertSame(instance, result, "Fluent setter for sessionDurationSeconds should return the same instance");
    }
}
