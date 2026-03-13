package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for OriginatingEntity enum.
 */
public class OriginatingEntityTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testFromStringNull() {
        assertNull(OriginatingEntity.fromString(null));
    }

    @Test
    public void testFromStringUnknownReturnsFallback() {
        OriginatingEntity result = OriginatingEntity.fromString("NonExistentValue_XYZ");
        assertEquals(OriginatingEntity.values()[0], result);
    }

    @Test
    public void testAllValuesHaveNonNullToString() {
        for (OriginatingEntity value : OriginatingEntity.values()) {
            assertNotNull(value.toString(), "toString() should not be null for " + value.name());
            assertFalse(value.toString().isEmpty(), "toString() should not be empty for " + value.name());
        }
    }

    @Test
    public void testFromStringCaseInsensitive() {
        for (OriginatingEntity value : OriginatingEntity.values()) {
            assertEquals(value, OriginatingEntity.fromString(value.toString().toLowerCase()),
                    "fromString should be case-insensitive for " + value.name());
        }
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        for (OriginatingEntity value : OriginatingEntity.values()) {
            String json = objectMapper.writeValueAsString(value);
            OriginatingEntity deserialized = objectMapper.readValue(json, OriginatingEntity.class);
            assertEquals(value, deserialized, "Round-trip failed for " + value.name());
        }
    }

    @Test
    public void testJsonDeserializationUnknownValue() throws Exception {
        OriginatingEntity result = objectMapper.readValue("\"SomethingUnknown_XYZ\"", OriginatingEntity.class);
        assertEquals(OriginatingEntity.values()[0], result);
    }
}
