package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for CardActionType enum.
 */
public class CardActionTypeTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testFromStringNull() {
        assertNull(CardActionType.fromString(null));
    }

    @Test
    public void testFromStringUnknownReturnsFallback() {
        CardActionType result = CardActionType.fromString("NonExistentValue_XYZ");
        assertEquals(CardActionType.values()[0], result);
    }

    @Test
    public void testAllValuesHaveNonNullToString() {
        for (CardActionType value : CardActionType.values()) {
            assertNotNull(value.toString(), "toString() should not be null for " + value.name());
            assertFalse(value.toString().isEmpty(), "toString() should not be empty for " + value.name());
        }
    }

    @Test
    public void testFromStringCaseInsensitive() {
        for (CardActionType value : CardActionType.values()) {
            assertEquals(value, CardActionType.fromString(value.toString().toLowerCase()),
                    "fromString should be case-insensitive for " + value.name());
        }
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        for (CardActionType value : CardActionType.values()) {
            String json = objectMapper.writeValueAsString(value);
            CardActionType deserialized = objectMapper.readValue(json, CardActionType.class);
            assertEquals(value, deserialized, "Round-trip failed for " + value.name());
        }
    }

    @Test
    public void testJsonDeserializationUnknownValue() throws Exception {
        CardActionType result = objectMapper.readValue("\"SomethingUnknown_XYZ\"", CardActionType.class);
        assertEquals(CardActionType.values()[0], result);
    }
}
