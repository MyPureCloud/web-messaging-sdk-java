package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for IDType enum.
 */
public class IDTypeTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testFromStringNull() {
        assertNull(IDType.fromString(null));
    }

    @Test
    public void testFromStringUnknownReturnsFallback() {
        IDType result = IDType.fromString("NonExistentValue_XYZ");
        assertEquals(IDType.values()[0], result);
    }

    @Test
    public void testAllValuesHaveNonNullToString() {
        for (IDType value : IDType.values()) {
            assertNotNull(value.toString(), "toString() should not be null for " + value.name());
            assertFalse(value.toString().isEmpty(), "toString() should not be empty for " + value.name());
        }
    }

    @Test
    public void testFromStringCaseInsensitive() {
        for (IDType value : IDType.values()) {
            assertEquals(value, IDType.fromString(value.toString().toLowerCase()),
                    "fromString should be case-insensitive for " + value.name());
        }
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        for (IDType value : IDType.values()) {
            String json = objectMapper.writeValueAsString(value);
            IDType deserialized = objectMapper.readValue(json, IDType.class);
            assertEquals(value, deserialized, "Round-trip failed for " + value.name());
        }
    }

    @Test
    public void testJsonDeserializationUnknownValue() throws Exception {
        IDType result = objectMapper.readValue("\"SomethingUnknown_XYZ\"", IDType.class);
        assertEquals(IDType.values()[0], result);
    }
}
