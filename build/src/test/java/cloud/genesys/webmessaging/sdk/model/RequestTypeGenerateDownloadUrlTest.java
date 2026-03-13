package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for RequestTypeGenerateDownloadUrl enum.
 */
public class RequestTypeGenerateDownloadUrlTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testFromStringNull() {
        assertNull(RequestTypeGenerateDownloadUrl.fromString(null));
    }

    @Test
    public void testFromStringUnknownReturnsFallback() {
        RequestTypeGenerateDownloadUrl result = RequestTypeGenerateDownloadUrl.fromString("NonExistentValue_XYZ");
        assertEquals(RequestTypeGenerateDownloadUrl.values()[0], result);
    }

    @Test
    public void testAllValuesHaveNonNullToString() {
        for (RequestTypeGenerateDownloadUrl value : RequestTypeGenerateDownloadUrl.values()) {
            assertNotNull(value.toString(), "toString() should not be null for " + value.name());
            assertFalse(value.toString().isEmpty(), "toString() should not be empty for " + value.name());
        }
    }

    @Test
    public void testFromStringCaseInsensitive() {
        for (RequestTypeGenerateDownloadUrl value : RequestTypeGenerateDownloadUrl.values()) {
            assertEquals(value, RequestTypeGenerateDownloadUrl.fromString(value.toString().toLowerCase()),
                    "fromString should be case-insensitive for " + value.name());
        }
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        for (RequestTypeGenerateDownloadUrl value : RequestTypeGenerateDownloadUrl.values()) {
            String json = objectMapper.writeValueAsString(value);
            RequestTypeGenerateDownloadUrl deserialized = objectMapper.readValue(json, RequestTypeGenerateDownloadUrl.class);
            assertEquals(value, deserialized, "Round-trip failed for " + value.name());
        }
    }

    @Test
    public void testJsonDeserializationUnknownValue() throws Exception {
        RequestTypeGenerateDownloadUrl result = objectMapper.readValue("\"SomethingUnknown_XYZ\"", RequestTypeGenerateDownloadUrl.class);
        assertEquals(RequestTypeGenerateDownloadUrl.values()[0], result);
    }
}
