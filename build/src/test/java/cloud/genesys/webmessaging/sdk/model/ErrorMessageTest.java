package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for ErrorMessage model.
 */
public class ErrorMessageTest {

    private ErrorMessage instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new ErrorMessage();
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
        ErrorMessage a = new ErrorMessage();
        ErrorMessage b = new ErrorMessage();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        ErrorMessage a = new ErrorMessage();
        ErrorMessage b = new ErrorMessage();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class ErrorMessage"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        ErrorMessage deserialized = objectMapper.readValue(json, ErrorMessage.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_name() {
        ErrorMessage result = instance.name(null);
        assertSame(instance, result, "Fluent setter for name should return the same instance");
    }

    @Test
    public void testFluentSetter_message() {
        ErrorMessage result = instance.message(null);
        assertSame(instance, result, "Fluent setter for message should return the same instance");
    }

    @Test
    public void testFluentSetter_stack() {
        ErrorMessage result = instance.stack(null);
        assertSame(instance, result, "Fluent setter for stack should return the same instance");
    }

    @Test
    public void testFluentSetter_errorCode() {
        ErrorMessage result = instance.errorCode(null);
        assertSame(instance, result, "Fluent setter for errorCode should return the same instance");
    }

    @Test
    public void testFluentSetter_errorMessage() {
        ErrorMessage result = instance.errorMessage(null);
        assertSame(instance, result, "Fluent setter for errorMessage should return the same instance");
    }

    @Test
    public void testFluentSetter_tracingId() {
        ErrorMessage result = instance.tracingId(null);
        assertSame(instance, result, "Fluent setter for tracingId should return the same instance");
    }
}
