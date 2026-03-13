package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for WebMessagingQuickReply model.
 */
public class WebMessagingQuickReplyTest {

    private WebMessagingQuickReply instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new WebMessagingQuickReply();
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
        WebMessagingQuickReply a = new WebMessagingQuickReply();
        WebMessagingQuickReply b = new WebMessagingQuickReply();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        WebMessagingQuickReply a = new WebMessagingQuickReply();
        WebMessagingQuickReply b = new WebMessagingQuickReply();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class WebMessagingQuickReply"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        WebMessagingQuickReply deserialized = objectMapper.readValue(json, WebMessagingQuickReply.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_text() {
        WebMessagingQuickReply result = instance.text(null);
        assertSame(instance, result, "Fluent setter for text should return the same instance");
    }

    @Test
    public void testFluentSetter_payload() {
        WebMessagingQuickReply result = instance.payload(null);
        assertSame(instance, result, "Fluent setter for payload should return the same instance");
    }

    @Test
    public void testFluentSetter_image() {
        WebMessagingQuickReply result = instance.image(null);
        assertSame(instance, result, "Fluent setter for image should return the same instance");
    }

    @Test
    public void testFluentSetter_action() {
        WebMessagingQuickReply result = instance.action(null);
        assertSame(instance, result, "Fluent setter for action should return the same instance");
    }
}
