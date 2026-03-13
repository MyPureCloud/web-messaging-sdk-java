package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for Type enum.
 */
public class TypeTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testFromStringNull() {
        assertNull(Type.fromString(null));
    }

    @Test
    public void testFromStringUnknownReturnsFallback() {
        Type result = Type.fromString("NonExistentValue_XYZ");
        assertEquals(Type.values()[0], result);
    }

    @Test
    public void testAllValuesHaveNonNullToString() {
        for (Type value : Type.values()) {
            assertNotNull(value.toString(), "toString() should not be null for " + value.name());
            assertFalse(value.toString().isEmpty(), "toString() should not be empty for " + value.name());
        }
    }

    @Test
    public void testFromStringCaseInsensitive() {
        for (Type value : Type.values()) {
            assertEquals(value, Type.fromString(value.toString().toLowerCase()),
                    "fromString should be case-insensitive for " + value.name());
        }
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        for (Type value : Type.values()) {
            String json = objectMapper.writeValueAsString(value);
            Type deserialized = objectMapper.readValue(json, Type.class);
            assertEquals(value, deserialized, "Round-trip failed for " + value.name());
        }
    }

    @Test
    public void testJsonDeserializationUnknownValue() throws Exception {
        Type result = objectMapper.readValue("\"SomethingUnknown_XYZ\"", Type.class);
        assertEquals(Type.values()[0], result);
    }
}
