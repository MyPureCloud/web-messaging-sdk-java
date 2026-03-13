package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for RequestTypeGenerateUploadUrl enum.
 */
public class RequestTypeGenerateUploadUrlTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testFromStringNull() {
        assertNull(RequestTypeGenerateUploadUrl.fromString(null));
    }

    @Test
    public void testFromStringUnknownReturnsFallback() {
        RequestTypeGenerateUploadUrl result = RequestTypeGenerateUploadUrl.fromString("NonExistentValue_XYZ");
        assertEquals(RequestTypeGenerateUploadUrl.values()[0], result);
    }

    @Test
    public void testAllValuesHaveNonNullToString() {
        for (RequestTypeGenerateUploadUrl value : RequestTypeGenerateUploadUrl.values()) {
            assertNotNull(value.toString(), "toString() should not be null for " + value.name());
            assertFalse(value.toString().isEmpty(), "toString() should not be empty for " + value.name());
        }
    }

    @Test
    public void testFromStringCaseInsensitive() {
        for (RequestTypeGenerateUploadUrl value : RequestTypeGenerateUploadUrl.values()) {
            assertEquals(value, RequestTypeGenerateUploadUrl.fromString(value.toString().toLowerCase()),
                    "fromString should be case-insensitive for " + value.name());
        }
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        for (RequestTypeGenerateUploadUrl value : RequestTypeGenerateUploadUrl.values()) {
            String json = objectMapper.writeValueAsString(value);
            RequestTypeGenerateUploadUrl deserialized = objectMapper.readValue(json, RequestTypeGenerateUploadUrl.class);
            assertEquals(value, deserialized, "Round-trip failed for " + value.name());
        }
    }

    @Test
    public void testJsonDeserializationUnknownValue() throws Exception {
        RequestTypeGenerateUploadUrl result = objectMapper.readValue("\"SomethingUnknown_XYZ\"", RequestTypeGenerateUploadUrl.class);
        assertEquals(RequestTypeGenerateUploadUrl.values()[0], result);
    }
}
