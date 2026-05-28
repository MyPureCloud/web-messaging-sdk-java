package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for ContentNotificationResponse model.
 */
public class ContentNotificationResponseTest {

    private ContentNotificationResponse instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new ContentNotificationResponse();
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
        ContentNotificationResponse a = new ContentNotificationResponse();
        ContentNotificationResponse b = new ContentNotificationResponse();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        ContentNotificationResponse a = new ContentNotificationResponse();
        ContentNotificationResponse b = new ContentNotificationResponse();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class ContentNotificationResponse"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        ContentNotificationResponse deserialized = objectMapper.readValue(json, ContentNotificationResponse.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_notificationStatus() {
        ContentNotificationResponse result = instance.notificationStatus(null);
        assertSame(instance, result, "Fluent setter for notificationStatus should return the same instance");
    }

    @Test
    public void testFluentSetter_notificationText() {
        ContentNotificationResponse result = instance.notificationText(null);
        assertSame(instance, result, "Fluent setter for notificationText should return the same instance");
    }

    @Test
    public void testFluentSetter_originatingMessageId() {
        ContentNotificationResponse result = instance.originatingMessageId(null);
        assertSame(instance, result, "Fluent setter for originatingMessageId should return the same instance");
    }

    @Test
    public void testFluentSetter_referenceId() {
        ContentNotificationResponse result = instance.referenceId(null);
        assertSame(instance, result, "Fluent setter for referenceId should return the same instance");
    }
}
