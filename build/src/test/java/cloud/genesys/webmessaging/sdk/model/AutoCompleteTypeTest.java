package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for AutoCompleteType enum.
 */
public class AutoCompleteTypeTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testFromStringNull() {
        assertNull(AutoCompleteType.fromString(null));
    }

    @Test
    public void testFromStringUnknownReturnsFallback() {
        AutoCompleteType result = AutoCompleteType.fromString("NonExistentValue_XYZ");
        assertEquals(AutoCompleteType.values()[0], result);
    }

    @Test
    public void testAllValuesHaveNonNullToString() {
        for (AutoCompleteType value : AutoCompleteType.values()) {
            assertNotNull(value.toString(), "toString() should not be null for " + value.name());
            assertFalse(value.toString().isEmpty(), "toString() should not be empty for " + value.name());
        }
    }

    @Test
    public void testFromStringCaseInsensitive() {
        for (AutoCompleteType value : AutoCompleteType.values()) {
            assertEquals(value, AutoCompleteType.fromString(value.toString().toLowerCase()),
                    "fromString should be case-insensitive for " + value.name());
        }
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        for (AutoCompleteType value : AutoCompleteType.values()) {
            String json = objectMapper.writeValueAsString(value);
            AutoCompleteType deserialized = objectMapper.readValue(json, AutoCompleteType.class);
            assertEquals(value, deserialized, "Round-trip failed for " + value.name());
        }
    }

    @Test
    public void testJsonDeserializationUnknownValue() throws Exception {
        AutoCompleteType result = objectMapper.readValue("\"SomethingUnknown_XYZ\"", AutoCompleteType.class);
        assertEquals(AutoCompleteType.values()[0], result);
    }
}
