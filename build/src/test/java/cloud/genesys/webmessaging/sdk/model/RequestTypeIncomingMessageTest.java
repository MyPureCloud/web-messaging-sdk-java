package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for RequestTypeIncomingMessage enum.
 */
public class RequestTypeIncomingMessageTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testFromStringNull() {
        assertNull(RequestTypeIncomingMessage.fromString(null));
    }

    @Test
    public void testFromStringUnknownReturnsFallback() {
        RequestTypeIncomingMessage result = RequestTypeIncomingMessage.fromString("NonExistentValue_XYZ");
        assertEquals(RequestTypeIncomingMessage.values()[0], result);
    }

    @Test
    public void testAllValuesHaveNonNullToString() {
        for (RequestTypeIncomingMessage value : RequestTypeIncomingMessage.values()) {
            assertNotNull(value.toString(), "toString() should not be null for " + value.name());
            assertFalse(value.toString().isEmpty(), "toString() should not be empty for " + value.name());
        }
    }

    @Test
    public void testFromStringCaseInsensitive() {
        for (RequestTypeIncomingMessage value : RequestTypeIncomingMessage.values()) {
            assertEquals(value, RequestTypeIncomingMessage.fromString(value.toString().toLowerCase()),
                    "fromString should be case-insensitive for " + value.name());
        }
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        for (RequestTypeIncomingMessage value : RequestTypeIncomingMessage.values()) {
            String json = objectMapper.writeValueAsString(value);
            RequestTypeIncomingMessage deserialized = objectMapper.readValue(json, RequestTypeIncomingMessage.class);
            assertEquals(value, deserialized, "Round-trip failed for " + value.name());
        }
    }

    @Test
    public void testJsonDeserializationUnknownValue() throws Exception {
        RequestTypeIncomingMessage result = objectMapper.readValue("\"SomethingUnknown_XYZ\"", RequestTypeIncomingMessage.class);
        assertEquals(RequestTypeIncomingMessage.values()[0], result);
    }
}
