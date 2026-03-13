package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for ContentButtonResponse model.
 */
public class ContentButtonResponseTest {

    private ContentButtonResponse instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new ContentButtonResponse();
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
        ContentButtonResponse a = new ContentButtonResponse();
        ContentButtonResponse b = new ContentButtonResponse();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        ContentButtonResponse a = new ContentButtonResponse();
        ContentButtonResponse b = new ContentButtonResponse();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class ContentButtonResponse"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        ContentButtonResponse deserialized = objectMapper.readValue(json, ContentButtonResponse.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_id() {
        ContentButtonResponse result = instance.id(null);
        assertSame(instance, result, "Fluent setter for id should return the same instance");
    }

    @Test
    public void testFluentSetter_originatingMessageId() {
        ContentButtonResponse result = instance.originatingMessageId(null);
        assertSame(instance, result, "Fluent setter for originatingMessageId should return the same instance");
    }

    @Test
    public void testFluentSetter_payload() {
        ContentButtonResponse result = instance.payload(null);
        assertSame(instance, result, "Fluent setter for payload should return the same instance");
    }

    @Test
    public void testFluentSetter_text() {
        ContentButtonResponse result = instance.text(null);
        assertSame(instance, result, "Fluent setter for text should return the same instance");
    }

    @Test
    public void testFluentSetter_type() {
        ContentButtonResponse result = instance.type(null);
        assertSame(instance, result, "Fluent setter for type should return the same instance");
    }
}
