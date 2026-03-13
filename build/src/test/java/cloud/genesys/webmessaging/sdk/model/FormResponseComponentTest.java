package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for FormResponseComponent model.
 */
public class FormResponseComponentTest {

    private FormResponseComponent instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new FormResponseComponent();
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
        FormResponseComponent a = new FormResponseComponent();
        FormResponseComponent b = new FormResponseComponent();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        FormResponseComponent a = new FormResponseComponent();
        FormResponseComponent b = new FormResponseComponent();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class FormResponseComponent"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        FormResponseComponent deserialized = objectMapper.readValue(json, FormResponseComponent.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_component() {
        FormResponseComponent result = instance.component(null);
        assertSame(instance, result, "Fluent setter for component should return the same instance");
    }

    @Test
    public void testFluentSetter_id() {
        FormResponseComponent result = instance.id(null);
        assertSame(instance, result, "Fluent setter for id should return the same instance");
    }
}
