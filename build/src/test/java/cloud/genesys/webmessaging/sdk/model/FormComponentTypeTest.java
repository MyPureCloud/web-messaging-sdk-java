package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for FormComponentType enum.
 */
public class FormComponentTypeTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testFromStringNull() {
        assertNull(FormComponentType.fromString(null));
    }

    @Test
    public void testFromStringUnknownReturnsFallback() {
        FormComponentType result = FormComponentType.fromString("NonExistentValue_XYZ");
        assertEquals(FormComponentType.values()[0], result);
    }

    @Test
    public void testAllValuesHaveNonNullToString() {
        for (FormComponentType value : FormComponentType.values()) {
            assertNotNull(value.toString(), "toString() should not be null for " + value.name());
            assertFalse(value.toString().isEmpty(), "toString() should not be empty for " + value.name());
        }
    }

    @Test
    public void testFromStringCaseInsensitive() {
        for (FormComponentType value : FormComponentType.values()) {
            assertEquals(value, FormComponentType.fromString(value.toString().toLowerCase()),
                    "fromString should be case-insensitive for " + value.name());
        }
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        for (FormComponentType value : FormComponentType.values()) {
            String json = objectMapper.writeValueAsString(value);
            FormComponentType deserialized = objectMapper.readValue(json, FormComponentType.class);
            assertEquals(value, deserialized, "Round-trip failed for " + value.name());
        }
    }

    @Test
    public void testJsonDeserializationUnknownValue() throws Exception {
        FormComponentType result = objectMapper.readValue("\"SomethingUnknown_XYZ\"", FormComponentType.class);
        assertEquals(FormComponentType.values()[0], result);
    }
}
