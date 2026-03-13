package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for UploadSuccessEvent model.
 */
public class UploadSuccessEventTest {

    private UploadSuccessEvent instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new UploadSuccessEvent();
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
        UploadSuccessEvent a = new UploadSuccessEvent();
        UploadSuccessEvent b = new UploadSuccessEvent();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        UploadSuccessEvent a = new UploadSuccessEvent();
        UploadSuccessEvent b = new UploadSuccessEvent();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class UploadSuccessEvent"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        UploadSuccessEvent deserialized = objectMapper.readValue(json, UploadSuccessEvent.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_tracingId() {
        UploadSuccessEvent result = instance.tracingId(null);
        assertSame(instance, result, "Fluent setter for tracingId should return the same instance");
    }

    @Test
    public void testFluentSetter_attachmentId() {
        UploadSuccessEvent result = instance.attachmentId(null);
        assertSame(instance, result, "Fluent setter for attachmentId should return the same instance");
    }

    @Test
    public void testFluentSetter_downloadUrl() {
        UploadSuccessEvent result = instance.downloadUrl(null);
        assertSame(instance, result, "Fluent setter for downloadUrl should return the same instance");
    }

    @Test
    public void testFluentSetter_timestamp() {
        UploadSuccessEvent result = instance.timestamp(null);
        assertSame(instance, result, "Fluent setter for timestamp should return the same instance");
    }
}
