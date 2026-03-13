package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for ContentQuickReply model.
 */
public class ContentQuickReplyTest {

    private ContentQuickReply instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new ContentQuickReply();
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
        ContentQuickReply a = new ContentQuickReply();
        ContentQuickReply b = new ContentQuickReply();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        ContentQuickReply a = new ContentQuickReply();
        ContentQuickReply b = new ContentQuickReply();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class ContentQuickReply"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        ContentQuickReply deserialized = objectMapper.readValue(json, ContentQuickReply.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_action() {
        ContentQuickReply result = instance.action(null);
        assertSame(instance, result, "Fluent setter for action should return the same instance");
    }

    @Test
    public void testFluentSetter_id() {
        ContentQuickReply result = instance.id(null);
        assertSame(instance, result, "Fluent setter for id should return the same instance");
    }

    @Test
    public void testFluentSetter_image() {
        ContentQuickReply result = instance.image(null);
        assertSame(instance, result, "Fluent setter for image should return the same instance");
    }

    @Test
    public void testFluentSetter_payload() {
        ContentQuickReply result = instance.payload(null);
        assertSame(instance, result, "Fluent setter for payload should return the same instance");
    }

    @Test
    public void testFluentSetter_summaryText() {
        ContentQuickReply result = instance.summaryText(null);
        assertSame(instance, result, "Fluent setter for summaryText should return the same instance");
    }

    @Test
    public void testFluentSetter_text() {
        ContentQuickReply result = instance.text(null);
        assertSame(instance, result, "Fluent setter for text should return the same instance");
    }
}
