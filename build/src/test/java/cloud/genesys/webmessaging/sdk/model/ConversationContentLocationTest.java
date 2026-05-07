package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for ConversationContentLocation model.
 */
public class ConversationContentLocationTest {

    private ConversationContentLocation instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new ConversationContentLocation();
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
        ConversationContentLocation a = new ConversationContentLocation();
        ConversationContentLocation b = new ConversationContentLocation();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        ConversationContentLocation a = new ConversationContentLocation();
        ConversationContentLocation b = new ConversationContentLocation();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class ConversationContentLocation"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        ConversationContentLocation deserialized = objectMapper.readValue(json, ConversationContentLocation.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_url() {
        ConversationContentLocation result = instance.url(null);
        assertSame(instance, result, "Fluent setter for url should return the same instance");
    }

    @Test
    public void testFluentSetter_address() {
        ConversationContentLocation result = instance.address(null);
        assertSame(instance, result, "Fluent setter for address should return the same instance");
    }

    @Test
    public void testFluentSetter_text() {
        ConversationContentLocation result = instance.text(null);
        assertSame(instance, result, "Fluent setter for text should return the same instance");
    }

    @Test
    public void testFluentSetter_latitude() {
        ConversationContentLocation result = instance.latitude(null);
        assertSame(instance, result, "Fluent setter for latitude should return the same instance");
    }

    @Test
    public void testFluentSetter_longitude() {
        ConversationContentLocation result = instance.longitude(null);
        assertSame(instance, result, "Fluent setter for longitude should return the same instance");
    }
}
