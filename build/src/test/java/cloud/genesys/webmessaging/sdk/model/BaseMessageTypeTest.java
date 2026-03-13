package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for BaseMessageType enum.
 */
public class BaseMessageTypeTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testFromStringNull() {
        assertNull(BaseMessageType.fromString(null));
    }

    @Test
    public void testFromStringUnknownReturnsFallback() {
        BaseMessageType result = BaseMessageType.fromString("NonExistentValue_XYZ");
        assertEquals(BaseMessageType.values()[0], result);
    }

    @Test
    public void testAllValuesHaveNonNullToString() {
        for (BaseMessageType value : BaseMessageType.values()) {
            assertNotNull(value.toString(), "toString() should not be null for " + value.name());
            assertFalse(value.toString().isEmpty(), "toString() should not be empty for " + value.name());
        }
    }

    @Test
    public void testFromStringCaseInsensitive() {
        for (BaseMessageType value : BaseMessageType.values()) {
            assertEquals(value, BaseMessageType.fromString(value.toString().toLowerCase()),
                    "fromString should be case-insensitive for " + value.name());
        }
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        for (BaseMessageType value : BaseMessageType.values()) {
            String json = objectMapper.writeValueAsString(value);
            BaseMessageType deserialized = objectMapper.readValue(json, BaseMessageType.class);
            assertEquals(value, deserialized, "Round-trip failed for " + value.name());
        }
    }

    @Test
    public void testJsonDeserializationUnknownValue() throws Exception {
        BaseMessageType result = objectMapper.readValue("\"SomethingUnknown_XYZ\"", BaseMessageType.class);
        assertEquals(BaseMessageType.values()[0], result);
    }
}
