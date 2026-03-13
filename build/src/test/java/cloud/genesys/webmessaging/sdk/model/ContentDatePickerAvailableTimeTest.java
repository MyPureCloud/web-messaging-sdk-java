package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for ContentDatePickerAvailableTime model.
 */
public class ContentDatePickerAvailableTimeTest {

    private ContentDatePickerAvailableTime instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new ContentDatePickerAvailableTime();
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
        ContentDatePickerAvailableTime a = new ContentDatePickerAvailableTime();
        ContentDatePickerAvailableTime b = new ContentDatePickerAvailableTime();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        ContentDatePickerAvailableTime a = new ContentDatePickerAvailableTime();
        ContentDatePickerAvailableTime b = new ContentDatePickerAvailableTime();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class ContentDatePickerAvailableTime"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        ContentDatePickerAvailableTime deserialized = objectMapper.readValue(json, ContentDatePickerAvailableTime.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_duration() {
        ContentDatePickerAvailableTime result = instance.duration(null);
        assertSame(instance, result, "Fluent setter for duration should return the same instance");
    }

    @Test
    public void testFluentSetter_dateTime() {
        ContentDatePickerAvailableTime result = instance.dateTime(null);
        assertSame(instance, result, "Fluent setter for dateTime should return the same instance");
    }
}
