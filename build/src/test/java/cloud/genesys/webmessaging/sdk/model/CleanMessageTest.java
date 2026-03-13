package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for CleanMessage model.
 */
public class CleanMessageTest {

    private CleanMessage instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new CleanMessage();
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
        CleanMessage a = new CleanMessage();
        CleanMessage b = new CleanMessage();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        CleanMessage a = new CleanMessage();
        CleanMessage b = new CleanMessage();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class CleanMessage"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        CleanMessage deserialized = objectMapper.readValue(json, CleanMessage.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_tracingId() {
        CleanMessage result = instance.tracingId(null);
        assertSame(instance, result, "Fluent setter for tracingId should return the same instance");
    }

    @Test
    public void testFluentSetter_text() {
        CleanMessage result = instance.text(null);
        assertSame(instance, result, "Fluent setter for text should return the same instance");
    }

    @Test
    public void testFluentSetter_type() {
        CleanMessage result = instance.type(null);
        assertSame(instance, result, "Fluent setter for type should return the same instance");
    }

    @Test
    public void testFluentSetter_direction() {
        CleanMessage result = instance.direction(null);
        assertSame(instance, result, "Fluent setter for direction should return the same instance");
    }

    @Test
    public void testFluentSetter_id() {
        CleanMessage result = instance.id(null);
        assertSame(instance, result, "Fluent setter for id should return the same instance");
    }

    @Test
    public void testFluentSetter_channel() {
        CleanMessage result = instance.channel(null);
        assertSame(instance, result, "Fluent setter for channel should return the same instance");
    }

    @Test
    public void testFluentSetter_content() {
        CleanMessage result = instance.content(null);
        assertSame(instance, result, "Fluent setter for content should return the same instance");
    }

    @Test
    public void testFluentSetter_metadata() {
        CleanMessage result = instance.metadata(null);
        assertSame(instance, result, "Fluent setter for metadata should return the same instance");
    }

    @Test
    public void testFluentSetter_events() {
        CleanMessage result = instance.events(null);
        assertSame(instance, result, "Fluent setter for events should return the same instance");
    }

    @Test
    public void testFluentSetter_originatingEntity() {
        CleanMessage result = instance.originatingEntity(null);
        assertSame(instance, result, "Fluent setter for originatingEntity should return the same instance");
    }
}
