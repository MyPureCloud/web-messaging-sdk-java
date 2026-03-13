package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for JourneyAction model.
 */
public class JourneyActionTest {

    private JourneyAction instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new JourneyAction();
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
        JourneyAction a = new JourneyAction();
        JourneyAction b = new JourneyAction();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        JourneyAction a = new JourneyAction();
        JourneyAction b = new JourneyAction();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class JourneyAction"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        JourneyAction deserialized = objectMapper.readValue(json, JourneyAction.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_id() {
        JourneyAction result = instance.id(null);
        assertSame(instance, result, "Fluent setter for id should return the same instance");
    }

    @Test
    public void testFluentSetter_actionMap() {
        JourneyAction result = instance.actionMap(null);
        assertSame(instance, result, "Fluent setter for actionMap should return the same instance");
    }
}
