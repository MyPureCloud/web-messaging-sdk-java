package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for ContentListPickerSection model.
 */
public class ContentListPickerSectionTest {

    private ContentListPickerSection instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new ContentListPickerSection();
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
        ContentListPickerSection a = new ContentListPickerSection();
        ContentListPickerSection b = new ContentListPickerSection();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        ContentListPickerSection a = new ContentListPickerSection();
        ContentListPickerSection b = new ContentListPickerSection();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class ContentListPickerSection"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        ContentListPickerSection deserialized = objectMapper.readValue(json, ContentListPickerSection.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_items() {
        ContentListPickerSection result = instance.items(null);
        assertSame(instance, result, "Fluent setter for items should return the same instance");
    }

    @Test
    public void testFluentSetter_multipleSelection() {
        ContentListPickerSection result = instance.multipleSelection(null);
        assertSame(instance, result, "Fluent setter for multipleSelection should return the same instance");
    }

    @Test
    public void testFluentSetter_title() {
        ContentListPickerSection result = instance.title(null);
        assertSame(instance, result, "Fluent setter for title should return the same instance");
    }
}
