package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for SessionResponse model.
 */
public class SessionResponseTest {

    private SessionResponse instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new SessionResponse();
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
        SessionResponse a = new SessionResponse();
        SessionResponse b = new SessionResponse();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        SessionResponse a = new SessionResponse();
        SessionResponse b = new SessionResponse();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class SessionResponse"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        SessionResponse deserialized = objectMapper.readValue(json, SessionResponse.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_tracingId() {
        SessionResponse result = instance.tracingId(null);
        assertSame(instance, result, "Fluent setter for tracingId should return the same instance");
    }

    @Test
    public void testFluentSetter_connected() {
        SessionResponse result = instance.connected(null);
        assertSame(instance, result, "Fluent setter for connected should return the same instance");
    }

    @Test
    public void testFluentSetter_newSession() {
        SessionResponse result = instance.newSession(null);
        assertSame(instance, result, "Fluent setter for newSession should return the same instance");
    }

    @Test
    public void testFluentSetter_readOnly() {
        SessionResponse result = instance.readOnly(null);
        assertSame(instance, result, "Fluent setter for readOnly should return the same instance");
    }

    @Test
    public void testFluentSetter_clearedExistingSession() {
        SessionResponse result = instance.clearedExistingSession(null);
        assertSame(instance, result, "Fluent setter for clearedExistingSession should return the same instance");
    }

    @Test
    public void testFluentSetter_allowedMedia() {
        SessionResponse result = instance.allowedMedia(null);
        assertSame(instance, result, "Fluent setter for allowedMedia should return the same instance");
    }

    @Test
    public void testFluentSetter_blockedExtensions() {
        SessionResponse result = instance.blockedExtensions(null);
        assertSame(instance, result, "Fluent setter for blockedExtensions should return the same instance");
    }

    @Test
    public void testFluentSetter_maxCustomDataBytes() {
        SessionResponse result = instance.maxCustomDataBytes(null);
        assertSame(instance, result, "Fluent setter for maxCustomDataBytes should return the same instance");
    }

    @Test
    public void testFluentSetter_durationSeconds() {
        SessionResponse result = instance.durationSeconds(null);
        assertSame(instance, result, "Fluent setter for durationSeconds should return the same instance");
    }

    @Test
    public void testFluentSetter_expirationDate() {
        SessionResponse result = instance.expirationDate(null);
        assertSame(instance, result, "Fluent setter for expirationDate should return the same instance");
    }

    @Test
    public void testFluentSetter_autoStarted() {
        SessionResponse result = instance.autoStarted(null);
        assertSame(instance, result, "Fluent setter for autoStarted should return the same instance");
    }
}
