package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for ChannelType enum.
 */
public class ChannelTypeTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testFromStringNull() {
        assertNull(ChannelType.fromString(null));
    }

    @Test
    public void testFromStringUnknownReturnsFallback() {
        ChannelType result = ChannelType.fromString("NonExistentValue_XYZ");
        assertEquals(ChannelType.values()[0], result);
    }

    @Test
    public void testAllValuesHaveNonNullToString() {
        for (ChannelType value : ChannelType.values()) {
            assertNotNull(value.toString(), "toString() should not be null for " + value.name());
            assertFalse(value.toString().isEmpty(), "toString() should not be empty for " + value.name());
        }
    }

    @Test
    public void testFromStringCaseInsensitive() {
        for (ChannelType value : ChannelType.values()) {
            assertEquals(value, ChannelType.fromString(value.toString().toLowerCase()),
                    "fromString should be case-insensitive for " + value.name());
        }
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        for (ChannelType value : ChannelType.values()) {
            String json = objectMapper.writeValueAsString(value);
            ChannelType deserialized = objectMapper.readValue(json, ChannelType.class);
            assertEquals(value, deserialized, "Round-trip failed for " + value.name());
        }
    }

    @Test
    public void testJsonDeserializationUnknownValue() throws Exception {
        ChannelType result = objectMapper.readValue("\"SomethingUnknown_XYZ\"", ChannelType.class);
        assertEquals(ChannelType.values()[0], result);
    }
}
