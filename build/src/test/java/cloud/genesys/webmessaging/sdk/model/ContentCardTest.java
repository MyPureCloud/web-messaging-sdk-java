package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for ContentCard model.
 */
public class ContentCardTest {

    private ContentCard instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new ContentCard();
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
        ContentCard a = new ContentCard();
        ContentCard b = new ContentCard();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        ContentCard a = new ContentCard();
        ContentCard b = new ContentCard();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class ContentCard"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        ContentCard deserialized = objectMapper.readValue(json, ContentCard.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_title() {
        ContentCard result = instance.title(null);
        assertSame(instance, result, "Fluent setter for title should return the same instance");
    }

    @Test
    public void testFluentSetter_description() {
        ContentCard result = instance.description(null);
        assertSame(instance, result, "Fluent setter for description should return the same instance");
    }

    @Test
    public void testFluentSetter_image() {
        ContentCard result = instance.image(null);
        assertSame(instance, result, "Fluent setter for image should return the same instance");
    }

    @Test
    public void testFluentSetter_video() {
        ContentCard result = instance.video(null);
        assertSame(instance, result, "Fluent setter for video should return the same instance");
    }

    @Test
    public void testFluentSetter_defaultAction() {
        ContentCard result = instance.defaultAction(null);
        assertSame(instance, result, "Fluent setter for defaultAction should return the same instance");
    }

    @Test
    public void testFluentSetter_actions() {
        ContentCard result = instance.actions(null);
        assertSame(instance, result, "Fluent setter for actions should return the same instance");
    }
}
