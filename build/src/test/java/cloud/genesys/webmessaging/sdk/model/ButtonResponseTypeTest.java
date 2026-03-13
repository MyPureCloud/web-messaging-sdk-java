package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for ButtonResponseType enum.
 */
public class ButtonResponseTypeTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testFromStringNull() {
        assertNull(ButtonResponseType.fromString(null));
    }

    @Test
    public void testFromStringUnknownReturnsFallback() {
        ButtonResponseType result = ButtonResponseType.fromString("NonExistentValue_XYZ");
        assertEquals(ButtonResponseType.values()[0], result);
    }

    @Test
    public void testAllValuesHaveNonNullToString() {
        for (ButtonResponseType value : ButtonResponseType.values()) {
            assertNotNull(value.toString(), "toString() should not be null for " + value.name());
            assertFalse(value.toString().isEmpty(), "toString() should not be empty for " + value.name());
        }
    }

    @Test
    public void testFromStringCaseInsensitive() {
        for (ButtonResponseType value : ButtonResponseType.values()) {
            assertEquals(value, ButtonResponseType.fromString(value.toString().toLowerCase()),
                    "fromString should be case-insensitive for " + value.name());
        }
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        for (ButtonResponseType value : ButtonResponseType.values()) {
            String json = objectMapper.writeValueAsString(value);
            ButtonResponseType deserialized = objectMapper.readValue(json, ButtonResponseType.class);
            assertEquals(value, deserialized, "Round-trip failed for " + value.name());
        }
    }

    @Test
    public void testJsonDeserializationUnknownValue() throws Exception {
        ButtonResponseType result = objectMapper.readValue("\"SomethingUnknown_XYZ\"", ButtonResponseType.class);
        assertEquals(ButtonResponseType.values()[0], result);
    }
}
