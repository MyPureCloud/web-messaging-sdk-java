package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for GetConfigurationRequest model.
 */
public class GetConfigurationRequestTest {

    private GetConfigurationRequest instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new GetConfigurationRequest();
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
        GetConfigurationRequest a = new GetConfigurationRequest();
        GetConfigurationRequest b = new GetConfigurationRequest();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        GetConfigurationRequest a = new GetConfigurationRequest();
        GetConfigurationRequest b = new GetConfigurationRequest();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class GetConfigurationRequest"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        GetConfigurationRequest deserialized = objectMapper.readValue(json, GetConfigurationRequest.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_action() {
        GetConfigurationRequest result = instance.action(null);
        assertSame(instance, result, "Fluent setter for action should return the same instance");
    }

    @Test
    public void testFluentSetter_token() {
        GetConfigurationRequest result = instance.token(null);
        assertSame(instance, result, "Fluent setter for token should return the same instance");
    }

    @Test
    public void testFluentSetter_tracingId() {
        GetConfigurationRequest result = instance.tracingId(null);
        assertSame(instance, result, "Fluent setter for tracingId should return the same instance");
    }

    @Test
    public void testFluentSetter_deploymentId() {
        GetConfigurationRequest result = instance.deploymentId(null);
        assertSame(instance, result, "Fluent setter for deploymentId should return the same instance");
    }
}
