package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for Status enum.
 */
public class StatusTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testFromStringNull() {
        assertNull(Status.fromString(null));
    }

    @Test
    public void testFromStringUnknownReturnsFallback() {
        Status result = Status.fromString("NonExistentValue_XYZ");
        assertEquals(Status.values()[0], result);
    }

    @Test
    public void testAllValuesHaveNonNullToString() {
        for (Status value : Status.values()) {
            assertNotNull(value.toString(), "toString() should not be null for " + value.name());
            assertFalse(value.toString().isEmpty(), "toString() should not be empty for " + value.name());
        }
    }

    @Test
    public void testFromStringCaseInsensitive() {
        for (Status value : Status.values()) {
            assertEquals(value, Status.fromString(value.toString().toLowerCase()),
                    "fromString should be case-insensitive for " + value.name());
        }
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        for (Status value : Status.values()) {
            String json = objectMapper.writeValueAsString(value);
            Status deserialized = objectMapper.readValue(json, Status.class);
            assertEquals(value, deserialized, "Round-trip failed for " + value.name());
        }
    }

    @Test
    public void testJsonDeserializationUnknownValue() throws Exception {
        Status result = objectMapper.readValue("\"SomethingUnknown_XYZ\"", Status.class);
        assertEquals(Status.values()[0], result);
    }
}
