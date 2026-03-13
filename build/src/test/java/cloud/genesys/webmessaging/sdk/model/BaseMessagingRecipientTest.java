package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for BaseMessagingRecipient model.
 */
public class BaseMessagingRecipientTest {

    private BaseMessagingRecipient instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new BaseMessagingRecipient();
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
        BaseMessagingRecipient a = new BaseMessagingRecipient();
        BaseMessagingRecipient b = new BaseMessagingRecipient();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        BaseMessagingRecipient a = new BaseMessagingRecipient();
        BaseMessagingRecipient b = new BaseMessagingRecipient();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class BaseMessagingRecipient"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        BaseMessagingRecipient deserialized = objectMapper.readValue(json, BaseMessagingRecipient.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_firstName() {
        BaseMessagingRecipient result = instance.firstName(null);
        assertSame(instance, result, "Fluent setter for firstName should return the same instance");
    }

    @Test
    public void testFluentSetter_lastName() {
        BaseMessagingRecipient result = instance.lastName(null);
        assertSame(instance, result, "Fluent setter for lastName should return the same instance");
    }

    @Test
    public void testFluentSetter_nickname() {
        BaseMessagingRecipient result = instance.nickname(null);
        assertSame(instance, result, "Fluent setter for nickname should return the same instance");
    }

    @Test
    public void testFluentSetter_image() {
        BaseMessagingRecipient result = instance.image(null);
        assertSame(instance, result, "Fluent setter for image should return the same instance");
    }
}
