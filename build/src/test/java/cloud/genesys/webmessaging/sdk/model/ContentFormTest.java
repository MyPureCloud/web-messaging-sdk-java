package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for ContentForm model.
 */
public class ContentFormTest {

    private ContentForm instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new ContentForm();
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
        ContentForm a = new ContentForm();
        ContentForm b = new ContentForm();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        ContentForm a = new ContentForm();
        ContentForm b = new ContentForm();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class ContentForm"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        ContentForm deserialized = objectMapper.readValue(json, ContentForm.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_cannedResponseId() {
        ContentForm result = instance.cannedResponseId(null);
        assertSame(instance, result, "Fluent setter for cannedResponseId should return the same instance");
    }

    @Test
    public void testFluentSetter_formPages() {
        ContentForm result = instance.formPages(null);
        assertSame(instance, result, "Fluent setter for formPages should return the same instance");
    }

    @Test
    public void testFluentSetter_introduction() {
        ContentForm result = instance.introduction(null);
        assertSame(instance, result, "Fluent setter for introduction should return the same instance");
    }

    @Test
    public void testFluentSetter_originatingMessageId() {
        ContentForm result = instance.originatingMessageId(null);
        assertSame(instance, result, "Fluent setter for originatingMessageId should return the same instance");
    }

    @Test
    public void testFluentSetter_receivedMessage() {
        ContentForm result = instance.receivedMessage(null);
        assertSame(instance, result, "Fluent setter for receivedMessage should return the same instance");
    }

    @Test
    public void testFluentSetter_replyMessage() {
        ContentForm result = instance.replyMessage(null);
        assertSame(instance, result, "Fluent setter for replyMessage should return the same instance");
    }

    @Test
    public void testFluentSetter_response() {
        ContentForm result = instance.response(null);
        assertSame(instance, result, "Fluent setter for response should return the same instance");
    }

    @Test
    public void testFluentSetter_showSummary() {
        ContentForm result = instance.showSummary(null);
        assertSame(instance, result, "Fluent setter for showSummary should return the same instance");
    }
}
