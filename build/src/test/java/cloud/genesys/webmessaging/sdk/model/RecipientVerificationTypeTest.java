package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for RecipientVerificationType enum.
 */
public class RecipientVerificationTypeTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testFromStringNull() {
        assertNull(RecipientVerificationType.fromString(null));
    }

    @Test
    public void testFromStringUnknownReturnsFallback() {
        RecipientVerificationType result = RecipientVerificationType.fromString("NonExistentValue_XYZ");
        assertEquals(RecipientVerificationType.values()[0], result);
    }

    @Test
    public void testAllValuesHaveNonNullToString() {
        for (RecipientVerificationType value : RecipientVerificationType.values()) {
            assertNotNull(value.toString(), "toString() should not be null for " + value.name());
            assertFalse(value.toString().isEmpty(), "toString() should not be empty for " + value.name());
        }
    }

    @Test
    public void testFromStringCaseInsensitive() {
        for (RecipientVerificationType value : RecipientVerificationType.values()) {
            assertEquals(value, RecipientVerificationType.fromString(value.toString().toLowerCase()),
                    "fromString should be case-insensitive for " + value.name());
        }
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        for (RecipientVerificationType value : RecipientVerificationType.values()) {
            String json = objectMapper.writeValueAsString(value);
            RecipientVerificationType deserialized = objectMapper.readValue(json, RecipientVerificationType.class);
            assertEquals(value, deserialized, "Round-trip failed for " + value.name());
        }
    }

    @Test
    public void testJsonDeserializationUnknownValue() throws Exception {
        RecipientVerificationType result = objectMapper.readValue("\"SomethingUnknown_XYZ\"", RecipientVerificationType.class);
        assertEquals(RecipientVerificationType.values()[0], result);
    }
}
