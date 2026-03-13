package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for DateDisplayFormat enum.
 */
public class DateDisplayFormatTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testFromStringNull() {
        assertNull(DateDisplayFormat.fromString(null));
    }

    @Test
    public void testFromStringUnknownReturnsFallback() {
        DateDisplayFormat result = DateDisplayFormat.fromString("NonExistentValue_XYZ");
        assertEquals(DateDisplayFormat.values()[0], result);
    }

    @Test
    public void testAllValuesHaveNonNullToString() {
        for (DateDisplayFormat value : DateDisplayFormat.values()) {
            assertNotNull(value.toString(), "toString() should not be null for " + value.name());
            assertFalse(value.toString().isEmpty(), "toString() should not be empty for " + value.name());
        }
    }

    @Test
    public void testFromStringCaseInsensitive() {
        for (DateDisplayFormat value : DateDisplayFormat.values()) {
            assertEquals(value, DateDisplayFormat.fromString(value.toString().toLowerCase()),
                    "fromString should be case-insensitive for " + value.name());
        }
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        for (DateDisplayFormat value : DateDisplayFormat.values()) {
            String json = objectMapper.writeValueAsString(value);
            DateDisplayFormat deserialized = objectMapper.readValue(json, DateDisplayFormat.class);
            assertEquals(value, deserialized, "Round-trip failed for " + value.name());
        }
    }

    @Test
    public void testJsonDeserializationUnknownValue() throws Exception {
        DateDisplayFormat result = objectMapper.readValue("\"SomethingUnknown_XYZ\"", DateDisplayFormat.class);
        assertEquals(DateDisplayFormat.values()[0], result);
    }
}
