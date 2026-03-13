package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for RequestType enum.
 */
public class RequestTypeTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testFromStringNull() {
        assertNull(RequestType.fromString(null));
    }

    @Test
    public void testFromStringUnknownReturnsFallback() {
        RequestType result = RequestType.fromString("NonExistentValue_XYZ");
        assertEquals(RequestType.values()[0], result);
    }

    @Test
    public void testAllValuesHaveNonNullToString() {
        for (RequestType value : RequestType.values()) {
            assertNotNull(value.toString(), "toString() should not be null for " + value.name());
            assertFalse(value.toString().isEmpty(), "toString() should not be empty for " + value.name());
        }
    }

    @Test
    public void testFromStringCaseInsensitive() {
        for (RequestType value : RequestType.values()) {
            assertEquals(value, RequestType.fromString(value.toString().toLowerCase()),
                    "fromString should be case-insensitive for " + value.name());
        }
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        for (RequestType value : RequestType.values()) {
            String json = objectMapper.writeValueAsString(value);
            RequestType deserialized = objectMapper.readValue(json, RequestType.class);
            assertEquals(value, deserialized, "Round-trip failed for " + value.name());
        }
    }

    @Test
    public void testJsonDeserializationUnknownValue() throws Exception {
        RequestType result = objectMapper.readValue("\"SomethingUnknown_XYZ\"", RequestType.class);
        assertEquals(RequestType.values()[0], result);
    }
}
