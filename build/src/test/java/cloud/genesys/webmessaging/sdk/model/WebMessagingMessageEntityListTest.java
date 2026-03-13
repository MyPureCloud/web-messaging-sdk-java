package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for WebMessagingMessageEntityList model.
 */
public class WebMessagingMessageEntityListTest {

    private WebMessagingMessageEntityList instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new WebMessagingMessageEntityList();
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
        WebMessagingMessageEntityList a = new WebMessagingMessageEntityList();
        WebMessagingMessageEntityList b = new WebMessagingMessageEntityList();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        WebMessagingMessageEntityList a = new WebMessagingMessageEntityList();
        WebMessagingMessageEntityList b = new WebMessagingMessageEntityList();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class WebMessagingMessageEntityList"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        WebMessagingMessageEntityList deserialized = objectMapper.readValue(json, WebMessagingMessageEntityList.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_entities() {
        WebMessagingMessageEntityList result = instance.entities(null);
        assertSame(instance, result, "Fluent setter for entities should return the same instance");
    }

    @Test
    public void testFluentSetter_pageSize() {
        WebMessagingMessageEntityList result = instance.pageSize(null);
        assertSame(instance, result, "Fluent setter for pageSize should return the same instance");
    }

    @Test
    public void testFluentSetter_pageNumber() {
        WebMessagingMessageEntityList result = instance.pageNumber(null);
        assertSame(instance, result, "Fluent setter for pageNumber should return the same instance");
    }

    @Test
    public void testFluentSetter_total() {
        WebMessagingMessageEntityList result = instance.total(null);
        assertSame(instance, result, "Fluent setter for total should return the same instance");
    }

    @Test
    public void testFluentSetter_pageCount() {
        WebMessagingMessageEntityList result = instance.pageCount(null);
        assertSame(instance, result, "Fluent setter for pageCount should return the same instance");
    }
}
