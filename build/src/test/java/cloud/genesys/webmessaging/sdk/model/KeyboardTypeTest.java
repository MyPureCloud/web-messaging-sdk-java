package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for KeyboardType enum.
 */
public class KeyboardTypeTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testFromStringNull() {
        assertNull(KeyboardType.fromString(null));
    }

    @Test
    public void testFromStringUnknownReturnsFallback() {
        KeyboardType result = KeyboardType.fromString("NonExistentValue_XYZ");
        assertEquals(KeyboardType.values()[0], result);
    }

    @Test
    public void testAllValuesHaveNonNullToString() {
        for (KeyboardType value : KeyboardType.values()) {
            assertNotNull(value.toString(), "toString() should not be null for " + value.name());
            assertFalse(value.toString().isEmpty(), "toString() should not be empty for " + value.name());
        }
    }

    @Test
    public void testFromStringCaseInsensitive() {
        for (KeyboardType value : KeyboardType.values()) {
            assertEquals(value, KeyboardType.fromString(value.toString().toLowerCase()),
                    "fromString should be case-insensitive for " + value.name());
        }
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        for (KeyboardType value : KeyboardType.values()) {
            String json = objectMapper.writeValueAsString(value);
            KeyboardType deserialized = objectMapper.readValue(json, KeyboardType.class);
            assertEquals(value, deserialized, "Round-trip failed for " + value.name());
        }
    }

    @Test
    public void testJsonDeserializationUnknownValue() throws Exception {
        KeyboardType result = objectMapper.readValue("\"SomethingUnknown_XYZ\"", KeyboardType.class);
        assertEquals(KeyboardType.values()[0], result);
    }
}
