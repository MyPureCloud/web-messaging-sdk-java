package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for RequestTypeConfigureAuthenticatedSession enum.
 */
public class RequestTypeConfigureAuthenticatedSessionTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testFromStringNull() {
        assertNull(RequestTypeConfigureAuthenticatedSession.fromString(null));
    }

    @Test
    public void testFromStringUnknownReturnsFallback() {
        RequestTypeConfigureAuthenticatedSession result = RequestTypeConfigureAuthenticatedSession.fromString("NonExistentValue_XYZ");
        assertEquals(RequestTypeConfigureAuthenticatedSession.values()[0], result);
    }

    @Test
    public void testAllValuesHaveNonNullToString() {
        for (RequestTypeConfigureAuthenticatedSession value : RequestTypeConfigureAuthenticatedSession.values()) {
            assertNotNull(value.toString(), "toString() should not be null for " + value.name());
            assertFalse(value.toString().isEmpty(), "toString() should not be empty for " + value.name());
        }
    }

    @Test
    public void testFromStringCaseInsensitive() {
        for (RequestTypeConfigureAuthenticatedSession value : RequestTypeConfigureAuthenticatedSession.values()) {
            assertEquals(value, RequestTypeConfigureAuthenticatedSession.fromString(value.toString().toLowerCase()),
                    "fromString should be case-insensitive for " + value.name());
        }
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        for (RequestTypeConfigureAuthenticatedSession value : RequestTypeConfigureAuthenticatedSession.values()) {
            String json = objectMapper.writeValueAsString(value);
            RequestTypeConfigureAuthenticatedSession deserialized = objectMapper.readValue(json, RequestTypeConfigureAuthenticatedSession.class);
            assertEquals(value, deserialized, "Round-trip failed for " + value.name());
        }
    }

    @Test
    public void testJsonDeserializationUnknownValue() throws Exception {
        RequestTypeConfigureAuthenticatedSession result = objectMapper.readValue("\"SomethingUnknown_XYZ\"", RequestTypeConfigureAuthenticatedSession.class);
        assertEquals(RequestTypeConfigureAuthenticatedSession.values()[0], result);
    }
}
