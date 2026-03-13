package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for RequestTypeGetConfiguration enum.
 */
public class RequestTypeGetConfigurationTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testFromStringNull() {
        assertNull(RequestTypeGetConfiguration.fromString(null));
    }

    @Test
    public void testFromStringUnknownReturnsFallback() {
        RequestTypeGetConfiguration result = RequestTypeGetConfiguration.fromString("NonExistentValue_XYZ");
        assertEquals(RequestTypeGetConfiguration.values()[0], result);
    }

    @Test
    public void testAllValuesHaveNonNullToString() {
        for (RequestTypeGetConfiguration value : RequestTypeGetConfiguration.values()) {
            assertNotNull(value.toString(), "toString() should not be null for " + value.name());
            assertFalse(value.toString().isEmpty(), "toString() should not be empty for " + value.name());
        }
    }

    @Test
    public void testFromStringCaseInsensitive() {
        for (RequestTypeGetConfiguration value : RequestTypeGetConfiguration.values()) {
            assertEquals(value, RequestTypeGetConfiguration.fromString(value.toString().toLowerCase()),
                    "fromString should be case-insensitive for " + value.name());
        }
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        for (RequestTypeGetConfiguration value : RequestTypeGetConfiguration.values()) {
            String json = objectMapper.writeValueAsString(value);
            RequestTypeGetConfiguration deserialized = objectMapper.readValue(json, RequestTypeGetConfiguration.class);
            assertEquals(value, deserialized, "Round-trip failed for " + value.name());
        }
    }

    @Test
    public void testJsonDeserializationUnknownValue() throws Exception {
        RequestTypeGetConfiguration result = objectMapper.readValue("\"SomethingUnknown_XYZ\"", RequestTypeGetConfiguration.class);
        assertEquals(RequestTypeGetConfiguration.values()[0], result);
    }
}
