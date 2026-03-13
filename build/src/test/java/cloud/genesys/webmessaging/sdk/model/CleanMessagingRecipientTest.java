package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for CleanMessagingRecipient model.
 */
public class CleanMessagingRecipientTest {

    private CleanMessagingRecipient instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new CleanMessagingRecipient();
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
        CleanMessagingRecipient a = new CleanMessagingRecipient();
        CleanMessagingRecipient b = new CleanMessagingRecipient();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        CleanMessagingRecipient a = new CleanMessagingRecipient();
        CleanMessagingRecipient b = new CleanMessagingRecipient();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class CleanMessagingRecipient"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        CleanMessagingRecipient deserialized = objectMapper.readValue(json, CleanMessagingRecipient.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_firstName() {
        CleanMessagingRecipient result = instance.firstName(null);
        assertSame(instance, result, "Fluent setter for firstName should return the same instance");
    }

    @Test
    public void testFluentSetter_lastName() {
        CleanMessagingRecipient result = instance.lastName(null);
        assertSame(instance, result, "Fluent setter for lastName should return the same instance");
    }

    @Test
    public void testFluentSetter_nickname() {
        CleanMessagingRecipient result = instance.nickname(null);
        assertSame(instance, result, "Fluent setter for nickname should return the same instance");
    }

    @Test
    public void testFluentSetter_image() {
        CleanMessagingRecipient result = instance.image(null);
        assertSame(instance, result, "Fluent setter for image should return the same instance");
    }
}
