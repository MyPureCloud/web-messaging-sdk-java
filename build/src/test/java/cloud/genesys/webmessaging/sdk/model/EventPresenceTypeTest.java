package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for EventPresenceType enum.
 */
public class EventPresenceTypeTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testFromStringNull() {
        assertNull(EventPresenceType.fromString(null));
    }

    @Test
    public void testFromStringUnknownReturnsFallback() {
        EventPresenceType result = EventPresenceType.fromString("NonExistentValue_XYZ");
        assertEquals(EventPresenceType.values()[0], result);
    }

    @Test
    public void testAllValuesHaveNonNullToString() {
        for (EventPresenceType value : EventPresenceType.values()) {
            assertNotNull(value.toString(), "toString() should not be null for " + value.name());
            assertFalse(value.toString().isEmpty(), "toString() should not be empty for " + value.name());
        }
    }

    @Test
    public void testFromStringCaseInsensitive() {
        for (EventPresenceType value : EventPresenceType.values()) {
            assertEquals(value, EventPresenceType.fromString(value.toString().toLowerCase()),
                    "fromString should be case-insensitive for " + value.name());
        }
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        for (EventPresenceType value : EventPresenceType.values()) {
            String json = objectMapper.writeValueAsString(value);
            EventPresenceType deserialized = objectMapper.readValue(json, EventPresenceType.class);
            assertEquals(value, deserialized, "Round-trip failed for " + value.name());
        }
    }

    @Test
    public void testJsonDeserializationUnknownValue() throws Exception {
        EventPresenceType result = objectMapper.readValue("\"SomethingUnknown_XYZ\"", EventPresenceType.class);
        assertEquals(EventPresenceType.values()[0], result);
    }
}
