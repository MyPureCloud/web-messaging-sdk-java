package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for EventTypeEnum enum.
 */
public class EventTypeEnumTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testFromStringNull() {
        assertNull(EventTypeEnum.fromString(null));
    }

    @Test
    public void testFromStringUnknownReturnsFallback() {
        EventTypeEnum result = EventTypeEnum.fromString("NonExistentValue_XYZ");
        assertEquals(EventTypeEnum.values()[0], result);
    }

    @Test
    public void testAllValuesHaveNonNullToString() {
        for (EventTypeEnum value : EventTypeEnum.values()) {
            assertNotNull(value.toString(), "toString() should not be null for " + value.name());
            assertFalse(value.toString().isEmpty(), "toString() should not be empty for " + value.name());
        }
    }

    @Test
    public void testFromStringCaseInsensitive() {
        for (EventTypeEnum value : EventTypeEnum.values()) {
            assertEquals(value, EventTypeEnum.fromString(value.toString().toLowerCase()),
                    "fromString should be case-insensitive for " + value.name());
        }
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        for (EventTypeEnum value : EventTypeEnum.values()) {
            String json = objectMapper.writeValueAsString(value);
            EventTypeEnum deserialized = objectMapper.readValue(json, EventTypeEnum.class);
            assertEquals(value, deserialized, "Round-trip failed for " + value.name());
        }
    }

    @Test
    public void testJsonDeserializationUnknownValue() throws Exception {
        EventTypeEnum result = objectMapper.readValue("\"SomethingUnknown_XYZ\"", EventTypeEnum.class);
        assertEquals(EventTypeEnum.values()[0], result);
    }
}
