package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for ButtonComponent model.
 */
public class ButtonComponentTest {

    private ButtonComponent instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new ButtonComponent();
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
        ButtonComponent a = new ButtonComponent();
        ButtonComponent b = new ButtonComponent();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        ButtonComponent a = new ButtonComponent();
        ButtonComponent b = new ButtonComponent();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class ButtonComponent"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        ButtonComponent deserialized = objectMapper.readValue(json, ButtonComponent.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_title() {
        ButtonComponent result = instance.title(null);
        assertSame(instance, result, "Fluent setter for title should return the same instance");
    }

    @Test
    public void testFluentSetter_actions() {
        ButtonComponent result = instance.actions(null);
        assertSame(instance, result, "Fluent setter for actions should return the same instance");
    }
}
