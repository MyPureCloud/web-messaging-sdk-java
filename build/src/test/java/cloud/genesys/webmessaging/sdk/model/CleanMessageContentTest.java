package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for CleanMessageContent model.
 */
public class CleanMessageContentTest {

    private CleanMessageContent instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new CleanMessageContent();
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
        CleanMessageContent a = new CleanMessageContent();
        CleanMessageContent b = new CleanMessageContent();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        CleanMessageContent a = new CleanMessageContent();
        CleanMessageContent b = new CleanMessageContent();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class CleanMessageContent"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        CleanMessageContent deserialized = objectMapper.readValue(json, CleanMessageContent.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_attachment() {
        CleanMessageContent result = instance.attachment(null);
        assertSame(instance, result, "Fluent setter for attachment should return the same instance");
    }

    @Test
    public void testFluentSetter_contentType() {
        CleanMessageContent result = instance.contentType(null);
        assertSame(instance, result, "Fluent setter for contentType should return the same instance");
    }

    @Test
    public void testFluentSetter_buttonResponse() {
        CleanMessageContent result = instance.buttonResponse(null);
        assertSame(instance, result, "Fluent setter for buttonResponse should return the same instance");
    }

    @Test
    public void testFluentSetter_generic() {
        CleanMessageContent result = instance.generic(null);
        assertSame(instance, result, "Fluent setter for generic should return the same instance");
    }

    @Test
    public void testFluentSetter_card() {
        CleanMessageContent result = instance.card(null);
        assertSame(instance, result, "Fluent setter for card should return the same instance");
    }

    @Test
    public void testFluentSetter_carousel() {
        CleanMessageContent result = instance.carousel(null);
        assertSame(instance, result, "Fluent setter for carousel should return the same instance");
    }

    @Test
    public void testFluentSetter_datePicker() {
        CleanMessageContent result = instance.datePicker(null);
        assertSame(instance, result, "Fluent setter for datePicker should return the same instance");
    }

    @Test
    public void testFluentSetter_listPicker() {
        CleanMessageContent result = instance.listPicker(null);
        assertSame(instance, result, "Fluent setter for listPicker should return the same instance");
    }

    @Test
    public void testFluentSetter_quickReply() {
        CleanMessageContent result = instance.quickReply(null);
        assertSame(instance, result, "Fluent setter for quickReply should return the same instance");
    }

    @Test
    public void testFluentSetter_text() {
        CleanMessageContent result = instance.text(null);
        assertSame(instance, result, "Fluent setter for text should return the same instance");
    }

    @Test
    public void testFluentSetter_quickReplyV2() {
        CleanMessageContent result = instance.quickReplyV2(null);
        assertSame(instance, result, "Fluent setter for quickReplyV2 should return the same instance");
    }
}
