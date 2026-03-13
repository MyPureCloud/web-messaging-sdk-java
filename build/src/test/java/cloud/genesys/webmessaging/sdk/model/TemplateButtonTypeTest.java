package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for TemplateButtonType enum.
 */
public class TemplateButtonTypeTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testFromStringNull() {
        assertNull(TemplateButtonType.fromString(null));
    }

    @Test
    public void testFromStringUnknownReturnsFallback() {
        TemplateButtonType result = TemplateButtonType.fromString("NonExistentValue_XYZ");
        assertEquals(TemplateButtonType.values()[0], result);
    }

    @Test
    public void testAllValuesHaveNonNullToString() {
        for (TemplateButtonType value : TemplateButtonType.values()) {
            assertNotNull(value.toString(), "toString() should not be null for " + value.name());
            assertFalse(value.toString().isEmpty(), "toString() should not be empty for " + value.name());
        }
    }

    @Test
    public void testFromStringCaseInsensitive() {
        for (TemplateButtonType value : TemplateButtonType.values()) {
            assertEquals(value, TemplateButtonType.fromString(value.toString().toLowerCase()),
                    "fromString should be case-insensitive for " + value.name());
        }
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        for (TemplateButtonType value : TemplateButtonType.values()) {
            String json = objectMapper.writeValueAsString(value);
            TemplateButtonType deserialized = objectMapper.readValue(json, TemplateButtonType.class);
            assertEquals(value, deserialized, "Round-trip failed for " + value.name());
        }
    }

    @Test
    public void testJsonDeserializationUnknownValue() throws Exception {
        TemplateButtonType result = objectMapper.readValue("\"SomethingUnknown_XYZ\"", TemplateButtonType.class);
        assertEquals(TemplateButtonType.values()[0], result);
    }
}
