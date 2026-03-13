package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for NotificationTemplateBody model.
 */
public class NotificationTemplateBodyTest {

    private NotificationTemplateBody instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new NotificationTemplateBody();
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
        NotificationTemplateBody a = new NotificationTemplateBody();
        NotificationTemplateBody b = new NotificationTemplateBody();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        NotificationTemplateBody a = new NotificationTemplateBody();
        NotificationTemplateBody b = new NotificationTemplateBody();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class NotificationTemplateBody"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        NotificationTemplateBody deserialized = objectMapper.readValue(json, NotificationTemplateBody.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_parameters() {
        NotificationTemplateBody result = instance.parameters(null);
        assertSame(instance, result, "Fluent setter for parameters should return the same instance");
    }

    @Test
    public void testFluentSetter_text() {
        NotificationTemplateBody result = instance.text(null);
        assertSame(instance, result, "Fluent setter for text should return the same instance");
    }
}
