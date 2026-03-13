package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for WebMessagingEventVideo model.
 */
public class WebMessagingEventVideoTest {

    private WebMessagingEventVideo instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new WebMessagingEventVideo();
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
        WebMessagingEventVideo a = new WebMessagingEventVideo();
        WebMessagingEventVideo b = new WebMessagingEventVideo();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        WebMessagingEventVideo a = new WebMessagingEventVideo();
        WebMessagingEventVideo b = new WebMessagingEventVideo();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class WebMessagingEventVideo"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        WebMessagingEventVideo deserialized = objectMapper.readValue(json, WebMessagingEventVideo.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_type() {
        WebMessagingEventVideo result = instance.type(null);
        assertSame(instance, result, "Fluent setter for type should return the same instance");
    }

    @Test
    public void testFluentSetter_offeringId() {
        WebMessagingEventVideo result = instance.offeringId(null);
        assertSame(instance, result, "Fluent setter for offeringId should return the same instance");
    }

    @Test
    public void testFluentSetter_jwt() {
        WebMessagingEventVideo result = instance.jwt(null);
        assertSame(instance, result, "Fluent setter for jwt should return the same instance");
    }
}
