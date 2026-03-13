package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for BaseMessagingChannel model.
 */
public class BaseMessagingChannelTest {

    private BaseMessagingChannel instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new BaseMessagingChannel();
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
        BaseMessagingChannel a = new BaseMessagingChannel();
        BaseMessagingChannel b = new BaseMessagingChannel();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        BaseMessagingChannel a = new BaseMessagingChannel();
        BaseMessagingChannel b = new BaseMessagingChannel();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class BaseMessagingChannel"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        BaseMessagingChannel deserialized = objectMapper.readValue(json, BaseMessagingChannel.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_time() {
        BaseMessagingChannel result = instance.time(null);
        assertSame(instance, result, "Fluent setter for time should return the same instance");
    }

    @Test
    public void testFluentSetter_type() {
        BaseMessagingChannel result = instance.type(null);
        assertSame(instance, result, "Fluent setter for type should return the same instance");
    }

    @Test
    public void testFluentSetter_messageId() {
        BaseMessagingChannel result = instance.messageId(null);
        assertSame(instance, result, "Fluent setter for messageId should return the same instance");
    }

    @Test
    public void testFluentSetter_from() {
        BaseMessagingChannel result = instance.from(null);
        assertSame(instance, result, "Fluent setter for from should return the same instance");
    }

    @Test
    public void testFluentSetter_to() {
        BaseMessagingChannel result = instance.to(null);
        assertSame(instance, result, "Fluent setter for to should return the same instance");
    }

    @Test
    public void testFluentSetter_metadata() {
        BaseMessagingChannel result = instance.metadata(null);
        assertSame(instance, result, "Fluent setter for metadata should return the same instance");
    }
}
