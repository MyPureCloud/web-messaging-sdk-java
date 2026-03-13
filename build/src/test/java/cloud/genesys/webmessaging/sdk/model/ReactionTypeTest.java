package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for ReactionType enum.
 */
public class ReactionTypeTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testFromStringNull() {
        assertNull(ReactionType.fromString(null));
    }

    @Test
    public void testFromStringUnknownReturnsFallback() {
        ReactionType result = ReactionType.fromString("NonExistentValue_XYZ");
        assertEquals(ReactionType.values()[0], result);
    }

    @Test
    public void testAllValuesHaveNonNullToString() {
        for (ReactionType value : ReactionType.values()) {
            assertNotNull(value.toString(), "toString() should not be null for " + value.name());
            assertFalse(value.toString().isEmpty(), "toString() should not be empty for " + value.name());
        }
    }

    @Test
    public void testFromStringCaseInsensitive() {
        for (ReactionType value : ReactionType.values()) {
            assertEquals(value, ReactionType.fromString(value.toString().toLowerCase()),
                    "fromString should be case-insensitive for " + value.name());
        }
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        for (ReactionType value : ReactionType.values()) {
            String json = objectMapper.writeValueAsString(value);
            ReactionType deserialized = objectMapper.readValue(json, ReactionType.class);
            assertEquals(value, deserialized, "Round-trip failed for " + value.name());
        }
    }

    @Test
    public void testJsonDeserializationUnknownValue() throws Exception {
        ReactionType result = objectMapper.readValue("\"SomethingUnknown_XYZ\"", ReactionType.class);
        assertEquals(ReactionType.values()[0], result);
    }
}
