package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for Reason model.
 */
public class ReasonTest {

    private Reason instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new Reason();
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
        Reason a = new Reason();
        Reason b = new Reason();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        Reason a = new Reason();
        Reason b = new Reason();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class Reason"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        Reason deserialized = objectMapper.readValue(json, Reason.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_code() {
        Reason result = instance.code(null);
        assertSame(instance, result, "Fluent setter for code should return the same instance");
    }

    @Test
    public void testFluentSetter_message() {
        Reason result = instance.message(null);
        assertSame(instance, result, "Fluent setter for message should return the same instance");
    }
}
