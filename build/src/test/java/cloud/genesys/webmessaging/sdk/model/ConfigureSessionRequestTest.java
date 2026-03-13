package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for ConfigureSessionRequest model.
 */
public class ConfigureSessionRequestTest {

    private ConfigureSessionRequest instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new ConfigureSessionRequest();
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
        ConfigureSessionRequest a = new ConfigureSessionRequest();
        ConfigureSessionRequest b = new ConfigureSessionRequest();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        ConfigureSessionRequest a = new ConfigureSessionRequest();
        ConfigureSessionRequest b = new ConfigureSessionRequest();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class ConfigureSessionRequest"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        ConfigureSessionRequest deserialized = objectMapper.readValue(json, ConfigureSessionRequest.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_action() {
        ConfigureSessionRequest result = instance.action(null);
        assertSame(instance, result, "Fluent setter for action should return the same instance");
    }

    @Test
    public void testFluentSetter_token() {
        ConfigureSessionRequest result = instance.token(null);
        assertSame(instance, result, "Fluent setter for token should return the same instance");
    }

    @Test
    public void testFluentSetter_tracingId() {
        ConfigureSessionRequest result = instance.tracingId(null);
        assertSame(instance, result, "Fluent setter for tracingId should return the same instance");
    }

    @Test
    public void testFluentSetter_deploymentId() {
        ConfigureSessionRequest result = instance.deploymentId(null);
        assertSame(instance, result, "Fluent setter for deploymentId should return the same instance");
    }

    @Test
    public void testFluentSetter_journeyContext() {
        ConfigureSessionRequest result = instance.journeyContext(null);
        assertSame(instance, result, "Fluent setter for journeyContext should return the same instance");
    }

    @Test
    public void testFluentSetter_resumeToken() {
        ConfigureSessionRequest result = instance.resumeToken(null);
        assertSame(instance, result, "Fluent setter for resumeToken should return the same instance");
    }

    @Test
    public void testFluentSetter_startNew() {
        ConfigureSessionRequest result = instance.startNew(null);
        assertSame(instance, result, "Fluent setter for startNew should return the same instance");
    }
}
