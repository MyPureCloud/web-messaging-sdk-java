package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for ContentQuickReplyV2 model.
 */
public class ContentQuickReplyV2Test {

    private ContentQuickReplyV2 instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new ContentQuickReplyV2();
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
        ContentQuickReplyV2 a = new ContentQuickReplyV2();
        ContentQuickReplyV2 b = new ContentQuickReplyV2();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        ContentQuickReplyV2 a = new ContentQuickReplyV2();
        ContentQuickReplyV2 b = new ContentQuickReplyV2();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class ContentQuickReplyV2"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        ContentQuickReplyV2 deserialized = objectMapper.readValue(json, ContentQuickReplyV2.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_actions() {
        ContentQuickReplyV2 result = instance.actions(null);
        assertSame(instance, result, "Fluent setter for actions should return the same instance");
    }

    @Test
    public void testFluentSetter_title() {
        ContentQuickReplyV2 result = instance.title(null);
        assertSame(instance, result, "Fluent setter for title should return the same instance");
    }
}
