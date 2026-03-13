package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for ContentReaction model.
 */
public class ContentReactionTest {

    private ContentReaction instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new ContentReaction();
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
        ContentReaction a = new ContentReaction();
        ContentReaction b = new ContentReaction();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        ContentReaction a = new ContentReaction();
        ContentReaction b = new ContentReaction();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class ContentReaction"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        ContentReaction deserialized = objectMapper.readValue(json, ContentReaction.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_count() {
        ContentReaction result = instance.count(null);
        assertSame(instance, result, "Fluent setter for count should return the same instance");
    }

    @Test
    public void testFluentSetter_reactionType() {
        ContentReaction result = instance.reactionType(null);
        assertSame(instance, result, "Fluent setter for reactionType should return the same instance");
    }
}
