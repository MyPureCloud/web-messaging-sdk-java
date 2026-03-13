package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for EventVideo model.
 */
public class EventVideoTest {

    private EventVideo instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new EventVideo();
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
        EventVideo a = new EventVideo();
        EventVideo b = new EventVideo();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        EventVideo a = new EventVideo();
        EventVideo b = new EventVideo();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class EventVideo"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        EventVideo deserialized = objectMapper.readValue(json, EventVideo.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_jwt() {
        EventVideo result = instance.jwt(null);
        assertSame(instance, result, "Fluent setter for jwt should return the same instance");
    }

    @Test
    public void testFluentSetter_offeringId() {
        EventVideo result = instance.offeringId(null);
        assertSame(instance, result, "Fluent setter for offeringId should return the same instance");
    }

    @Test
    public void testFluentSetter_type() {
        EventVideo result = instance.type(null);
        assertSame(instance, result, "Fluent setter for type should return the same instance");
    }
}
