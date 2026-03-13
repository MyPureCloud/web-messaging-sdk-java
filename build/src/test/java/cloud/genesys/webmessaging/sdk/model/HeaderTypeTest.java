package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for HeaderType enum.
 */
public class HeaderTypeTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testFromStringNull() {
        assertNull(HeaderType.fromString(null));
    }

    @Test
    public void testFromStringUnknownReturnsFallback() {
        HeaderType result = HeaderType.fromString("NonExistentValue_XYZ");
        assertEquals(HeaderType.values()[0], result);
    }

    @Test
    public void testAllValuesHaveNonNullToString() {
        for (HeaderType value : HeaderType.values()) {
            assertNotNull(value.toString(), "toString() should not be null for " + value.name());
            assertFalse(value.toString().isEmpty(), "toString() should not be empty for " + value.name());
        }
    }

    @Test
    public void testFromStringCaseInsensitive() {
        for (HeaderType value : HeaderType.values()) {
            assertEquals(value, HeaderType.fromString(value.toString().toLowerCase()),
                    "fromString should be case-insensitive for " + value.name());
        }
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        for (HeaderType value : HeaderType.values()) {
            String json = objectMapper.writeValueAsString(value);
            HeaderType deserialized = objectMapper.readValue(json, HeaderType.class);
            assertEquals(value, deserialized, "Round-trip failed for " + value.name());
        }
    }

    @Test
    public void testJsonDeserializationUnknownValue() throws Exception {
        HeaderType result = objectMapper.readValue("\"SomethingUnknown_XYZ\"", HeaderType.class);
        assertEquals(HeaderType.values()[0], result);
    }
}
