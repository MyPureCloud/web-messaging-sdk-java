package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for WebMessagingMessage model.
 */
public class WebMessagingMessageTest {

    private WebMessagingMessage instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new WebMessagingMessage();
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
        WebMessagingMessage a = new WebMessagingMessage();
        WebMessagingMessage b = new WebMessagingMessage();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        WebMessagingMessage a = new WebMessagingMessage();
        WebMessagingMessage b = new WebMessagingMessage();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class WebMessagingMessage"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        WebMessagingMessage deserialized = objectMapper.readValue(json, WebMessagingMessage.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_id() {
        WebMessagingMessage result = instance.id(null);
        assertSame(instance, result, "Fluent setter for id should return the same instance");
    }

    @Test
    public void testFluentSetter_channel() {
        WebMessagingMessage result = instance.channel(null);
        assertSame(instance, result, "Fluent setter for channel should return the same instance");
    }

    @Test
    public void testFluentSetter_type() {
        WebMessagingMessage result = instance.type(null);
        assertSame(instance, result, "Fluent setter for type should return the same instance");
    }

    @Test
    public void testFluentSetter_text() {
        WebMessagingMessage result = instance.text(null);
        assertSame(instance, result, "Fluent setter for text should return the same instance");
    }

    @Test
    public void testFluentSetter_content() {
        WebMessagingMessage result = instance.content(null);
        assertSame(instance, result, "Fluent setter for content should return the same instance");
    }

    @Test
    public void testFluentSetter_events() {
        WebMessagingMessage result = instance.events(null);
        assertSame(instance, result, "Fluent setter for events should return the same instance");
    }

    @Test
    public void testFluentSetter_direction() {
        WebMessagingMessage result = instance.direction(null);
        assertSame(instance, result, "Fluent setter for direction should return the same instance");
    }

    @Test
    public void testFluentSetter_originatingEntity() {
        WebMessagingMessage result = instance.originatingEntity(null);
        assertSame(instance, result, "Fluent setter for originatingEntity should return the same instance");
    }

    @Test
    public void testFluentSetter_metadata() {
        WebMessagingMessage result = instance.metadata(null);
        assertSame(instance, result, "Fluent setter for metadata should return the same instance");
    }
}
