package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for ContentListPicker model.
 */
public class ContentListPickerTest {

    private ContentListPicker instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new ContentListPicker();
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
        ContentListPicker a = new ContentListPicker();
        ContentListPicker b = new ContentListPicker();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        ContentListPicker a = new ContentListPicker();
        ContentListPicker b = new ContentListPicker();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class ContentListPicker"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        ContentListPicker deserialized = objectMapper.readValue(json, ContentListPicker.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_id() {
        ContentListPicker result = instance.id(null);
        assertSame(instance, result, "Fluent setter for id should return the same instance");
    }

    @Test
    public void testFluentSetter_receivedMessage() {
        ContentListPicker result = instance.receivedMessage(null);
        assertSame(instance, result, "Fluent setter for receivedMessage should return the same instance");
    }

    @Test
    public void testFluentSetter_replyMessage() {
        ContentListPicker result = instance.replyMessage(null);
        assertSame(instance, result, "Fluent setter for replyMessage should return the same instance");
    }

    @Test
    public void testFluentSetter_sections() {
        ContentListPicker result = instance.sections(null);
        assertSame(instance, result, "Fluent setter for sections should return the same instance");
    }
}
