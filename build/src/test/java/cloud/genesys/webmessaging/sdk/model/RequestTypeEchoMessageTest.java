package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for RequestTypeEchoMessage enum.
 */
public class RequestTypeEchoMessageTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testFromStringNull() {
        assertNull(RequestTypeEchoMessage.fromString(null));
    }

    @Test
    public void testFromStringUnknownReturnsFallback() {
        RequestTypeEchoMessage result = RequestTypeEchoMessage.fromString("NonExistentValue_XYZ");
        assertEquals(RequestTypeEchoMessage.values()[0], result);
    }

    @Test
    public void testAllValuesHaveNonNullToString() {
        for (RequestTypeEchoMessage value : RequestTypeEchoMessage.values()) {
            assertNotNull(value.toString(), "toString() should not be null for " + value.name());
            assertFalse(value.toString().isEmpty(), "toString() should not be empty for " + value.name());
        }
    }

    @Test
    public void testFromStringCaseInsensitive() {
        for (RequestTypeEchoMessage value : RequestTypeEchoMessage.values()) {
            assertEquals(value, RequestTypeEchoMessage.fromString(value.toString().toLowerCase()),
                    "fromString should be case-insensitive for " + value.name());
        }
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        for (RequestTypeEchoMessage value : RequestTypeEchoMessage.values()) {
            String json = objectMapper.writeValueAsString(value);
            RequestTypeEchoMessage deserialized = objectMapper.readValue(json, RequestTypeEchoMessage.class);
            assertEquals(value, deserialized, "Round-trip failed for " + value.name());
        }
    }

    @Test
    public void testJsonDeserializationUnknownValue() throws Exception {
        RequestTypeEchoMessage result = objectMapper.readValue("\"SomethingUnknown_XYZ\"", RequestTypeEchoMessage.class);
        assertEquals(RequestTypeEchoMessage.values()[0], result);
    }
}
