package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for ErrorBody model.
 */
public class ErrorBodyTest {

    private ErrorBody instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new ErrorBody();
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
        ErrorBody a = new ErrorBody();
        ErrorBody b = new ErrorBody();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        ErrorBody a = new ErrorBody();
        ErrorBody b = new ErrorBody();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class ErrorBody"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        ErrorBody deserialized = objectMapper.readValue(json, ErrorBody.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_message() {
        ErrorBody result = instance.message(null);
        assertSame(instance, result, "Fluent setter for message should return the same instance");
    }

    @Test
    public void testFluentSetter_code() {
        ErrorBody result = instance.code(null);
        assertSame(instance, result, "Fluent setter for code should return the same instance");
    }

    @Test
    public void testFluentSetter_status() {
        ErrorBody result = instance.status(null);
        assertSame(instance, result, "Fluent setter for status should return the same instance");
    }

    @Test
    public void testFluentSetter_entityId() {
        ErrorBody result = instance.entityId(null);
        assertSame(instance, result, "Fluent setter for entityId should return the same instance");
    }

    @Test
    public void testFluentSetter_entityName() {
        ErrorBody result = instance.entityName(null);
        assertSame(instance, result, "Fluent setter for entityName should return the same instance");
    }

    @Test
    public void testFluentSetter_messageWithParams() {
        ErrorBody result = instance.messageWithParams(null);
        assertSame(instance, result, "Fluent setter for messageWithParams should return the same instance");
    }

    @Test
    public void testFluentSetter_messageParams() {
        ErrorBody result = instance.messageParams(null);
        assertSame(instance, result, "Fluent setter for messageParams should return the same instance");
    }

    @Test
    public void testFluentSetter_contextId() {
        ErrorBody result = instance.contextId(null);
        assertSame(instance, result, "Fluent setter for contextId should return the same instance");
    }

    @Test
    public void testFluentSetter_details() {
        ErrorBody result = instance.details(null);
        assertSame(instance, result, "Fluent setter for details should return the same instance");
    }

    @Test
    public void testFluentSetter_errors() {
        ErrorBody result = instance.errors(null);
        assertSame(instance, result, "Fluent setter for errors should return the same instance");
    }

    @Test
    public void testFluentSetter_limit() {
        ErrorBody result = instance.limit(null);
        assertSame(instance, result, "Fluent setter for limit should return the same instance");
    }
}
