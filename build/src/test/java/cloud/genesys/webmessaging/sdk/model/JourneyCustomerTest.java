package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for JourneyCustomer model.
 */
public class JourneyCustomerTest {

    private JourneyCustomer instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new JourneyCustomer();
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
        JourneyCustomer a = new JourneyCustomer();
        JourneyCustomer b = new JourneyCustomer();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        JourneyCustomer a = new JourneyCustomer();
        JourneyCustomer b = new JourneyCustomer();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class JourneyCustomer"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        JourneyCustomer deserialized = objectMapper.readValue(json, JourneyCustomer.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_id() {
        JourneyCustomer result = instance.id(null);
        assertSame(instance, result, "Fluent setter for id should return the same instance");
    }

    @Test
    public void testFluentSetter_idType() {
        JourneyCustomer result = instance.idType(null);
        assertSame(instance, result, "Fluent setter for idType should return the same instance");
    }
}
