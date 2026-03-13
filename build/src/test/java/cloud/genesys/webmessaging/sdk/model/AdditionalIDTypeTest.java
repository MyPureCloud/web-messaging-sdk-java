package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for AdditionalIDType enum.
 */
public class AdditionalIDTypeTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testFromStringNull() {
        assertNull(AdditionalIDType.fromString(null));
    }

    @Test
    public void testFromStringUnknownReturnsFallback() {
        AdditionalIDType result = AdditionalIDType.fromString("NonExistentValue_XYZ");
        assertEquals(AdditionalIDType.values()[0], result);
    }

    @Test
    public void testAllValuesHaveNonNullToString() {
        for (AdditionalIDType value : AdditionalIDType.values()) {
            assertNotNull(value.toString(), "toString() should not be null for " + value.name());
            assertFalse(value.toString().isEmpty(), "toString() should not be empty for " + value.name());
        }
    }

    @Test
    public void testFromStringCaseInsensitive() {
        for (AdditionalIDType value : AdditionalIDType.values()) {
            assertEquals(value, AdditionalIDType.fromString(value.toString().toLowerCase()),
                    "fromString should be case-insensitive for " + value.name());
        }
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        for (AdditionalIDType value : AdditionalIDType.values()) {
            String json = objectMapper.writeValueAsString(value);
            AdditionalIDType deserialized = objectMapper.readValue(json, AdditionalIDType.class);
            assertEquals(value, deserialized, "Round-trip failed for " + value.name());
        }
    }

    @Test
    public void testJsonDeserializationUnknownValue() throws Exception {
        AdditionalIDType result = objectMapper.readValue("\"SomethingUnknown_XYZ\"", AdditionalIDType.class);
        assertEquals(AdditionalIDType.values()[0], result);
    }
}
