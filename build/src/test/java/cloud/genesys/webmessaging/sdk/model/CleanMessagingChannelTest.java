package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for CleanMessagingChannel model.
 */
public class CleanMessagingChannelTest {

    private CleanMessagingChannel instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new CleanMessagingChannel();
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
        CleanMessagingChannel a = new CleanMessagingChannel();
        CleanMessagingChannel b = new CleanMessagingChannel();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        CleanMessagingChannel a = new CleanMessagingChannel();
        CleanMessagingChannel b = new CleanMessagingChannel();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class CleanMessagingChannel"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        CleanMessagingChannel deserialized = objectMapper.readValue(json, CleanMessagingChannel.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_time() {
        CleanMessagingChannel result = instance.time(null);
        assertSame(instance, result, "Fluent setter for time should return the same instance");
    }

    @Test
    public void testFluentSetter_type() {
        CleanMessagingChannel result = instance.type(null);
        assertSame(instance, result, "Fluent setter for type should return the same instance");
    }

    @Test
    public void testFluentSetter_messageId() {
        CleanMessagingChannel result = instance.messageId(null);
        assertSame(instance, result, "Fluent setter for messageId should return the same instance");
    }

    @Test
    public void testFluentSetter_from() {
        CleanMessagingChannel result = instance.from(null);
        assertSame(instance, result, "Fluent setter for from should return the same instance");
    }

    @Test
    public void testFluentSetter_to() {
        CleanMessagingChannel result = instance.to(null);
        assertSame(instance, result, "Fluent setter for to should return the same instance");
    }

    @Test
    public void testFluentSetter_metadata() {
        CleanMessagingChannel result = instance.metadata(null);
        assertSame(instance, result, "Fluent setter for metadata should return the same instance");
    }
}
