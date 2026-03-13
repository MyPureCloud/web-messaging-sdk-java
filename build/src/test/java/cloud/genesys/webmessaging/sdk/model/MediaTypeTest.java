package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for MediaType enum.
 */
public class MediaTypeTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testFromStringNull() {
        assertNull(MediaType.fromString(null));
    }

    @Test
    public void testFromStringUnknownReturnsFallback() {
        MediaType result = MediaType.fromString("NonExistentValue_XYZ");
        assertEquals(MediaType.values()[0], result);
    }

    @Test
    public void testAllValuesHaveNonNullToString() {
        for (MediaType value : MediaType.values()) {
            assertNotNull(value.toString(), "toString() should not be null for " + value.name());
            assertFalse(value.toString().isEmpty(), "toString() should not be empty for " + value.name());
        }
    }

    @Test
    public void testFromStringCaseInsensitive() {
        for (MediaType value : MediaType.values()) {
            assertEquals(value, MediaType.fromString(value.toString().toLowerCase()),
                    "fromString should be case-insensitive for " + value.name());
        }
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        for (MediaType value : MediaType.values()) {
            String json = objectMapper.writeValueAsString(value);
            MediaType deserialized = objectMapper.readValue(json, MediaType.class);
            assertEquals(value, deserialized, "Round-trip failed for " + value.name());
        }
    }

    @Test
    public void testJsonDeserializationUnknownValue() throws Exception {
        MediaType result = objectMapper.readValue("\"SomethingUnknown_XYZ\"", MediaType.class);
        assertEquals(MediaType.values()[0], result);
    }
}
