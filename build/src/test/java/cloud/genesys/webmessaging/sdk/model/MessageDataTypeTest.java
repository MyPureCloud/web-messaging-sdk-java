package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for MessageDataType enum.
 */
public class MessageDataTypeTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testFromStringNull() {
        assertNull(MessageDataType.fromString(null));
    }

    @Test
    public void testFromStringUnknownReturnsFallback() {
        MessageDataType result = MessageDataType.fromString("NonExistentValue_XYZ");
        assertEquals(MessageDataType.values()[0], result);
    }

    @Test
    public void testAllValuesHaveNonNullToString() {
        for (MessageDataType value : MessageDataType.values()) {
            assertNotNull(value.toString(), "toString() should not be null for " + value.name());
            assertFalse(value.toString().isEmpty(), "toString() should not be empty for " + value.name());
        }
    }

    @Test
    public void testFromStringCaseInsensitive() {
        for (MessageDataType value : MessageDataType.values()) {
            assertEquals(value, MessageDataType.fromString(value.toString().toLowerCase()),
                    "fromString should be case-insensitive for " + value.name());
        }
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        for (MessageDataType value : MessageDataType.values()) {
            String json = objectMapper.writeValueAsString(value);
            MessageDataType deserialized = objectMapper.readValue(json, MessageDataType.class);
            assertEquals(value, deserialized, "Round-trip failed for " + value.name());
        }
    }

    @Test
    public void testJsonDeserializationUnknownValue() throws Exception {
        MessageDataType result = objectMapper.readValue("\"SomethingUnknown_XYZ\"", MessageDataType.class);
        assertEquals(MessageDataType.values()[0], result);
    }
}
