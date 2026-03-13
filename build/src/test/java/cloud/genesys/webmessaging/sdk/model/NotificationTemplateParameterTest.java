package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for NotificationTemplateParameter model.
 */
public class NotificationTemplateParameterTest {

    private NotificationTemplateParameter instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new NotificationTemplateParameter();
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
        NotificationTemplateParameter a = new NotificationTemplateParameter();
        NotificationTemplateParameter b = new NotificationTemplateParameter();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        NotificationTemplateParameter a = new NotificationTemplateParameter();
        NotificationTemplateParameter b = new NotificationTemplateParameter();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class NotificationTemplateParameter"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        NotificationTemplateParameter deserialized = objectMapper.readValue(json, NotificationTemplateParameter.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_name() {
        NotificationTemplateParameter result = instance.name(null);
        assertSame(instance, result, "Fluent setter for name should return the same instance");
    }

    @Test
    public void testFluentSetter_text() {
        NotificationTemplateParameter result = instance.text(null);
        assertSame(instance, result, "Fluent setter for text should return the same instance");
    }
}
