package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for EventTyping model.
 */
public class EventTypingTest {

    private EventTyping instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new EventTyping();
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
        EventTyping a = new EventTyping();
        EventTyping b = new EventTyping();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        EventTyping a = new EventTyping();
        EventTyping b = new EventTyping();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class EventTyping"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        EventTyping deserialized = objectMapper.readValue(json, EventTyping.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_duration() {
        EventTyping result = instance.duration(null);
        assertSame(instance, result, "Fluent setter for duration should return the same instance");
    }

    @Test
    public void testFluentSetter_type() {
        EventTyping result = instance.type(null);
        assertSame(instance, result, "Fluent setter for type should return the same instance");
    }
}
