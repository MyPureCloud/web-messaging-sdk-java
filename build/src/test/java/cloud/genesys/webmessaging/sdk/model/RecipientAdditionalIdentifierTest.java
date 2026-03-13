package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for RecipientAdditionalIdentifier model.
 */
public class RecipientAdditionalIdentifierTest {

    private RecipientAdditionalIdentifier instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new RecipientAdditionalIdentifier();
        objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
    }

    @Test
    public void testConstruction() {
        assertNotNull(instance);
    }

    @Test
    public void testEqualsSameInstance() {
        assertEquals(instance, instance);
    }

    @Test
    public void testEqualsNull() {
        assertNotEquals(instance, null);
    }

    @Test
    public void testEqualsDifferentType() {
        assertNotEquals(instance, "a string");
    }

    @Test
    public void testEqualsEmptyInstances() {
        RecipientAdditionalIdentifier a = new RecipientAdditionalIdentifier();
        RecipientAdditionalIdentifier b = new RecipientAdditionalIdentifier();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        RecipientAdditionalIdentifier a = new RecipientAdditionalIdentifier();
        RecipientAdditionalIdentifier b = new RecipientAdditionalIdentifier();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class RecipientAdditionalIdentifier"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        RecipientAdditionalIdentifier deserialized = objectMapper.readValue(json, RecipientAdditionalIdentifier.class);
        assertEquals(instance, deserialized);
    }
}
