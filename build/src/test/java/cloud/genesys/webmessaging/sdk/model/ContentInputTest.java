package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for ContentInput model.
 */
public class ContentInputTest {

    private ContentInput instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new ContentInput();
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
        ContentInput a = new ContentInput();
        ContentInput b = new ContentInput();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        ContentInput a = new ContentInput();
        ContentInput b = new ContentInput();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class ContentInput"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        ContentInput deserialized = objectMapper.readValue(json, ContentInput.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_autoCompleteType() {
        ContentInput result = instance.autoCompleteType(null);
        assertSame(instance, result, "Fluent setter for autoCompleteType should return the same instance");
    }

    @Test
    public void testFluentSetter_id() {
        ContentInput result = instance.id(null);
        assertSame(instance, result, "Fluent setter for id should return the same instance");
    }

    @Test
    public void testFluentSetter_isMultipleLine() {
        ContentInput result = instance.isMultipleLine(null);
        assertSame(instance, result, "Fluent setter for isMultipleLine should return the same instance");
    }

    @Test
    public void testFluentSetter_isRequired() {
        ContentInput result = instance.isRequired(null);
        assertSame(instance, result, "Fluent setter for isRequired should return the same instance");
    }

    @Test
    public void testFluentSetter_keyboardType() {
        ContentInput result = instance.keyboardType(null);
        assertSame(instance, result, "Fluent setter for keyboardType should return the same instance");
    }

    @Test
    public void testFluentSetter_placeholderText() {
        ContentInput result = instance.placeholderText(null);
        assertSame(instance, result, "Fluent setter for placeholderText should return the same instance");
    }

    @Test
    public void testFluentSetter_subtitle() {
        ContentInput result = instance.subtitle(null);
        assertSame(instance, result, "Fluent setter for subtitle should return the same instance");
    }

    @Test
    public void testFluentSetter_title() {
        ContentInput result = instance.title(null);
        assertSame(instance, result, "Fluent setter for title should return the same instance");
    }
}
