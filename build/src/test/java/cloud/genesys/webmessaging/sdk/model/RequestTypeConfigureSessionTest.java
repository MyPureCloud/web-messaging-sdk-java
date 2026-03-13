package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for RequestTypeConfigureSession enum.
 */
public class RequestTypeConfigureSessionTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testFromStringNull() {
        assertNull(RequestTypeConfigureSession.fromString(null));
    }

    @Test
    public void testFromStringUnknownReturnsFallback() {
        RequestTypeConfigureSession result = RequestTypeConfigureSession.fromString("NonExistentValue_XYZ");
        assertEquals(RequestTypeConfigureSession.values()[0], result);
    }

    @Test
    public void testAllValuesHaveNonNullToString() {
        for (RequestTypeConfigureSession value : RequestTypeConfigureSession.values()) {
            assertNotNull(value.toString(), "toString() should not be null for " + value.name());
            assertFalse(value.toString().isEmpty(), "toString() should not be empty for " + value.name());
        }
    }

    @Test
    public void testFromStringCaseInsensitive() {
        for (RequestTypeConfigureSession value : RequestTypeConfigureSession.values()) {
            assertEquals(value, RequestTypeConfigureSession.fromString(value.toString().toLowerCase()),
                    "fromString should be case-insensitive for " + value.name());
        }
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        for (RequestTypeConfigureSession value : RequestTypeConfigureSession.values()) {
            String json = objectMapper.writeValueAsString(value);
            RequestTypeConfigureSession deserialized = objectMapper.readValue(json, RequestTypeConfigureSession.class);
            assertEquals(value, deserialized, "Round-trip failed for " + value.name());
        }
    }

    @Test
    public void testJsonDeserializationUnknownValue() throws Exception {
        RequestTypeConfigureSession result = objectMapper.readValue("\"SomethingUnknown_XYZ\"", RequestTypeConfigureSession.class);
        assertEquals(RequestTypeConfigureSession.values()[0], result);
    }
}
