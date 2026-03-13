package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for DeviceType enum.
 */
public class DeviceTypeTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testFromStringNull() {
        assertNull(DeviceType.fromString(null));
    }

    @Test
    public void testFromStringUnknownReturnsFallback() {
        DeviceType result = DeviceType.fromString("NonExistentValue_XYZ");
        assertEquals(DeviceType.values()[0], result);
    }

    @Test
    public void testAllValuesHaveNonNullToString() {
        for (DeviceType value : DeviceType.values()) {
            assertNotNull(value.toString(), "toString() should not be null for " + value.name());
            assertFalse(value.toString().isEmpty(), "toString() should not be empty for " + value.name());
        }
    }

    @Test
    public void testFromStringCaseInsensitive() {
        for (DeviceType value : DeviceType.values()) {
            assertEquals(value, DeviceType.fromString(value.toString().toLowerCase()),
                    "fromString should be case-insensitive for " + value.name());
        }
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        for (DeviceType value : DeviceType.values()) {
            String json = objectMapper.writeValueAsString(value);
            DeviceType deserialized = objectMapper.readValue(json, DeviceType.class);
            assertEquals(value, deserialized, "Round-trip failed for " + value.name());
        }
    }

    @Test
    public void testJsonDeserializationUnknownValue() throws Exception {
        DeviceType result = objectMapper.readValue("\"SomethingUnknown_XYZ\"", DeviceType.class);
        assertEquals(DeviceType.values()[0], result);
    }
}
