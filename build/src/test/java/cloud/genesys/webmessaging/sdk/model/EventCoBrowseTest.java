package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for EventCoBrowse model.
 */
public class EventCoBrowseTest {

    private EventCoBrowse instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new EventCoBrowse();
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
        EventCoBrowse a = new EventCoBrowse();
        EventCoBrowse b = new EventCoBrowse();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        EventCoBrowse a = new EventCoBrowse();
        EventCoBrowse b = new EventCoBrowse();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class EventCoBrowse"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        EventCoBrowse deserialized = objectMapper.readValue(json, EventCoBrowse.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_sessionId() {
        EventCoBrowse result = instance.sessionId(null);
        assertSame(instance, result, "Fluent setter for sessionId should return the same instance");
    }

    @Test
    public void testFluentSetter_sessionJoinToken() {
        EventCoBrowse result = instance.sessionJoinToken(null);
        assertSame(instance, result, "Fluent setter for sessionJoinToken should return the same instance");
    }

    @Test
    public void testFluentSetter_type() {
        EventCoBrowse result = instance.type(null);
        assertSame(instance, result, "Fluent setter for type should return the same instance");
    }
}
