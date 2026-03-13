package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for Provider enum.
 */
public class ProviderTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testFromStringNull() {
        assertNull(Provider.fromString(null));
    }

    @Test
    public void testFromStringUnknownReturnsFallback() {
        Provider result = Provider.fromString("NonExistentValue_XYZ");
        assertEquals(Provider.values()[0], result);
    }

    @Test
    public void testAllValuesHaveNonNullToString() {
        for (Provider value : Provider.values()) {
            assertNotNull(value.toString(), "toString() should not be null for " + value.name());
            assertFalse(value.toString().isEmpty(), "toString() should not be empty for " + value.name());
        }
    }

    @Test
    public void testFromStringCaseInsensitive() {
        for (Provider value : Provider.values()) {
            assertEquals(value, Provider.fromString(value.toString().toLowerCase()),
                    "fromString should be case-insensitive for " + value.name());
        }
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        for (Provider value : Provider.values()) {
            String json = objectMapper.writeValueAsString(value);
            Provider deserialized = objectMapper.readValue(json, Provider.class);
            assertEquals(value, deserialized, "Round-trip failed for " + value.name());
        }
    }

    @Test
    public void testJsonDeserializationUnknownValue() throws Exception {
        Provider result = objectMapper.readValue("\"SomethingUnknown_XYZ\"", Provider.class);
        assertEquals(Provider.values()[0], result);
    }
}
