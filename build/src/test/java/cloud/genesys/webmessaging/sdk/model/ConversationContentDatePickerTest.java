package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for ConversationContentDatePicker model.
 */
public class ConversationContentDatePickerTest {

    private ConversationContentDatePicker instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new ConversationContentDatePicker();
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
        ConversationContentDatePicker a = new ConversationContentDatePicker();
        ConversationContentDatePicker b = new ConversationContentDatePicker();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        ConversationContentDatePicker a = new ConversationContentDatePicker();
        ConversationContentDatePicker b = new ConversationContentDatePicker();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class ConversationContentDatePicker"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        ConversationContentDatePicker deserialized = objectMapper.readValue(json, ConversationContentDatePicker.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_id() {
        ConversationContentDatePicker result = instance.id(null);
        assertSame(instance, result, "Fluent setter for id should return the same instance");
    }

    @Test
    public void testFluentSetter_title() {
        ConversationContentDatePicker result = instance.title(null);
        assertSame(instance, result, "Fluent setter for title should return the same instance");
    }

    @Test
    public void testFluentSetter_subtitle() {
        ConversationContentDatePicker result = instance.subtitle(null);
        assertSame(instance, result, "Fluent setter for subtitle should return the same instance");
    }

    @Test
    public void testFluentSetter_imageUrl() {
        ConversationContentDatePicker result = instance.imageUrl(null);
        assertSame(instance, result, "Fluent setter for imageUrl should return the same instance");
    }

    @Test
    public void testFluentSetter_dateMinimum() {
        ConversationContentDatePicker result = instance.dateMinimum(null);
        assertSame(instance, result, "Fluent setter for dateMinimum should return the same instance");
    }

    @Test
    public void testFluentSetter_dateMaximum() {
        ConversationContentDatePicker result = instance.dateMaximum(null);
        assertSame(instance, result, "Fluent setter for dateMaximum should return the same instance");
    }

    @Test
    public void testFluentSetter_location() {
        ConversationContentDatePicker result = instance.location(null);
        assertSame(instance, result, "Fluent setter for location should return the same instance");
    }

    @Test
    public void testFluentSetter_availableTimes() {
        ConversationContentDatePicker result = instance.availableTimes(null);
        assertSame(instance, result, "Fluent setter for availableTimes should return the same instance");
    }

    @Test
    public void testFluentSetter_dateDisplayFormat() {
        ConversationContentDatePicker result = instance.dateDisplayFormat(null);
        assertSame(instance, result, "Fluent setter for dateDisplayFormat should return the same instance");
    }
}
