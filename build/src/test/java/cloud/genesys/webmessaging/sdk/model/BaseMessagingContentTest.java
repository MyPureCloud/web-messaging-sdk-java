package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for BaseMessagingContent model.
 */
public class BaseMessagingContentTest {

    private BaseMessagingContent instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new BaseMessagingContent();
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
        BaseMessagingContent a = new BaseMessagingContent();
        BaseMessagingContent b = new BaseMessagingContent();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        BaseMessagingContent a = new BaseMessagingContent();
        BaseMessagingContent b = new BaseMessagingContent();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class BaseMessagingContent"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        BaseMessagingContent deserialized = objectMapper.readValue(json, BaseMessagingContent.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_attachment() {
        BaseMessagingContent result = instance.attachment(null);
        assertSame(instance, result, "Fluent setter for attachment should return the same instance");
    }

    @Test
    public void testFluentSetter_contentType() {
        BaseMessagingContent result = instance.contentType(null);
        assertSame(instance, result, "Fluent setter for contentType should return the same instance");
    }
}
