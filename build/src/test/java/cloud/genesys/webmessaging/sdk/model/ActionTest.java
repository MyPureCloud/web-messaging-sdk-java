package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for Action enum.
 */
public class ActionTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testFromStringNull() {
        assertNull(Action.fromString(null));
    }

    @Test
    public void testFromStringUnknownReturnsFallback() {
        Action result = Action.fromString("NonExistentValue_XYZ");
        assertEquals(Action.values()[0], result);
    }

    @Test
    public void testAllValuesHaveNonNullToString() {
        for (Action value : Action.values()) {
            assertNotNull(value.toString(), "toString() should not be null for " + value.name());
            assertFalse(value.toString().isEmpty(), "toString() should not be empty for " + value.name());
        }
    }

    @Test
    public void testFromStringCaseInsensitive() {
        for (Action value : Action.values()) {
            assertEquals(value, Action.fromString(value.toString().toLowerCase()),
                    "fromString should be case-insensitive for " + value.name());
        }
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        for (Action value : Action.values()) {
            String json = objectMapper.writeValueAsString(value);
            Action deserialized = objectMapper.readValue(json, Action.class);
            assertEquals(value, deserialized, "Round-trip failed for " + value.name());
        }
    }

    @Test
    public void testJsonDeserializationUnknownValue() throws Exception {
        Action result = objectMapper.readValue("\"SomethingUnknown_XYZ\"", Action.class);
        assertEquals(Action.values()[0], result);
    }
}
