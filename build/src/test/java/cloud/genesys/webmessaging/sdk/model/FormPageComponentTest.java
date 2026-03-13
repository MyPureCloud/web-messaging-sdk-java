package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for FormPageComponent model.
 */
public class FormPageComponentTest {

    private FormPageComponent instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new FormPageComponent();
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
        FormPageComponent a = new FormPageComponent();
        FormPageComponent b = new FormPageComponent();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        FormPageComponent a = new FormPageComponent();
        FormPageComponent b = new FormPageComponent();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class FormPageComponent"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        FormPageComponent deserialized = objectMapper.readValue(json, FormPageComponent.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_datePicker() {
        FormPageComponent result = instance.datePicker(null);
        assertSame(instance, result, "Fluent setter for datePicker should return the same instance");
    }

    @Test
    public void testFluentSetter_formComponentType() {
        FormPageComponent result = instance.formComponentType(null);
        assertSame(instance, result, "Fluent setter for formComponentType should return the same instance");
    }

    @Test
    public void testFluentSetter_input() {
        FormPageComponent result = instance.input(null);
        assertSame(instance, result, "Fluent setter for input should return the same instance");
    }

    @Test
    public void testFluentSetter_listPicker() {
        FormPageComponent result = instance.listPicker(null);
        assertSame(instance, result, "Fluent setter for listPicker should return the same instance");
    }

    @Test
    public void testFluentSetter_wheelPicker() {
        FormPageComponent result = instance.wheelPicker(null);
        assertSame(instance, result, "Fluent setter for wheelPicker should return the same instance");
    }
}
