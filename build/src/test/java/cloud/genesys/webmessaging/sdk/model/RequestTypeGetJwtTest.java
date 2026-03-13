package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for RequestTypeGetJwt enum.
 */
public class RequestTypeGetJwtTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testFromStringNull() {
        assertNull(RequestTypeGetJwt.fromString(null));
    }

    @Test
    public void testFromStringUnknownReturnsFallback() {
        RequestTypeGetJwt result = RequestTypeGetJwt.fromString("NonExistentValue_XYZ");
        assertEquals(RequestTypeGetJwt.values()[0], result);
    }

    @Test
    public void testAllValuesHaveNonNullToString() {
        for (RequestTypeGetJwt value : RequestTypeGetJwt.values()) {
            assertNotNull(value.toString(), "toString() should not be null for " + value.name());
            assertFalse(value.toString().isEmpty(), "toString() should not be empty for " + value.name());
        }
    }

    @Test
    public void testFromStringCaseInsensitive() {
        for (RequestTypeGetJwt value : RequestTypeGetJwt.values()) {
            assertEquals(value, RequestTypeGetJwt.fromString(value.toString().toLowerCase()),
                    "fromString should be case-insensitive for " + value.name());
        }
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        for (RequestTypeGetJwt value : RequestTypeGetJwt.values()) {
            String json = objectMapper.writeValueAsString(value);
            RequestTypeGetJwt deserialized = objectMapper.readValue(json, RequestTypeGetJwt.class);
            assertEquals(value, deserialized, "Round-trip failed for " + value.name());
        }
    }

    @Test
    public void testJsonDeserializationUnknownValue() throws Exception {
        RequestTypeGetJwt result = objectMapper.readValue("\"SomethingUnknown_XYZ\"", RequestTypeGetJwt.class);
        assertEquals(RequestTypeGetJwt.values()[0], result);
    }
}
