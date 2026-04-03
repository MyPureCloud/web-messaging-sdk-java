package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for RecipientAdditionalProviderInfo model.
 */
public class RecipientAdditionalProviderInfoTest {

    private RecipientAdditionalProviderInfo instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new RecipientAdditionalProviderInfo();
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
        RecipientAdditionalProviderInfo a = new RecipientAdditionalProviderInfo();
        RecipientAdditionalProviderInfo b = new RecipientAdditionalProviderInfo();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        RecipientAdditionalProviderInfo a = new RecipientAdditionalProviderInfo();
        RecipientAdditionalProviderInfo b = new RecipientAdditionalProviderInfo();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class RecipientAdditionalProviderInfo"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        RecipientAdditionalProviderInfo deserialized = objectMapper.readValue(json, RecipientAdditionalProviderInfo.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_followerCount() {
        RecipientAdditionalProviderInfo result = instance.followerCount(null);
        assertSame(instance, result, "Fluent setter for followerCount should return the same instance");
    }

    @Test
    public void testFluentSetter_verificationType() {
        RecipientAdditionalProviderInfo result = instance.verificationType(null);
        assertSame(instance, result, "Fluent setter for verificationType should return the same instance");
    }
}
