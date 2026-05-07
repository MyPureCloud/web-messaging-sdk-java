package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for ConversationContentInput model.
 */
public class ConversationContentInputTest {

    private ConversationContentInput instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new ConversationContentInput();
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
        ConversationContentInput a = new ConversationContentInput();
        ConversationContentInput b = new ConversationContentInput();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        ConversationContentInput a = new ConversationContentInput();
        ConversationContentInput b = new ConversationContentInput();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class ConversationContentInput"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        ConversationContentInput deserialized = objectMapper.readValue(json, ConversationContentInput.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_id() {
        ConversationContentInput result = instance.id(null);
        assertSame(instance, result, "Fluent setter for id should return the same instance");
    }

    @Test
    public void testFluentSetter_title() {
        ConversationContentInput result = instance.title(null);
        assertSame(instance, result, "Fluent setter for title should return the same instance");
    }

    @Test
    public void testFluentSetter_subtitle() {
        ConversationContentInput result = instance.subtitle(null);
        assertSame(instance, result, "Fluent setter for subtitle should return the same instance");
    }

    @Test
    public void testFluentSetter_placeholderText() {
        ConversationContentInput result = instance.placeholderText(null);
        assertSame(instance, result, "Fluent setter for placeholderText should return the same instance");
    }

    @Test
    public void testFluentSetter_isRequired() {
        ConversationContentInput result = instance.isRequired(null);
        assertSame(instance, result, "Fluent setter for isRequired should return the same instance");
    }

    @Test
    public void testFluentSetter_isMultipleLine() {
        ConversationContentInput result = instance.isMultipleLine(null);
        assertSame(instance, result, "Fluent setter for isMultipleLine should return the same instance");
    }

    @Test
    public void testFluentSetter_keyboardType() {
        ConversationContentInput result = instance.keyboardType(null);
        assertSame(instance, result, "Fluent setter for keyboardType should return the same instance");
    }

    @Test
    public void testFluentSetter_autoCompleteType() {
        ConversationContentInput result = instance.autoCompleteType(null);
        assertSame(instance, result, "Fluent setter for autoCompleteType should return the same instance");
    }
}
