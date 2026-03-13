package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for NormalizedType enum.
 */
public class NormalizedTypeTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testFromStringNull() {
        assertNull(NormalizedType.fromString(null));
    }

    @Test
    public void testFromStringUnknownReturnsFallback() {
        NormalizedType result = NormalizedType.fromString("NonExistentValue_XYZ");
        assertEquals(NormalizedType.values()[0], result);
    }

    @Test
    public void testAllValuesHaveNonNullToString() {
        for (NormalizedType value : NormalizedType.values()) {
            assertNotNull(value.toString(), "toString() should not be null for " + value.name());
            assertFalse(value.toString().isEmpty(), "toString() should not be empty for " + value.name());
        }
    }

    @Test
    public void testFromStringCaseInsensitive() {
        for (NormalizedType value : NormalizedType.values()) {
            assertEquals(value, NormalizedType.fromString(value.toString().toLowerCase()),
                    "fromString should be case-insensitive for " + value.name());
        }
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        for (NormalizedType value : NormalizedType.values()) {
            String json = objectMapper.writeValueAsString(value);
            NormalizedType deserialized = objectMapper.readValue(json, NormalizedType.class);
            assertEquals(value, deserialized, "Round-trip failed for " + value.name());
        }
    }

    @Test
    public void testJsonDeserializationUnknownValue() throws Exception {
        NormalizedType result = objectMapper.readValue("\"SomethingUnknown_XYZ\"", NormalizedType.class);
        assertEquals(NormalizedType.values()[0], result);
    }
}
