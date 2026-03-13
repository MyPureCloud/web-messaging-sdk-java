package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for EventTypingType enum.
 */
public class EventTypingTypeTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testFromStringNull() {
        assertNull(EventTypingType.fromString(null));
    }

    @Test
    public void testFromStringUnknownReturnsFallback() {
        EventTypingType result = EventTypingType.fromString("NonExistentValue_XYZ");
        assertEquals(EventTypingType.values()[0], result);
    }

    @Test
    public void testAllValuesHaveNonNullToString() {
        for (EventTypingType value : EventTypingType.values()) {
            assertNotNull(value.toString(), "toString() should not be null for " + value.name());
            assertFalse(value.toString().isEmpty(), "toString() should not be empty for " + value.name());
        }
    }

    @Test
    public void testFromStringCaseInsensitive() {
        for (EventTypingType value : EventTypingType.values()) {
            assertEquals(value, EventTypingType.fromString(value.toString().toLowerCase()),
                    "fromString should be case-insensitive for " + value.name());
        }
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        for (EventTypingType value : EventTypingType.values()) {
            String json = objectMapper.writeValueAsString(value);
            EventTypingType deserialized = objectMapper.readValue(json, EventTypingType.class);
            assertEquals(value, deserialized, "Round-trip failed for " + value.name());
        }
    }

    @Test
    public void testJsonDeserializationUnknownValue() throws Exception {
        EventTypingType result = objectMapper.readValue("\"SomethingUnknown_XYZ\"", EventTypingType.class);
        assertEquals(EventTypingType.values()[0], result);
    }
}
