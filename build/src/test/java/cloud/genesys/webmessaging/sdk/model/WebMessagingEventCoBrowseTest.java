package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for WebMessagingEventCoBrowse model.
 */
public class WebMessagingEventCoBrowseTest {

    private WebMessagingEventCoBrowse instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new WebMessagingEventCoBrowse();
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
        WebMessagingEventCoBrowse a = new WebMessagingEventCoBrowse();
        WebMessagingEventCoBrowse b = new WebMessagingEventCoBrowse();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        WebMessagingEventCoBrowse a = new WebMessagingEventCoBrowse();
        WebMessagingEventCoBrowse b = new WebMessagingEventCoBrowse();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class WebMessagingEventCoBrowse"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        WebMessagingEventCoBrowse deserialized = objectMapper.readValue(json, WebMessagingEventCoBrowse.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_type() {
        WebMessagingEventCoBrowse result = instance.type(null);
        assertSame(instance, result, "Fluent setter for type should return the same instance");
    }

    @Test
    public void testFluentSetter_sessionId() {
        WebMessagingEventCoBrowse result = instance.sessionId(null);
        assertSame(instance, result, "Fluent setter for sessionId should return the same instance");
    }

    @Test
    public void testFluentSetter_sessionJoinToken() {
        WebMessagingEventCoBrowse result = instance.sessionJoinToken(null);
        assertSame(instance, result, "Fluent setter for sessionJoinToken should return the same instance");
    }
}
