package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for EventPresence model.
 */
public class EventPresenceTest {

    private EventPresence instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new EventPresence();
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
        EventPresence a = new EventPresence();
        EventPresence b = new EventPresence();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        EventPresence a = new EventPresence();
        EventPresence b = new EventPresence();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class EventPresence"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        EventPresence deserialized = objectMapper.readValue(json, EventPresence.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_receivedMessage() {
        EventPresence result = instance.receivedMessage(null);
        assertSame(instance, result, "Fluent setter for receivedMessage should return the same instance");
    }

    @Test
    public void testFluentSetter_replyMessage() {
        EventPresence result = instance.replyMessage(null);
        assertSame(instance, result, "Fluent setter for replyMessage should return the same instance");
    }

    @Test
    public void testFluentSetter_type() {
        EventPresence result = instance.type(null);
        assertSame(instance, result, "Fluent setter for type should return the same instance");
    }
}
