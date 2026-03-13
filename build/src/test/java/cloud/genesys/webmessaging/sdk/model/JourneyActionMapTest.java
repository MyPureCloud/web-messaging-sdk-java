package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for JourneyActionMap model.
 */
public class JourneyActionMapTest {

    private JourneyActionMap instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new JourneyActionMap();
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
        JourneyActionMap a = new JourneyActionMap();
        JourneyActionMap b = new JourneyActionMap();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        JourneyActionMap a = new JourneyActionMap();
        JourneyActionMap b = new JourneyActionMap();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class JourneyActionMap"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        JourneyActionMap deserialized = objectMapper.readValue(json, JourneyActionMap.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_id() {
        JourneyActionMap result = instance.id(null);
        assertSame(instance, result, "Fluent setter for id should return the same instance");
    }

    @Test
    public void testFluentSetter_version() {
        JourneyActionMap result = instance.version(null);
        assertSame(instance, result, "Fluent setter for version should return the same instance");
    }
}
