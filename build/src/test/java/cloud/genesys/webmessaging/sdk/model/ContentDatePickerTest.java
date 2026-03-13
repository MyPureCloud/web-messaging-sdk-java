package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for ContentDatePicker model.
 */
public class ContentDatePickerTest {

    private ContentDatePicker instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new ContentDatePicker();
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
        ContentDatePicker a = new ContentDatePicker();
        ContentDatePicker b = new ContentDatePicker();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        ContentDatePicker a = new ContentDatePicker();
        ContentDatePicker b = new ContentDatePicker();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class ContentDatePicker"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        ContentDatePicker deserialized = objectMapper.readValue(json, ContentDatePicker.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_title() {
        ContentDatePicker result = instance.title(null);
        assertSame(instance, result, "Fluent setter for title should return the same instance");
    }

    @Test
    public void testFluentSetter_subtitle() {
        ContentDatePicker result = instance.subtitle(null);
        assertSame(instance, result, "Fluent setter for subtitle should return the same instance");
    }

    @Test
    public void testFluentSetter_imageUrl() {
        ContentDatePicker result = instance.imageUrl(null);
        assertSame(instance, result, "Fluent setter for imageUrl should return the same instance");
    }

    @Test
    public void testFluentSetter_dateMinimum() {
        ContentDatePicker result = instance.dateMinimum(null);
        assertSame(instance, result, "Fluent setter for dateMinimum should return the same instance");
    }

    @Test
    public void testFluentSetter_dateMaximum() {
        ContentDatePicker result = instance.dateMaximum(null);
        assertSame(instance, result, "Fluent setter for dateMaximum should return the same instance");
    }

    @Test
    public void testFluentSetter_availableTimes() {
        ContentDatePicker result = instance.availableTimes(null);
        assertSame(instance, result, "Fluent setter for availableTimes should return the same instance");
    }
}
