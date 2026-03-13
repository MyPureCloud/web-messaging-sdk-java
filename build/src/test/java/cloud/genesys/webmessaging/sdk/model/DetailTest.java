package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for Detail model.
 */
public class DetailTest {

    private Detail instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new Detail();
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
        Detail a = new Detail();
        Detail b = new Detail();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        Detail a = new Detail();
        Detail b = new Detail();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class Detail"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        Detail deserialized = objectMapper.readValue(json, Detail.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_errorCode() {
        Detail result = instance.errorCode(null);
        assertSame(instance, result, "Fluent setter for errorCode should return the same instance");
    }

    @Test
    public void testFluentSetter_fieldName() {
        Detail result = instance.fieldName(null);
        assertSame(instance, result, "Fluent setter for fieldName should return the same instance");
    }

    @Test
    public void testFluentSetter_entityId() {
        Detail result = instance.entityId(null);
        assertSame(instance, result, "Fluent setter for entityId should return the same instance");
    }

    @Test
    public void testFluentSetter_entityName() {
        Detail result = instance.entityName(null);
        assertSame(instance, result, "Fluent setter for entityName should return the same instance");
    }
}
