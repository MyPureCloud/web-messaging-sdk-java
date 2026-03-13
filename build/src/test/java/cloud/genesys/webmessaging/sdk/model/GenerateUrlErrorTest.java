package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for GenerateUrlError model.
 */
public class GenerateUrlErrorTest {

    private GenerateUrlError instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new GenerateUrlError();
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
        GenerateUrlError a = new GenerateUrlError();
        GenerateUrlError b = new GenerateUrlError();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        GenerateUrlError a = new GenerateUrlError();
        GenerateUrlError b = new GenerateUrlError();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class GenerateUrlError"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        GenerateUrlError deserialized = objectMapper.readValue(json, GenerateUrlError.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_name() {
        GenerateUrlError result = instance.name(null);
        assertSame(instance, result, "Fluent setter for name should return the same instance");
    }

    @Test
    public void testFluentSetter_message() {
        GenerateUrlError result = instance.message(null);
        assertSame(instance, result, "Fluent setter for message should return the same instance");
    }

    @Test
    public void testFluentSetter_stack() {
        GenerateUrlError result = instance.stack(null);
        assertSame(instance, result, "Fluent setter for stack should return the same instance");
    }

    @Test
    public void testFluentSetter_errorCode() {
        GenerateUrlError result = instance.errorCode(null);
        assertSame(instance, result, "Fluent setter for errorCode should return the same instance");
    }

    @Test
    public void testFluentSetter_errorMessage() {
        GenerateUrlError result = instance.errorMessage(null);
        assertSame(instance, result, "Fluent setter for errorMessage should return the same instance");
    }

    @Test
    public void testFluentSetter_tracingId() {
        GenerateUrlError result = instance.tracingId(null);
        assertSame(instance, result, "Fluent setter for tracingId should return the same instance");
    }

    @Test
    public void testFluentSetter_attachmentId() {
        GenerateUrlError result = instance.attachmentId(null);
        assertSame(instance, result, "Fluent setter for attachmentId should return the same instance");
    }

    @Test
    public void testFluentSetter_timestamp() {
        GenerateUrlError result = instance.timestamp(null);
        assertSame(instance, result, "Fluent setter for timestamp should return the same instance");
    }
}
