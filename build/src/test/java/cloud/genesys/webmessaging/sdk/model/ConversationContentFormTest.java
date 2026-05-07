package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for ConversationContentForm model.
 */
public class ConversationContentFormTest {

    private ConversationContentForm instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new ConversationContentForm();
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
        ConversationContentForm a = new ConversationContentForm();
        ConversationContentForm b = new ConversationContentForm();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        ConversationContentForm a = new ConversationContentForm();
        ConversationContentForm b = new ConversationContentForm();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class ConversationContentForm"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        ConversationContentForm deserialized = objectMapper.readValue(json, ConversationContentForm.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_introduction() {
        ConversationContentForm result = instance.introduction(null);
        assertSame(instance, result, "Fluent setter for introduction should return the same instance");
    }

    @Test
    public void testFluentSetter_formPages() {
        ConversationContentForm result = instance.formPages(null);
        assertSame(instance, result, "Fluent setter for formPages should return the same instance");
    }

    @Test
    public void testFluentSetter_receivedMessage() {
        ConversationContentForm result = instance.receivedMessage(null);
        assertSame(instance, result, "Fluent setter for receivedMessage should return the same instance");
    }

    @Test
    public void testFluentSetter_replyMessage() {
        ConversationContentForm result = instance.replyMessage(null);
        assertSame(instance, result, "Fluent setter for replyMessage should return the same instance");
    }

    @Test
    public void testFluentSetter_showSummary() {
        ConversationContentForm result = instance.showSummary(null);
        assertSame(instance, result, "Fluent setter for showSummary should return the same instance");
    }

    @Test
    public void testFluentSetter_response() {
        ConversationContentForm result = instance.response(null);
        assertSame(instance, result, "Fluent setter for response should return the same instance");
    }

    @Test
    public void testFluentSetter_originatingMessageId() {
        ConversationContentForm result = instance.originatingMessageId(null);
        assertSame(instance, result, "Fluent setter for originatingMessageId should return the same instance");
    }

    @Test
    public void testFluentSetter_cannedResponseId() {
        ConversationContentForm result = instance.cannedResponseId(null);
        assertSame(instance, result, "Fluent setter for cannedResponseId should return the same instance");
    }
}
