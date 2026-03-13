package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for StoryType enum.
 */
public class StoryTypeTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testFromStringNull() {
        assertNull(StoryType.fromString(null));
    }

    @Test
    public void testFromStringUnknownReturnsFallback() {
        StoryType result = StoryType.fromString("NonExistentValue_XYZ");
        assertEquals(StoryType.values()[0], result);
    }

    @Test
    public void testAllValuesHaveNonNullToString() {
        for (StoryType value : StoryType.values()) {
            assertNotNull(value.toString(), "toString() should not be null for " + value.name());
            assertFalse(value.toString().isEmpty(), "toString() should not be empty for " + value.name());
        }
    }

    @Test
    public void testFromStringCaseInsensitive() {
        for (StoryType value : StoryType.values()) {
            assertEquals(value, StoryType.fromString(value.toString().toLowerCase()),
                    "fromString should be case-insensitive for " + value.name());
        }
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        for (StoryType value : StoryType.values()) {
            String json = objectMapper.writeValueAsString(value);
            StoryType deserialized = objectMapper.readValue(json, StoryType.class);
            assertEquals(value, deserialized, "Round-trip failed for " + value.name());
        }
    }

    @Test
    public void testJsonDeserializationUnknownValue() throws Exception {
        StoryType result = objectMapper.readValue("\"SomethingUnknown_XYZ\"", StoryType.class);
        assertEquals(StoryType.values()[0], result);
    }
}
