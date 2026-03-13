package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for ContentRoadsideAssistance model.
 */
public class ContentRoadsideAssistanceTest {

    private ContentRoadsideAssistance instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new ContentRoadsideAssistance();
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
        ContentRoadsideAssistance a = new ContentRoadsideAssistance();
        ContentRoadsideAssistance b = new ContentRoadsideAssistance();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        ContentRoadsideAssistance a = new ContentRoadsideAssistance();
        ContentRoadsideAssistance b = new ContentRoadsideAssistance();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class ContentRoadsideAssistance"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        ContentRoadsideAssistance deserialized = objectMapper.readValue(json, ContentRoadsideAssistance.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_isDevicePhoneNumber() {
        ContentRoadsideAssistance result = instance.isDevicePhoneNumber(null);
        assertSame(instance, result, "Fluent setter for isDevicePhoneNumber should return the same instance");
    }

    @Test
    public void testFluentSetter_location() {
        ContentRoadsideAssistance result = instance.location(null);
        assertSame(instance, result, "Fluent setter for location should return the same instance");
    }

    @Test
    public void testFluentSetter_messageNumber() {
        ContentRoadsideAssistance result = instance.messageNumber(null);
        assertSame(instance, result, "Fluent setter for messageNumber should return the same instance");
    }

    @Test
    public void testFluentSetter_phoneNumber() {
        ContentRoadsideAssistance result = instance.phoneNumber(null);
        assertSame(instance, result, "Fluent setter for phoneNumber should return the same instance");
    }

    @Test
    public void testFluentSetter_text() {
        ContentRoadsideAssistance result = instance.text(null);
        assertSame(instance, result, "Fluent setter for text should return the same instance");
    }
}
