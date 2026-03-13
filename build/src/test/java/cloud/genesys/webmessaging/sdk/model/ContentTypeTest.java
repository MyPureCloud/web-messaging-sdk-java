package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for ContentType enum.
 */
public class ContentTypeTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testFromStringNull() {
        assertNull(ContentType.fromString(null));
    }

    @Test
    public void testFromStringUnknownReturnsFallback() {
        ContentType result = ContentType.fromString("NonExistentValue_XYZ");
        assertEquals(ContentType.values()[0], result);
    }

    @Test
    public void testAllValuesHaveNonNullToString() {
        for (ContentType value : ContentType.values()) {
            assertNotNull(value.toString(), "toString() should not be null for " + value.name());
            assertFalse(value.toString().isEmpty(), "toString() should not be empty for " + value.name());
        }
    }

    @Test
    public void testFromStringCaseInsensitive() {
        for (ContentType value : ContentType.values()) {
            assertEquals(value, ContentType.fromString(value.toString().toLowerCase()),
                    "fromString should be case-insensitive for " + value.name());
        }
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        for (ContentType value : ContentType.values()) {
            String json = objectMapper.writeValueAsString(value);
            ContentType deserialized = objectMapper.readValue(json, ContentType.class);
            assertEquals(value, deserialized, "Round-trip failed for " + value.name());
        }
    }

    @Test
    public void testJsonDeserializationUnknownValue() throws Exception {
        ContentType result = objectMapper.readValue("\"SomethingUnknown_XYZ\"", ContentType.class);
        assertEquals(ContentType.values()[0], result);
    }
}
