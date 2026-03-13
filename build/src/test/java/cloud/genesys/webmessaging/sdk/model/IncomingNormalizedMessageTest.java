package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for IncomingNormalizedMessage model.
 */
public class IncomingNormalizedMessageTest {

    private IncomingNormalizedMessage instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new IncomingNormalizedMessage();
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
        IncomingNormalizedMessage a = new IncomingNormalizedMessage();
        IncomingNormalizedMessage b = new IncomingNormalizedMessage();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        IncomingNormalizedMessage a = new IncomingNormalizedMessage();
        IncomingNormalizedMessage b = new IncomingNormalizedMessage();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class IncomingNormalizedMessage"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        IncomingNormalizedMessage deserialized = objectMapper.readValue(json, IncomingNormalizedMessage.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_id() {
        IncomingNormalizedMessage result = instance.id(null);
        assertSame(instance, result, "Fluent setter for id should return the same instance");
    }

    @Test
    public void testFluentSetter_type() {
        IncomingNormalizedMessage result = instance.type(null);
        assertSame(instance, result, "Fluent setter for type should return the same instance");
    }

    @Test
    public void testFluentSetter_text() {
        IncomingNormalizedMessage result = instance.text(null);
        assertSame(instance, result, "Fluent setter for text should return the same instance");
    }

    @Test
    public void testFluentSetter_status() {
        IncomingNormalizedMessage result = instance.status(null);
        assertSame(instance, result, "Fluent setter for status should return the same instance");
    }

    @Test
    public void testFluentSetter_content() {
        IncomingNormalizedMessage result = instance.content(null);
        assertSame(instance, result, "Fluent setter for content should return the same instance");
    }

    @Test
    public void testFluentSetter_events() {
        IncomingNormalizedMessage result = instance.events(null);
        assertSame(instance, result, "Fluent setter for events should return the same instance");
    }

    @Test
    public void testFluentSetter_metadata() {
        IncomingNormalizedMessage result = instance.metadata(null);
        assertSame(instance, result, "Fluent setter for metadata should return the same instance");
    }

    @Test
    public void testFluentSetter_channel() {
        IncomingNormalizedMessage result = instance.channel(null);
        assertSame(instance, result, "Fluent setter for channel should return the same instance");
    }
}
