package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for FormResponseContentType enum.
 */
public class FormResponseContentTypeTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testFromStringNull() {
        assertNull(FormResponseContentType.fromString(null));
    }

    @Test
    public void testFromStringUnknownReturnsFallback() {
        FormResponseContentType result = FormResponseContentType.fromString("NonExistentValue_XYZ");
        assertEquals(FormResponseContentType.values()[0], result);
    }

    @Test
    public void testAllValuesHaveNonNullToString() {
        for (FormResponseContentType value : FormResponseContentType.values()) {
            assertNotNull(value.toString(), "toString() should not be null for " + value.name());
            assertFalse(value.toString().isEmpty(), "toString() should not be empty for " + value.name());
        }
    }

    @Test
    public void testFromStringCaseInsensitive() {
        for (FormResponseContentType value : FormResponseContentType.values()) {
            assertEquals(value, FormResponseContentType.fromString(value.toString().toLowerCase()),
                    "fromString should be case-insensitive for " + value.name());
        }
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        for (FormResponseContentType value : FormResponseContentType.values()) {
            String json = objectMapper.writeValueAsString(value);
            FormResponseContentType deserialized = objectMapper.readValue(json, FormResponseContentType.class);
            assertEquals(value, deserialized, "Round-trip failed for " + value.name());
        }
    }

    @Test
    public void testJsonDeserializationUnknownValue() throws Exception {
        FormResponseContentType result = objectMapper.readValue("\"SomethingUnknown_XYZ\"", FormResponseContentType.class);
        assertEquals(FormResponseContentType.values()[0], result);
    }
}
