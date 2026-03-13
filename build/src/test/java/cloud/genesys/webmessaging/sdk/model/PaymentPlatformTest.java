package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for PaymentPlatform enum.
 */
public class PaymentPlatformTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testFromStringNull() {
        assertNull(PaymentPlatform.fromString(null));
    }

    @Test
    public void testFromStringUnknownReturnsFallback() {
        PaymentPlatform result = PaymentPlatform.fromString("NonExistentValue_XYZ");
        assertEquals(PaymentPlatform.values()[0], result);
    }

    @Test
    public void testAllValuesHaveNonNullToString() {
        for (PaymentPlatform value : PaymentPlatform.values()) {
            assertNotNull(value.toString(), "toString() should not be null for " + value.name());
            assertFalse(value.toString().isEmpty(), "toString() should not be empty for " + value.name());
        }
    }

    @Test
    public void testFromStringCaseInsensitive() {
        for (PaymentPlatform value : PaymentPlatform.values()) {
            assertEquals(value, PaymentPlatform.fromString(value.toString().toLowerCase()),
                    "fromString should be case-insensitive for " + value.name());
        }
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        for (PaymentPlatform value : PaymentPlatform.values()) {
            String json = objectMapper.writeValueAsString(value);
            PaymentPlatform deserialized = objectMapper.readValue(json, PaymentPlatform.class);
            assertEquals(value, deserialized, "Round-trip failed for " + value.name());
        }
    }

    @Test
    public void testJsonDeserializationUnknownValue() throws Exception {
        PaymentPlatform result = objectMapper.readValue("\"SomethingUnknown_XYZ\"", PaymentPlatform.class);
        assertEquals(PaymentPlatform.values()[0], result);
    }
}
