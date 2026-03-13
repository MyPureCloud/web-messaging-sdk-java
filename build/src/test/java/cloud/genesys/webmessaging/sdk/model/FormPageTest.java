package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for FormPage model.
 */
public class FormPageTest {

    private FormPage instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new FormPage();
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
        FormPage a = new FormPage();
        FormPage b = new FormPage();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        FormPage a = new FormPage();
        FormPage b = new FormPage();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class FormPage"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        FormPage deserialized = objectMapper.readValue(json, FormPage.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_pageComponents() {
        FormPage result = instance.pageComponents(null);
        assertSame(instance, result, "Fluent setter for pageComponents should return the same instance");
    }

    @Test
    public void testFluentSetter_subtitle() {
        FormPage result = instance.subtitle(null);
        assertSame(instance, result, "Fluent setter for subtitle should return the same instance");
    }

    @Test
    public void testFluentSetter_title() {
        FormPage result = instance.title(null);
        assertSame(instance, result, "Fluent setter for title should return the same instance");
    }
}
