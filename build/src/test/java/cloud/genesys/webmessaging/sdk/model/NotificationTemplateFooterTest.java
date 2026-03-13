package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for NotificationTemplateFooter model.
 */
public class NotificationTemplateFooterTest {

    private NotificationTemplateFooter instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new NotificationTemplateFooter();
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
        NotificationTemplateFooter a = new NotificationTemplateFooter();
        NotificationTemplateFooter b = new NotificationTemplateFooter();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        NotificationTemplateFooter a = new NotificationTemplateFooter();
        NotificationTemplateFooter b = new NotificationTemplateFooter();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class NotificationTemplateFooter"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        NotificationTemplateFooter deserialized = objectMapper.readValue(json, NotificationTemplateFooter.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_text() {
        NotificationTemplateFooter result = instance.text(null);
        assertSame(instance, result, "Fluent setter for text should return the same instance");
    }
}
