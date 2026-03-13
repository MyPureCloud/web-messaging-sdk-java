package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for ConfigureAuthenticatedSessionRequest model.
 */
public class ConfigureAuthenticatedSessionRequestTest {

    private ConfigureAuthenticatedSessionRequest instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new ConfigureAuthenticatedSessionRequest();
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
        ConfigureAuthenticatedSessionRequest a = new ConfigureAuthenticatedSessionRequest();
        ConfigureAuthenticatedSessionRequest b = new ConfigureAuthenticatedSessionRequest();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        ConfigureAuthenticatedSessionRequest a = new ConfigureAuthenticatedSessionRequest();
        ConfigureAuthenticatedSessionRequest b = new ConfigureAuthenticatedSessionRequest();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class ConfigureAuthenticatedSessionRequest"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        ConfigureAuthenticatedSessionRequest deserialized = objectMapper.readValue(json, ConfigureAuthenticatedSessionRequest.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_action() {
        ConfigureAuthenticatedSessionRequest result = instance.action(null);
        assertSame(instance, result, "Fluent setter for action should return the same instance");
    }

    @Test
    public void testFluentSetter_token() {
        ConfigureAuthenticatedSessionRequest result = instance.token(null);
        assertSame(instance, result, "Fluent setter for token should return the same instance");
    }

    @Test
    public void testFluentSetter_tracingId() {
        ConfigureAuthenticatedSessionRequest result = instance.tracingId(null);
        assertSame(instance, result, "Fluent setter for tracingId should return the same instance");
    }

    @Test
    public void testFluentSetter_deploymentId() {
        ConfigureAuthenticatedSessionRequest result = instance.deploymentId(null);
        assertSame(instance, result, "Fluent setter for deploymentId should return the same instance");
    }

    @Test
    public void testFluentSetter_data() {
        ConfigureAuthenticatedSessionRequest result = instance.data(null);
        assertSame(instance, result, "Fluent setter for data should return the same instance");
    }

    @Test
    public void testFluentSetter_resumeToken() {
        ConfigureAuthenticatedSessionRequest result = instance.resumeToken(null);
        assertSame(instance, result, "Fluent setter for resumeToken should return the same instance");
    }

    @Test
    public void testFluentSetter_startNew() {
        ConfigureAuthenticatedSessionRequest result = instance.startNew(null);
        assertSame(instance, result, "Fluent setter for startNew should return the same instance");
    }
}
