package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for ContentList model.
 */
public class ContentListTest {

    private ContentList instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new ContentList();
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
        ContentList a = new ContentList();
        ContentList b = new ContentList();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        ContentList a = new ContentList();
        ContentList b = new ContentList();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class ContentList"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        ContentList deserialized = objectMapper.readValue(json, ContentList.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_actions() {
        ContentList result = instance.actions(null);
        assertSame(instance, result, "Fluent setter for actions should return the same instance");
    }

    @Test
    public void testFluentSetter_components() {
        ContentList result = instance.components(null);
        assertSame(instance, result, "Fluent setter for components should return the same instance");
    }

    @Test
    public void testFluentSetter_description() {
        ContentList result = instance.description(null);
        assertSame(instance, result, "Fluent setter for description should return the same instance");
    }

    @Test
    public void testFluentSetter_id() {
        ContentList result = instance.id(null);
        assertSame(instance, result, "Fluent setter for id should return the same instance");
    }

    @Test
    public void testFluentSetter_listType() {
        ContentList result = instance.listType(null);
        assertSame(instance, result, "Fluent setter for listType should return the same instance");
    }

    @Test
    public void testFluentSetter_submitLabel() {
        ContentList result = instance.submitLabel(null);
        assertSame(instance, result, "Fluent setter for submitLabel should return the same instance");
    }

    @Test
    public void testFluentSetter_title() {
        ContentList result = instance.title(null);
        assertSame(instance, result, "Fluent setter for title should return the same instance");
    }
}
