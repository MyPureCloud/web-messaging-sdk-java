package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for TextType enum.
 */
public class TextTypeTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testFromStringNull() {
        assertNull(TextType.fromString(null));
    }

    @Test
    public void testFromStringUnknownReturnsFallback() {
        TextType result = TextType.fromString("NonExistentValue_XYZ");
        assertEquals(TextType.values()[0], result);
    }

    @Test
    public void testAllValuesHaveNonNullToString() {
        for (TextType value : TextType.values()) {
            assertNotNull(value.toString(), "toString() should not be null for " + value.name());
            assertFalse(value.toString().isEmpty(), "toString() should not be empty for " + value.name());
        }
    }

    @Test
    public void testFromStringCaseInsensitive() {
        for (TextType value : TextType.values()) {
            assertEquals(value, TextType.fromString(value.toString().toLowerCase()),
                    "fromString should be case-insensitive for " + value.name());
        }
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        for (TextType value : TextType.values()) {
            String json = objectMapper.writeValueAsString(value);
            TextType deserialized = objectMapper.readValue(json, TextType.class);
            assertEquals(value, deserialized, "Round-trip failed for " + value.name());
        }
    }

    @Test
    public void testJsonDeserializationUnknownValue() throws Exception {
        TextType result = objectMapper.readValue("\"SomethingUnknown_XYZ\"", TextType.class);
        assertEquals(TextType.values()[0], result);
    }
}
