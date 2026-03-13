package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for PresignedUrlResponse model.
 */
public class PresignedUrlResponseTest {

    private PresignedUrlResponse instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new PresignedUrlResponse();
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
        PresignedUrlResponse a = new PresignedUrlResponse();
        PresignedUrlResponse b = new PresignedUrlResponse();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        PresignedUrlResponse a = new PresignedUrlResponse();
        PresignedUrlResponse b = new PresignedUrlResponse();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class PresignedUrlResponse"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        PresignedUrlResponse deserialized = objectMapper.readValue(json, PresignedUrlResponse.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_tracingId() {
        PresignedUrlResponse result = instance.tracingId(null);
        assertSame(instance, result, "Fluent setter for tracingId should return the same instance");
    }

    @Test
    public void testFluentSetter_attachmentId() {
        PresignedUrlResponse result = instance.attachmentId(null);
        assertSame(instance, result, "Fluent setter for attachmentId should return the same instance");
    }

    @Test
    public void testFluentSetter_headers() {
        PresignedUrlResponse result = instance.headers(null);
        assertSame(instance, result, "Fluent setter for headers should return the same instance");
    }

    @Test
    public void testFluentSetter_url() {
        PresignedUrlResponse result = instance.url(null);
        assertSame(instance, result, "Fluent setter for url should return the same instance");
    }

    @Test
    public void testFluentSetter_fileName() {
        PresignedUrlResponse result = instance.fileName(null);
        assertSame(instance, result, "Fluent setter for fileName should return the same instance");
    }

    @Test
    public void testFluentSetter_fileSize() {
        PresignedUrlResponse result = instance.fileSize(null);
        assertSame(instance, result, "Fluent setter for fileSize should return the same instance");
    }

    @Test
    public void testFluentSetter_fileType() {
        PresignedUrlResponse result = instance.fileType(null);
        assertSame(instance, result, "Fluent setter for fileType should return the same instance");
    }
}
