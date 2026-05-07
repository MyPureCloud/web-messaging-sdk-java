package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for ConversationFormResponseContent model.
 */
public class ConversationFormResponseContentTest {

    private ConversationFormResponseContent instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new ConversationFormResponseContent();
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
        ConversationFormResponseContent a = new ConversationFormResponseContent();
        ConversationFormResponseContent b = new ConversationFormResponseContent();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        ConversationFormResponseContent a = new ConversationFormResponseContent();
        ConversationFormResponseContent b = new ConversationFormResponseContent();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class ConversationFormResponseContent"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        ConversationFormResponseContent deserialized = objectMapper.readValue(json, ConversationFormResponseContent.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_contentType() {
        ConversationFormResponseContent result = instance.contentType(null);
        assertSame(instance, result, "Fluent setter for contentType should return the same instance");
    }

    @Test
    public void testFluentSetter_buttonResponse() {
        ConversationFormResponseContent result = instance.buttonResponse(null);
        assertSame(instance, result, "Fluent setter for buttonResponse should return the same instance");
    }
}
