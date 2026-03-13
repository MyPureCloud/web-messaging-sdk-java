package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for RequestTypeDeleteAttachment enum.
 */
public class RequestTypeDeleteAttachmentTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testFromStringNull() {
        assertNull(RequestTypeDeleteAttachment.fromString(null));
    }

    @Test
    public void testFromStringUnknownReturnsFallback() {
        RequestTypeDeleteAttachment result = RequestTypeDeleteAttachment.fromString("NonExistentValue_XYZ");
        assertEquals(RequestTypeDeleteAttachment.values()[0], result);
    }

    @Test
    public void testAllValuesHaveNonNullToString() {
        for (RequestTypeDeleteAttachment value : RequestTypeDeleteAttachment.values()) {
            assertNotNull(value.toString(), "toString() should not be null for " + value.name());
            assertFalse(value.toString().isEmpty(), "toString() should not be empty for " + value.name());
        }
    }

    @Test
    public void testFromStringCaseInsensitive() {
        for (RequestTypeDeleteAttachment value : RequestTypeDeleteAttachment.values()) {
            assertEquals(value, RequestTypeDeleteAttachment.fromString(value.toString().toLowerCase()),
                    "fromString should be case-insensitive for " + value.name());
        }
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        for (RequestTypeDeleteAttachment value : RequestTypeDeleteAttachment.values()) {
            String json = objectMapper.writeValueAsString(value);
            RequestTypeDeleteAttachment deserialized = objectMapper.readValue(json, RequestTypeDeleteAttachment.class);
            assertEquals(value, deserialized, "Round-trip failed for " + value.name());
        }
    }

    @Test
    public void testJsonDeserializationUnknownValue() throws Exception {
        RequestTypeDeleteAttachment result = objectMapper.readValue("\"SomethingUnknown_XYZ\"", RequestTypeDeleteAttachment.class);
        assertEquals(RequestTypeDeleteAttachment.values()[0], result);
    }
}
