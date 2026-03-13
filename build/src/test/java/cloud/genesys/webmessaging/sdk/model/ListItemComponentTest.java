package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for ListItemComponent model.
 */
public class ListItemComponentTest {

    private ListItemComponent instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new ListItemComponent();
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
        ListItemComponent a = new ListItemComponent();
        ListItemComponent b = new ListItemComponent();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        ListItemComponent a = new ListItemComponent();
        ListItemComponent b = new ListItemComponent();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class ListItemComponent"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        ListItemComponent deserialized = objectMapper.readValue(json, ListItemComponent.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_actions() {
        ListItemComponent result = instance.actions(null);
        assertSame(instance, result, "Fluent setter for actions should return the same instance");
    }

    @Test
    public void testFluentSetter_description() {
        ListItemComponent result = instance.description(null);
        assertSame(instance, result, "Fluent setter for description should return the same instance");
    }

    @Test
    public void testFluentSetter_id() {
        ListItemComponent result = instance.id(null);
        assertSame(instance, result, "Fluent setter for id should return the same instance");
    }

    @Test
    public void testFluentSetter_image() {
        ListItemComponent result = instance.image(null);
        assertSame(instance, result, "Fluent setter for image should return the same instance");
    }

    @Test
    public void testFluentSetter_rmid() {
        ListItemComponent result = instance.rmid(null);
        assertSame(instance, result, "Fluent setter for rmid should return the same instance");
    }

    @Test
    public void testFluentSetter_title() {
        ListItemComponent result = instance.title(null);
        assertSame(instance, result, "Fluent setter for title should return the same instance");
    }

    @Test
    public void testFluentSetter_type() {
        ListItemComponent result = instance.type(null);
        assertSame(instance, result, "Fluent setter for type should return the same instance");
    }
}
