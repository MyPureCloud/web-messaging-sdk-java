package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for PaymentStatus enum.
 */
public class PaymentStatusTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testFromStringNull() {
        assertNull(PaymentStatus.fromString(null));
    }

    @Test
    public void testFromStringUnknownReturnsFallback() {
        PaymentStatus result = PaymentStatus.fromString("NonExistentValue_XYZ");
        assertEquals(PaymentStatus.values()[0], result);
    }

    @Test
    public void testAllValuesHaveNonNullToString() {
        for (PaymentStatus value : PaymentStatus.values()) {
            assertNotNull(value.toString(), "toString() should not be null for " + value.name());
            assertFalse(value.toString().isEmpty(), "toString() should not be empty for " + value.name());
        }
    }

    @Test
    public void testFromStringCaseInsensitive() {
        for (PaymentStatus value : PaymentStatus.values()) {
            assertEquals(value, PaymentStatus.fromString(value.toString().toLowerCase()),
                    "fromString should be case-insensitive for " + value.name());
        }
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        for (PaymentStatus value : PaymentStatus.values()) {
            String json = objectMapper.writeValueAsString(value);
            PaymentStatus deserialized = objectMapper.readValue(json, PaymentStatus.class);
            assertEquals(value, deserialized, "Round-trip failed for " + value.name());
        }
    }

    @Test
    public void testJsonDeserializationUnknownValue() throws Exception {
        PaymentStatus result = objectMapper.readValue("\"SomethingUnknown_XYZ\"", PaymentStatus.class);
        assertEquals(PaymentStatus.values()[0], result);
    }
}
