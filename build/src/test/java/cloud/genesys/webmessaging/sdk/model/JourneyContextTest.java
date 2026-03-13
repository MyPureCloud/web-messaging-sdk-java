package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for JourneyContext model.
 */
public class JourneyContextTest {

    private JourneyContext instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new JourneyContext();
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
        JourneyContext a = new JourneyContext();
        JourneyContext b = new JourneyContext();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        JourneyContext a = new JourneyContext();
        JourneyContext b = new JourneyContext();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class JourneyContext"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        JourneyContext deserialized = objectMapper.readValue(json, JourneyContext.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_customer() {
        JourneyContext result = instance.customer(null);
        assertSame(instance, result, "Fluent setter for customer should return the same instance");
    }

    @Test
    public void testFluentSetter_customerSession() {
        JourneyContext result = instance.customerSession(null);
        assertSame(instance, result, "Fluent setter for customerSession should return the same instance");
    }

    @Test
    public void testFluentSetter_triggeringAction() {
        JourneyContext result = instance.triggeringAction(null);
        assertSame(instance, result, "Fluent setter for triggeringAction should return the same instance");
    }
}
