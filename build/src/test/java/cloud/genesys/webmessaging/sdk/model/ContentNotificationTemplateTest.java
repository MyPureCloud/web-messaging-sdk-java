package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for ContentNotificationTemplate model.
 */
public class ContentNotificationTemplateTest {

    private ContentNotificationTemplate instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new ContentNotificationTemplate();
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
        ContentNotificationTemplate a = new ContentNotificationTemplate();
        ContentNotificationTemplate b = new ContentNotificationTemplate();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        ContentNotificationTemplate a = new ContentNotificationTemplate();
        ContentNotificationTemplate b = new ContentNotificationTemplate();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class ContentNotificationTemplate"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        ContentNotificationTemplate deserialized = objectMapper.readValue(json, ContentNotificationTemplate.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_body() {
        ContentNotificationTemplate result = instance.body(null);
        assertSame(instance, result, "Fluent setter for body should return the same instance");
    }

    @Test
    public void testFluentSetter_buttons() {
        ContentNotificationTemplate result = instance.buttons(null);
        assertSame(instance, result, "Fluent setter for buttons should return the same instance");
    }

    @Test
    public void testFluentSetter_carousel() {
        ContentNotificationTemplate result = instance.carousel(null);
        assertSame(instance, result, "Fluent setter for carousel should return the same instance");
    }

    @Test
    public void testFluentSetter_footer() {
        ContentNotificationTemplate result = instance.footer(null);
        assertSame(instance, result, "Fluent setter for footer should return the same instance");
    }

    @Test
    public void testFluentSetter_header() {
        ContentNotificationTemplate result = instance.header(null);
        assertSame(instance, result, "Fluent setter for header should return the same instance");
    }

    @Test
    public void testFluentSetter_id() {
        ContentNotificationTemplate result = instance.id(null);
        assertSame(instance, result, "Fluent setter for id should return the same instance");
    }

    @Test
    public void testFluentSetter_language() {
        ContentNotificationTemplate result = instance.language(null);
        assertSame(instance, result, "Fluent setter for language should return the same instance");
    }
}
