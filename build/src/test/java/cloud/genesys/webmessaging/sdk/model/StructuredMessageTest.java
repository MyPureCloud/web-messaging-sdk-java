package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for StructuredMessage model.
 */
public class StructuredMessageTest {

    private StructuredMessage instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new StructuredMessage();
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
        StructuredMessage a = new StructuredMessage();
        StructuredMessage b = new StructuredMessage();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        StructuredMessage a = new StructuredMessage();
        StructuredMessage b = new StructuredMessage();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class StructuredMessage"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        StructuredMessage deserialized = objectMapper.readValue(json, StructuredMessage.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_tracingId() {
        StructuredMessage result = instance.tracingId(null);
        assertSame(instance, result, "Fluent setter for tracingId should return the same instance");
    }

    @Test
    public void testFluentSetter_text() {
        StructuredMessage result = instance.text(null);
        assertSame(instance, result, "Fluent setter for text should return the same instance");
    }

    @Test
    public void testFluentSetter_type() {
        StructuredMessage result = instance.type(null);
        assertSame(instance, result, "Fluent setter for type should return the same instance");
    }

    @Test
    public void testFluentSetter_direction() {
        StructuredMessage result = instance.direction(null);
        assertSame(instance, result, "Fluent setter for direction should return the same instance");
    }

    @Test
    public void testFluentSetter_id() {
        StructuredMessage result = instance.id(null);
        assertSame(instance, result, "Fluent setter for id should return the same instance");
    }

    @Test
    public void testFluentSetter_channel() {
        StructuredMessage result = instance.channel(null);
        assertSame(instance, result, "Fluent setter for channel should return the same instance");
    }

    @Test
    public void testFluentSetter_content() {
        StructuredMessage result = instance.content(null);
        assertSame(instance, result, "Fluent setter for content should return the same instance");
    }

    @Test
    public void testFluentSetter_metadata() {
        StructuredMessage result = instance.metadata(null);
        assertSame(instance, result, "Fluent setter for metadata should return the same instance");
    }

    @Test
    public void testFluentSetter_events() {
        StructuredMessage result = instance.events(null);
        assertSame(instance, result, "Fluent setter for events should return the same instance");
    }
}
