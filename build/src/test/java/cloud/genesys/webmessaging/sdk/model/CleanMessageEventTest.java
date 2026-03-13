package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for CleanMessageEvent model.
 */
public class CleanMessageEventTest {

    private CleanMessageEvent instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new CleanMessageEvent();
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
        CleanMessageEvent a = new CleanMessageEvent();
        CleanMessageEvent b = new CleanMessageEvent();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        CleanMessageEvent a = new CleanMessageEvent();
        CleanMessageEvent b = new CleanMessageEvent();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class CleanMessageEvent"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        CleanMessageEvent deserialized = objectMapper.readValue(json, CleanMessageEvent.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_coBrowse() {
        CleanMessageEvent result = instance.coBrowse(null);
        assertSame(instance, result, "Fluent setter for coBrowse should return the same instance");
    }

    @Test
    public void testFluentSetter_eventType() {
        CleanMessageEvent result = instance.eventType(null);
        assertSame(instance, result, "Fluent setter for eventType should return the same instance");
    }

    @Test
    public void testFluentSetter_presence() {
        CleanMessageEvent result = instance.presence(null);
        assertSame(instance, result, "Fluent setter for presence should return the same instance");
    }

    @Test
    public void testFluentSetter_reactions() {
        CleanMessageEvent result = instance.reactions(null);
        assertSame(instance, result, "Fluent setter for reactions should return the same instance");
    }

    @Test
    public void testFluentSetter_typing() {
        CleanMessageEvent result = instance.typing(null);
        assertSame(instance, result, "Fluent setter for typing should return the same instance");
    }

    @Test
    public void testFluentSetter_video() {
        CleanMessageEvent result = instance.video(null);
        assertSame(instance, result, "Fluent setter for video should return the same instance");
    }
}
