package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for WebMessagingContent model.
 */
public class WebMessagingContentTest {

    private WebMessagingContent instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new WebMessagingContent();
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
        WebMessagingContent a = new WebMessagingContent();
        WebMessagingContent b = new WebMessagingContent();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        WebMessagingContent a = new WebMessagingContent();
        WebMessagingContent b = new WebMessagingContent();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class WebMessagingContent"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        WebMessagingContent deserialized = objectMapper.readValue(json, WebMessagingContent.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_quickReply() {
        WebMessagingContent result = instance.quickReply(null);
        assertSame(instance, result, "Fluent setter for quickReply should return the same instance");
    }

    @Test
    public void testFluentSetter_buttonResponse() {
        WebMessagingContent result = instance.buttonResponse(null);
        assertSame(instance, result, "Fluent setter for buttonResponse should return the same instance");
    }

    @Test
    public void testFluentSetter_generic() {
        WebMessagingContent result = instance.generic(null);
        assertSame(instance, result, "Fluent setter for generic should return the same instance");
    }

    @Test
    public void testFluentSetter_card() {
        WebMessagingContent result = instance.card(null);
        assertSame(instance, result, "Fluent setter for card should return the same instance");
    }

    @Test
    public void testFluentSetter_carousel() {
        WebMessagingContent result = instance.carousel(null);
        assertSame(instance, result, "Fluent setter for carousel should return the same instance");
    }

    @Test
    public void testFluentSetter_datePicker() {
        WebMessagingContent result = instance.datePicker(null);
        assertSame(instance, result, "Fluent setter for datePicker should return the same instance");
    }

    @Test
    public void testFluentSetter_listPicker() {
        WebMessagingContent result = instance.listPicker(null);
        assertSame(instance, result, "Fluent setter for listPicker should return the same instance");
    }
}
