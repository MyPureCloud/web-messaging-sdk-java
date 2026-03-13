package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for NotificationTemplateCard model.
 */
public class NotificationTemplateCardTest {

    private NotificationTemplateCard instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new NotificationTemplateCard();
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
        NotificationTemplateCard a = new NotificationTemplateCard();
        NotificationTemplateCard b = new NotificationTemplateCard();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        NotificationTemplateCard a = new NotificationTemplateCard();
        NotificationTemplateCard b = new NotificationTemplateCard();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class NotificationTemplateCard"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        NotificationTemplateCard deserialized = objectMapper.readValue(json, NotificationTemplateCard.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_body() {
        NotificationTemplateCard result = instance.body(null);
        assertSame(instance, result, "Fluent setter for body should return the same instance");
    }

    @Test
    public void testFluentSetter_buttons() {
        NotificationTemplateCard result = instance.buttons(null);
        assertSame(instance, result, "Fluent setter for buttons should return the same instance");
    }

    @Test
    public void testFluentSetter_header() {
        NotificationTemplateCard result = instance.header(null);
        assertSame(instance, result, "Fluent setter for header should return the same instance");
    }
}
