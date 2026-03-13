package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for RequestTypeCloseSession enum.
 */
public class RequestTypeCloseSessionTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testFromStringNull() {
        assertNull(RequestTypeCloseSession.fromString(null));
    }

    @Test
    public void testFromStringUnknownReturnsFallback() {
        RequestTypeCloseSession result = RequestTypeCloseSession.fromString("NonExistentValue_XYZ");
        assertEquals(RequestTypeCloseSession.values()[0], result);
    }

    @Test
    public void testAllValuesHaveNonNullToString() {
        for (RequestTypeCloseSession value : RequestTypeCloseSession.values()) {
            assertNotNull(value.toString(), "toString() should not be null for " + value.name());
            assertFalse(value.toString().isEmpty(), "toString() should not be empty for " + value.name());
        }
    }

    @Test
    public void testFromStringCaseInsensitive() {
        for (RequestTypeCloseSession value : RequestTypeCloseSession.values()) {
            assertEquals(value, RequestTypeCloseSession.fromString(value.toString().toLowerCase()),
                    "fromString should be case-insensitive for " + value.name());
        }
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        for (RequestTypeCloseSession value : RequestTypeCloseSession.values()) {
            String json = objectMapper.writeValueAsString(value);
            RequestTypeCloseSession deserialized = objectMapper.readValue(json, RequestTypeCloseSession.class);
            assertEquals(value, deserialized, "Round-trip failed for " + value.name());
        }
    }

    @Test
    public void testJsonDeserializationUnknownValue() throws Exception {
        RequestTypeCloseSession result = objectMapper.readValue("\"SomethingUnknown_XYZ\"", RequestTypeCloseSession.class);
        assertEquals(RequestTypeCloseSession.values()[0], result);
    }
}
