package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for ContentGeneric model.
 */
public class ContentGenericTest {

    private ContentGeneric instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new ContentGeneric();
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
        ContentGeneric a = new ContentGeneric();
        ContentGeneric b = new ContentGeneric();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        ContentGeneric a = new ContentGeneric();
        ContentGeneric b = new ContentGeneric();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class ContentGeneric"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        ContentGeneric deserialized = objectMapper.readValue(json, ContentGeneric.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_actions() {
        ContentGeneric result = instance.actions(null);
        assertSame(instance, result, "Fluent setter for actions should return the same instance");
    }

    @Test
    public void testFluentSetter_components() {
        ContentGeneric result = instance.components(null);
        assertSame(instance, result, "Fluent setter for components should return the same instance");
    }

    @Test
    public void testFluentSetter_description() {
        ContentGeneric result = instance.description(null);
        assertSame(instance, result, "Fluent setter for description should return the same instance");
    }

    @Test
    public void testFluentSetter_id() {
        ContentGeneric result = instance.id(null);
        assertSame(instance, result, "Fluent setter for id should return the same instance");
    }

    @Test
    public void testFluentSetter_image() {
        ContentGeneric result = instance.image(null);
        assertSame(instance, result, "Fluent setter for image should return the same instance");
    }

    @Test
    public void testFluentSetter_title() {
        ContentGeneric result = instance.title(null);
        assertSame(instance, result, "Fluent setter for title should return the same instance");
    }

    @Test
    public void testFluentSetter_video() {
        ContentGeneric result = instance.video(null);
        assertSame(instance, result, "Fluent setter for video should return the same instance");
    }
}
