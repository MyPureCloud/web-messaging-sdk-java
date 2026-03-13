package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for Ent model.
 */
public class EntTest {

    private Ent instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new Ent();
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
        Ent a = new Ent();
        Ent b = new Ent();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        Ent a = new Ent();
        Ent b = new Ent();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class Ent"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        Ent deserialized = objectMapper.readValue(json, Ent.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_buttonResponse() {
        Ent result = instance.buttonResponse(null);
        assertSame(instance, result, "Fluent setter for buttonResponse should return the same instance");
    }

    @Test
    public void testFluentSetter_contentType() {
        Ent result = instance.contentType(null);
        assertSame(instance, result, "Fluent setter for contentType should return the same instance");
    }
}
