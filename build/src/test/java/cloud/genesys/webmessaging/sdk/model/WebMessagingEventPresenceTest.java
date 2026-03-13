package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for WebMessagingEventPresence model.
 */
public class WebMessagingEventPresenceTest {

    private WebMessagingEventPresence instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new WebMessagingEventPresence();
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
        WebMessagingEventPresence a = new WebMessagingEventPresence();
        WebMessagingEventPresence b = new WebMessagingEventPresence();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        WebMessagingEventPresence a = new WebMessagingEventPresence();
        WebMessagingEventPresence b = new WebMessagingEventPresence();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class WebMessagingEventPresence"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        WebMessagingEventPresence deserialized = objectMapper.readValue(json, WebMessagingEventPresence.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_type() {
        WebMessagingEventPresence result = instance.type(null);
        assertSame(instance, result, "Fluent setter for type should return the same instance");
    }
}
