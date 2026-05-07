package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for ConversationFormPage model.
 */
public class ConversationFormPageTest {

    private ConversationFormPage instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new ConversationFormPage();
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
        ConversationFormPage a = new ConversationFormPage();
        ConversationFormPage b = new ConversationFormPage();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        ConversationFormPage a = new ConversationFormPage();
        ConversationFormPage b = new ConversationFormPage();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class ConversationFormPage"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        ConversationFormPage deserialized = objectMapper.readValue(json, ConversationFormPage.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_title() {
        ConversationFormPage result = instance.title(null);
        assertSame(instance, result, "Fluent setter for title should return the same instance");
    }

    @Test
    public void testFluentSetter_subtitle() {
        ConversationFormPage result = instance.subtitle(null);
        assertSame(instance, result, "Fluent setter for subtitle should return the same instance");
    }

    @Test
    public void testFluentSetter_pageComponents() {
        ConversationFormPage result = instance.pageComponents(null);
        assertSame(instance, result, "Fluent setter for pageComponents should return the same instance");
    }
}
