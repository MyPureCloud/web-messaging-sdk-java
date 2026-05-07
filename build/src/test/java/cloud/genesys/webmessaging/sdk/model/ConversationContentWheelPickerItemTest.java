package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for ConversationContentWheelPickerItem model.
 */
public class ConversationContentWheelPickerItemTest {

    private ConversationContentWheelPickerItem instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new ConversationContentWheelPickerItem();
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
        ConversationContentWheelPickerItem a = new ConversationContentWheelPickerItem();
        ConversationContentWheelPickerItem b = new ConversationContentWheelPickerItem();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        ConversationContentWheelPickerItem a = new ConversationContentWheelPickerItem();
        ConversationContentWheelPickerItem b = new ConversationContentWheelPickerItem();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class ConversationContentWheelPickerItem"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        ConversationContentWheelPickerItem deserialized = objectMapper.readValue(json, ConversationContentWheelPickerItem.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_id() {
        ConversationContentWheelPickerItem result = instance.id(null);
        assertSame(instance, result, "Fluent setter for id should return the same instance");
    }

    @Test
    public void testFluentSetter_title() {
        ConversationContentWheelPickerItem result = instance.title(null);
        assertSame(instance, result, "Fluent setter for title should return the same instance");
    }

    @Test
    public void testFluentSetter_value() {
        ConversationContentWheelPickerItem result = instance.value(null);
        assertSame(instance, result, "Fluent setter for value should return the same instance");
    }
}
