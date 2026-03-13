package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for ContactField enum.
 */
public class ContactFieldTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testFromStringNull() {
        assertNull(ContactField.fromString(null));
    }

    @Test
    public void testFromStringUnknownReturnsFallback() {
        ContactField result = ContactField.fromString("NonExistentValue_XYZ");
        assertEquals(ContactField.values()[0], result);
    }

    @Test
    public void testAllValuesHaveNonNullToString() {
        for (ContactField value : ContactField.values()) {
            assertNotNull(value.toString(), "toString() should not be null for " + value.name());
            assertFalse(value.toString().isEmpty(), "toString() should not be empty for " + value.name());
        }
    }

    @Test
    public void testFromStringCaseInsensitive() {
        for (ContactField value : ContactField.values()) {
            assertEquals(value, ContactField.fromString(value.toString().toLowerCase()),
                    "fromString should be case-insensitive for " + value.name());
        }
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        for (ContactField value : ContactField.values()) {
            String json = objectMapper.writeValueAsString(value);
            ContactField deserialized = objectMapper.readValue(json, ContactField.class);
            assertEquals(value, deserialized, "Round-trip failed for " + value.name());
        }
    }

    @Test
    public void testJsonDeserializationUnknownValue() throws Exception {
        ContactField result = objectMapper.readValue("\"SomethingUnknown_XYZ\"", ContactField.class);
        assertEquals(ContactField.values()[0], result);
    }
}
