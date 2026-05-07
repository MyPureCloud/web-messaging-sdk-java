package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for ConversationContentWheelPicker model.
 */
public class ConversationContentWheelPickerTest {

    private ConversationContentWheelPicker instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new ConversationContentWheelPicker();
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
        ConversationContentWheelPicker a = new ConversationContentWheelPicker();
        ConversationContentWheelPicker b = new ConversationContentWheelPicker();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        ConversationContentWheelPicker a = new ConversationContentWheelPicker();
        ConversationContentWheelPicker b = new ConversationContentWheelPicker();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class ConversationContentWheelPicker"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        ConversationContentWheelPicker deserialized = objectMapper.readValue(json, ConversationContentWheelPicker.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_id() {
        ConversationContentWheelPicker result = instance.id(null);
        assertSame(instance, result, "Fluent setter for id should return the same instance");
    }

    @Test
    public void testFluentSetter_items() {
        ConversationContentWheelPicker result = instance.items(null);
        assertSame(instance, result, "Fluent setter for items should return the same instance");
    }
}
