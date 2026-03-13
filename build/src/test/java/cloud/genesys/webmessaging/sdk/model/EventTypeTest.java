package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for EventType enum.
 */
public class EventTypeTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testFromStringNull() {
        assertNull(EventType.fromString(null));
    }

    @Test
    public void testFromStringUnknownReturnsFallback() {
        EventType result = EventType.fromString("NonExistentValue_XYZ");
        assertEquals(EventType.values()[0], result);
    }

    @Test
    public void testAllValuesHaveNonNullToString() {
        for (EventType value : EventType.values()) {
            assertNotNull(value.toString(), "toString() should not be null for " + value.name());
            assertFalse(value.toString().isEmpty(), "toString() should not be empty for " + value.name());
        }
    }

    @Test
    public void testFromStringCaseInsensitive() {
        for (EventType value : EventType.values()) {
            assertEquals(value, EventType.fromString(value.toString().toLowerCase()),
                    "fromString should be case-insensitive for " + value.name());
        }
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        for (EventType value : EventType.values()) {
            String json = objectMapper.writeValueAsString(value);
            EventType deserialized = objectMapper.readValue(json, EventType.class);
            assertEquals(value, deserialized, "Round-trip failed for " + value.name());
        }
    }

    @Test
    public void testJsonDeserializationUnknownValue() throws Exception {
        EventType result = objectMapper.readValue("\"SomethingUnknown_XYZ\"", EventType.class);
        assertEquals(EventType.values()[0], result);
    }
}
