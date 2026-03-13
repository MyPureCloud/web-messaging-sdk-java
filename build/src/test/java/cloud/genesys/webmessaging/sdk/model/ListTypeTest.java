package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for ListType enum.
 */
public class ListTypeTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testFromStringNull() {
        assertNull(ListType.fromString(null));
    }

    @Test
    public void testFromStringUnknownReturnsFallback() {
        ListType result = ListType.fromString("NonExistentValue_XYZ");
        assertEquals(ListType.values()[0], result);
    }

    @Test
    public void testAllValuesHaveNonNullToString() {
        for (ListType value : ListType.values()) {
            assertNotNull(value.toString(), "toString() should not be null for " + value.name());
            assertFalse(value.toString().isEmpty(), "toString() should not be empty for " + value.name());
        }
    }

    @Test
    public void testFromStringCaseInsensitive() {
        for (ListType value : ListType.values()) {
            assertEquals(value, ListType.fromString(value.toString().toLowerCase()),
                    "fromString should be case-insensitive for " + value.name());
        }
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        for (ListType value : ListType.values()) {
            String json = objectMapper.writeValueAsString(value);
            ListType deserialized = objectMapper.readValue(json, ListType.class);
            assertEquals(value, deserialized, "Round-trip failed for " + value.name());
        }
    }

    @Test
    public void testJsonDeserializationUnknownValue() throws Exception {
        ListType result = objectMapper.readValue("\"SomethingUnknown_XYZ\"", ListType.class);
        assertEquals(ListType.values()[0], result);
    }
}
