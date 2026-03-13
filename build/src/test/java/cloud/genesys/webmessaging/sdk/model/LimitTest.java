package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for Limit model.
 */
public class LimitTest {

    private Limit instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new Limit();
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
        Limit a = new Limit();
        Limit b = new Limit();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        Limit a = new Limit();
        Limit b = new Limit();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class Limit"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        Limit deserialized = objectMapper.readValue(json, Limit.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_key() {
        Limit result = instance.key(null);
        assertSame(instance, result, "Fluent setter for key should return the same instance");
    }

    @Test
    public void testFluentSetter_namespace() {
        Limit result = instance.namespace(null);
        assertSame(instance, result, "Fluent setter for namespace should return the same instance");
    }

    @Test
    public void testFluentSetter_value() {
        Limit result = instance.value(null);
        assertSame(instance, result, "Fluent setter for value should return the same instance");
    }
}
