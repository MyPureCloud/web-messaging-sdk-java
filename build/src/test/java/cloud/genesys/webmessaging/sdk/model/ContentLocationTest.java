package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for ContentLocation model.
 */
public class ContentLocationTest {

    private ContentLocation instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new ContentLocation();
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
        ContentLocation a = new ContentLocation();
        ContentLocation b = new ContentLocation();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        ContentLocation a = new ContentLocation();
        ContentLocation b = new ContentLocation();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class ContentLocation"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        ContentLocation deserialized = objectMapper.readValue(json, ContentLocation.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_address() {
        ContentLocation result = instance.address(null);
        assertSame(instance, result, "Fluent setter for address should return the same instance");
    }

    @Test
    public void testFluentSetter_latitude() {
        ContentLocation result = instance.latitude(null);
        assertSame(instance, result, "Fluent setter for latitude should return the same instance");
    }

    @Test
    public void testFluentSetter_longitude() {
        ContentLocation result = instance.longitude(null);
        assertSame(instance, result, "Fluent setter for longitude should return the same instance");
    }

    @Test
    public void testFluentSetter_text() {
        ContentLocation result = instance.text(null);
        assertSame(instance, result, "Fluent setter for text should return the same instance");
    }

    @Test
    public void testFluentSetter_url() {
        ContentLocation result = instance.url(null);
        assertSame(instance, result, "Fluent setter for url should return the same instance");
    }
}
