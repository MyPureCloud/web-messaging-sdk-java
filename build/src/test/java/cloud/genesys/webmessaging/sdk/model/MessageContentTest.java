package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for MessageContent model.
 */
public class MessageContentTest {

    private MessageContent instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new MessageContent();
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
        MessageContent a = new MessageContent();
        MessageContent b = new MessageContent();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        MessageContent a = new MessageContent();
        MessageContent b = new MessageContent();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class MessageContent"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        MessageContent deserialized = objectMapper.readValue(json, MessageContent.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_attachment() {
        MessageContent result = instance.attachment(null);
        assertSame(instance, result, "Fluent setter for attachment should return the same instance");
    }

    @Test
    public void testFluentSetter_buttonResponse() {
        MessageContent result = instance.buttonResponse(null);
        assertSame(instance, result, "Fluent setter for buttonResponse should return the same instance");
    }

    @Test
    public void testFluentSetter_card() {
        MessageContent result = instance.card(null);
        assertSame(instance, result, "Fluent setter for card should return the same instance");
    }

    @Test
    public void testFluentSetter_carousel() {
        MessageContent result = instance.carousel(null);
        assertSame(instance, result, "Fluent setter for carousel should return the same instance");
    }

    @Test
    public void testFluentSetter_contentType() {
        MessageContent result = instance.contentType(null);
        assertSame(instance, result, "Fluent setter for contentType should return the same instance");
    }

    @Test
    public void testFluentSetter_datePicker() {
        MessageContent result = instance.datePicker(null);
        assertSame(instance, result, "Fluent setter for datePicker should return the same instance");
    }

    @Test
    public void testFluentSetter_form() {
        MessageContent result = instance.form(null);
        assertSame(instance, result, "Fluent setter for form should return the same instance");
    }

    @Test
    public void testFluentSetter_generic() {
        MessageContent result = instance.generic(null);
        assertSame(instance, result, "Fluent setter for generic should return the same instance");
    }

    @Test
    public void testFluentSetter_interactiveApplication() {
        MessageContent result = instance.interactiveApplication(null);
        assertSame(instance, result, "Fluent setter for interactiveApplication should return the same instance");
    }

    @Test
    public void testFluentSetter_list() {
        MessageContent result = instance.list(null);
        assertSame(instance, result, "Fluent setter for list should return the same instance");
    }

    @Test
    public void testFluentSetter_listPicker() {
        MessageContent result = instance.listPicker(null);
        assertSame(instance, result, "Fluent setter for listPicker should return the same instance");
    }

    @Test
    public void testFluentSetter_location() {
        MessageContent result = instance.location(null);
        assertSame(instance, result, "Fluent setter for location should return the same instance");
    }

    @Test
    public void testFluentSetter_mention() {
        MessageContent result = instance.mention(null);
        assertSame(instance, result, "Fluent setter for mention should return the same instance");
    }

    @Test
    public void testFluentSetter_paymentRequest() {
        MessageContent result = instance.paymentRequest(null);
        assertSame(instance, result, "Fluent setter for paymentRequest should return the same instance");
    }

    @Test
    public void testFluentSetter_paymentResponse() {
        MessageContent result = instance.paymentResponse(null);
        assertSame(instance, result, "Fluent setter for paymentResponse should return the same instance");
    }

    @Test
    public void testFluentSetter_postback() {
        MessageContent result = instance.postback(null);
        assertSame(instance, result, "Fluent setter for postback should return the same instance");
    }

    @Test
    public void testFluentSetter_push() {
        MessageContent result = instance.push(null);
        assertSame(instance, result, "Fluent setter for push should return the same instance");
    }

    @Test
    public void testFluentSetter_quickReply() {
        MessageContent result = instance.quickReply(null);
        assertSame(instance, result, "Fluent setter for quickReply should return the same instance");
    }

    @Test
    public void testFluentSetter_quickReplyV2() {
        MessageContent result = instance.quickReplyV2(null);
        assertSame(instance, result, "Fluent setter for quickReplyV2 should return the same instance");
    }

    @Test
    public void testFluentSetter_reactions() {
        MessageContent result = instance.reactions(null);
        assertSame(instance, result, "Fluent setter for reactions should return the same instance");
    }

    @Test
    public void testFluentSetter_richLink() {
        MessageContent result = instance.richLink(null);
        assertSame(instance, result, "Fluent setter for richLink should return the same instance");
    }

    @Test
    public void testFluentSetter_roadsideAssistance() {
        MessageContent result = instance.roadsideAssistance(null);
        assertSame(instance, result, "Fluent setter for roadsideAssistance should return the same instance");
    }

    @Test
    public void testFluentSetter_story() {
        MessageContent result = instance.story(null);
        assertSame(instance, result, "Fluent setter for story should return the same instance");
    }

    @Test
    public void testFluentSetter_template() {
        MessageContent result = instance.template(null);
        assertSame(instance, result, "Fluent setter for template should return the same instance");
    }

    @Test
    public void testFluentSetter_text() {
        MessageContent result = instance.text(null);
        assertSame(instance, result, "Fluent setter for text should return the same instance");
    }
}
