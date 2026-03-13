package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for ContentPush model.
 */
public class ContentPushTest {

    private ContentPush instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new ContentPush();
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
        ContentPush a = new ContentPush();
        ContentPush b = new ContentPush();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        ContentPush a = new ContentPush();
        ContentPush b = new ContentPush();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class ContentPush"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        ContentPush deserialized = objectMapper.readValue(json, ContentPush.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_deviceToken() {
        ContentPush result = instance.deviceToken(null);
        assertSame(instance, result, "Fluent setter for deviceToken should return the same instance");
    }

    @Test
    public void testFluentSetter_deviceTokenId() {
        ContentPush result = instance.deviceTokenId(null);
        assertSame(instance, result, "Fluent setter for deviceTokenId should return the same instance");
    }

    @Test
    public void testFluentSetter_deviceType() {
        ContentPush result = instance.deviceType(null);
        assertSame(instance, result, "Fluent setter for deviceType should return the same instance");
    }

    @Test
    public void testFluentSetter_expiration() {
        ContentPush result = instance.expiration(null);
        assertSame(instance, result, "Fluent setter for expiration should return the same instance");
    }

    @Test
    public void testFluentSetter_failedMessages() {
        ContentPush result = instance.failedMessages(null);
        assertSame(instance, result, "Fluent setter for failedMessages should return the same instance");
    }

    @Test
    public void testFluentSetter_notificationMessage() {
        ContentPush result = instance.notificationMessage(null);
        assertSame(instance, result, "Fluent setter for notificationMessage should return the same instance");
    }

    @Test
    public void testFluentSetter_pushProviderIntegration() {
        ContentPush result = instance.pushProviderIntegration(null);
        assertSame(instance, result, "Fluent setter for pushProviderIntegration should return the same instance");
    }
}
