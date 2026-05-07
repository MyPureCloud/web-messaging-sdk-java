package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for ConversationContentButtonResponse model.
 */
public class ConversationContentButtonResponseTest {

    private ConversationContentButtonResponse instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new ConversationContentButtonResponse();
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
        ConversationContentButtonResponse a = new ConversationContentButtonResponse();
        ConversationContentButtonResponse b = new ConversationContentButtonResponse();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        ConversationContentButtonResponse a = new ConversationContentButtonResponse();
        ConversationContentButtonResponse b = new ConversationContentButtonResponse();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class ConversationContentButtonResponse"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        ConversationContentButtonResponse deserialized = objectMapper.readValue(json, ConversationContentButtonResponse.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_originatingMessageId() {
        ConversationContentButtonResponse result = instance.originatingMessageId(null);
        assertSame(instance, result, "Fluent setter for originatingMessageId should return the same instance");
    }

    @Test
    public void testFluentSetter_type() {
        ConversationContentButtonResponse result = instance.type(null);
        assertSame(instance, result, "Fluent setter for type should return the same instance");
    }

    @Test
    public void testFluentSetter_text() {
        ConversationContentButtonResponse result = instance.text(null);
        assertSame(instance, result, "Fluent setter for text should return the same instance");
    }

    @Test
    public void testFluentSetter_payload() {
        ConversationContentButtonResponse result = instance.payload(null);
        assertSame(instance, result, "Fluent setter for payload should return the same instance");
    }
}
