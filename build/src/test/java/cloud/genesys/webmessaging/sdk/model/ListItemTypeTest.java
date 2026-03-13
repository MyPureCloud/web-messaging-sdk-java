package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for ListItemType enum.
 */
public class ListItemTypeTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testFromStringNull() {
        assertNull(ListItemType.fromString(null));
    }

    @Test
    public void testFromStringUnknownReturnsFallback() {
        ListItemType result = ListItemType.fromString("NonExistentValue_XYZ");
        assertEquals(ListItemType.values()[0], result);
    }

    @Test
    public void testAllValuesHaveNonNullToString() {
        for (ListItemType value : ListItemType.values()) {
            assertNotNull(value.toString(), "toString() should not be null for " + value.name());
            assertFalse(value.toString().isEmpty(), "toString() should not be empty for " + value.name());
        }
    }

    @Test
    public void testFromStringCaseInsensitive() {
        for (ListItemType value : ListItemType.values()) {
            assertEquals(value, ListItemType.fromString(value.toString().toLowerCase()),
                    "fromString should be case-insensitive for " + value.name());
        }
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        for (ListItemType value : ListItemType.values()) {
            String json = objectMapper.writeValueAsString(value);
            ListItemType deserialized = objectMapper.readValue(json, ListItemType.class);
            assertEquals(value, deserialized, "Round-trip failed for " + value.name());
        }
    }

    @Test
    public void testJsonDeserializationUnknownValue() throws Exception {
        ListItemType result = objectMapper.readValue("\"SomethingUnknown_XYZ\"", ListItemType.class);
        assertEquals(ListItemType.values()[0], result);
    }
}
