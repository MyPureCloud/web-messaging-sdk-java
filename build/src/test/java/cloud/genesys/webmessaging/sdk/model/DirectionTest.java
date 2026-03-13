package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for Direction enum.
 */
public class DirectionTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testFromStringNull() {
        assertNull(Direction.fromString(null));
    }

    @Test
    public void testFromStringUnknownReturnsFallback() {
        Direction result = Direction.fromString("NonExistentValue_XYZ");
        assertEquals(Direction.values()[0], result);
    }

    @Test
    public void testAllValuesHaveNonNullToString() {
        for (Direction value : Direction.values()) {
            assertNotNull(value.toString(), "toString() should not be null for " + value.name());
            assertFalse(value.toString().isEmpty(), "toString() should not be empty for " + value.name());
        }
    }

    @Test
    public void testFromStringCaseInsensitive() {
        for (Direction value : Direction.values()) {
            assertEquals(value, Direction.fromString(value.toString().toLowerCase()),
                    "fromString should be case-insensitive for " + value.name());
        }
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        for (Direction value : Direction.values()) {
            String json = objectMapper.writeValueAsString(value);
            Direction deserialized = objectMapper.readValue(json, Direction.class);
            assertEquals(value, deserialized, "Round-trip failed for " + value.name());
        }
    }

    @Test
    public void testJsonDeserializationUnknownValue() throws Exception {
        Direction result = objectMapper.readValue("\"SomethingUnknown_XYZ\"", Direction.class);
        assertEquals(Direction.values()[0], result);
    }
}
