package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for NotificationTemplateButton model.
 */
public class NotificationTemplateButtonTest {

    private NotificationTemplateButton instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new NotificationTemplateButton();
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
        NotificationTemplateButton a = new NotificationTemplateButton();
        NotificationTemplateButton b = new NotificationTemplateButton();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        NotificationTemplateButton a = new NotificationTemplateButton();
        NotificationTemplateButton b = new NotificationTemplateButton();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class NotificationTemplateButton"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        NotificationTemplateButton deserialized = objectMapper.readValue(json, NotificationTemplateButton.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_index() {
        NotificationTemplateButton result = instance.index(null);
        assertSame(instance, result, "Fluent setter for index should return the same instance");
    }

    @Test
    public void testFluentSetter_parameters() {
        NotificationTemplateButton result = instance.parameters(null);
        assertSame(instance, result, "Fluent setter for parameters should return the same instance");
    }

    @Test
    public void testFluentSetter_payload() {
        NotificationTemplateButton result = instance.payload(null);
        assertSame(instance, result, "Fluent setter for payload should return the same instance");
    }

    @Test
    public void testFluentSetter_phoneNumber() {
        NotificationTemplateButton result = instance.phoneNumber(null);
        assertSame(instance, result, "Fluent setter for phoneNumber should return the same instance");
    }

    @Test
    public void testFluentSetter_text() {
        NotificationTemplateButton result = instance.text(null);
        assertSame(instance, result, "Fluent setter for text should return the same instance");
    }

    @Test
    public void testFluentSetter_type() {
        NotificationTemplateButton result = instance.type(null);
        assertSame(instance, result, "Fluent setter for type should return the same instance");
    }

    @Test
    public void testFluentSetter_url() {
        NotificationTemplateButton result = instance.url(null);
        assertSame(instance, result, "Fluent setter for url should return the same instance");
    }
}
