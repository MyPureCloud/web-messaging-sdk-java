package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for NotificationTemplateCarousel model.
 */
public class NotificationTemplateCarouselTest {

    private NotificationTemplateCarousel instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new NotificationTemplateCarousel();
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
        NotificationTemplateCarousel a = new NotificationTemplateCarousel();
        NotificationTemplateCarousel b = new NotificationTemplateCarousel();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        NotificationTemplateCarousel a = new NotificationTemplateCarousel();
        NotificationTemplateCarousel b = new NotificationTemplateCarousel();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class NotificationTemplateCarousel"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        NotificationTemplateCarousel deserialized = objectMapper.readValue(json, NotificationTemplateCarousel.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_cards() {
        NotificationTemplateCarousel result = instance.cards(null);
        assertSame(instance, result, "Fluent setter for cards should return the same instance");
    }
}
