package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for ConversationContentReceivedReplyMessage model.
 */
public class ConversationContentReceivedReplyMessageTest {

    private ConversationContentReceivedReplyMessage instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new ConversationContentReceivedReplyMessage();
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
        ConversationContentReceivedReplyMessage a = new ConversationContentReceivedReplyMessage();
        ConversationContentReceivedReplyMessage b = new ConversationContentReceivedReplyMessage();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        ConversationContentReceivedReplyMessage a = new ConversationContentReceivedReplyMessage();
        ConversationContentReceivedReplyMessage b = new ConversationContentReceivedReplyMessage();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class ConversationContentReceivedReplyMessage"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        ConversationContentReceivedReplyMessage deserialized = objectMapper.readValue(json, ConversationContentReceivedReplyMessage.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_header() {
        ConversationContentReceivedReplyMessage result = instance.header(null);
        assertSame(instance, result, "Fluent setter for header should return the same instance");
    }

    @Test
    public void testFluentSetter_title() {
        ConversationContentReceivedReplyMessage result = instance.title(null);
        assertSame(instance, result, "Fluent setter for title should return the same instance");
    }

    @Test
    public void testFluentSetter_subtitle() {
        ConversationContentReceivedReplyMessage result = instance.subtitle(null);
        assertSame(instance, result, "Fluent setter for subtitle should return the same instance");
    }

    @Test
    public void testFluentSetter_buttonLabel() {
        ConversationContentReceivedReplyMessage result = instance.buttonLabel(null);
        assertSame(instance, result, "Fluent setter for buttonLabel should return the same instance");
    }

    @Test
    public void testFluentSetter_imageUrl() {
        ConversationContentReceivedReplyMessage result = instance.imageUrl(null);
        assertSame(instance, result, "Fluent setter for imageUrl should return the same instance");
    }
}
