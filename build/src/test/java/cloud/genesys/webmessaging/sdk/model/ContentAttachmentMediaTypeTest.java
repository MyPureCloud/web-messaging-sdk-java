package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for ContentAttachmentMediaType enum.
 */
public class ContentAttachmentMediaTypeTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testFromStringNull() {
        assertNull(ContentAttachmentMediaType.fromString(null));
    }

    @Test
    public void testFromStringUnknownReturnsFallback() {
        ContentAttachmentMediaType result = ContentAttachmentMediaType.fromString("NonExistentValue_XYZ");
        assertEquals(ContentAttachmentMediaType.values()[0], result);
    }

    @Test
    public void testAllValuesHaveNonNullToString() {
        for (ContentAttachmentMediaType value : ContentAttachmentMediaType.values()) {
            assertNotNull(value.toString(), "toString() should not be null for " + value.name());
            assertFalse(value.toString().isEmpty(), "toString() should not be empty for " + value.name());
        }
    }

    @Test
    public void testFromStringCaseInsensitive() {
        for (ContentAttachmentMediaType value : ContentAttachmentMediaType.values()) {
            assertEquals(value, ContentAttachmentMediaType.fromString(value.toString().toLowerCase()),
                    "fromString should be case-insensitive for " + value.name());
        }
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        for (ContentAttachmentMediaType value : ContentAttachmentMediaType.values()) {
            String json = objectMapper.writeValueAsString(value);
            ContentAttachmentMediaType deserialized = objectMapper.readValue(json, ContentAttachmentMediaType.class);
            assertEquals(value, deserialized, "Round-trip failed for " + value.name());
        }
    }

    @Test
    public void testJsonDeserializationUnknownValue() throws Exception {
        ContentAttachmentMediaType result = objectMapper.readValue("\"SomethingUnknown_XYZ\"", ContentAttachmentMediaType.class);
        assertEquals(ContentAttachmentMediaType.values()[0], result);
    }
}
