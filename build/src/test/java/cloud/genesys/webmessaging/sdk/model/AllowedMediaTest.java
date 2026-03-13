package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for AllowedMedia model.
 */
public class AllowedMediaTest {

    private AllowedMedia instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new AllowedMedia();
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
        AllowedMedia a = new AllowedMedia();
        AllowedMedia b = new AllowedMedia();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        AllowedMedia a = new AllowedMedia();
        AllowedMedia b = new AllowedMedia();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class AllowedMedia"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        AllowedMedia deserialized = objectMapper.readValue(json, AllowedMedia.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_inbound() {
        AllowedMedia result = instance.inbound(null);
        assertSame(instance, result, "Fluent setter for inbound should return the same instance");
    }
}
