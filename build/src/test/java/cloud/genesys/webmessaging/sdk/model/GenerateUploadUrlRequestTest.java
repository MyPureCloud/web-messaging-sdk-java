package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for GenerateUploadUrlRequest model.
 */
public class GenerateUploadUrlRequestTest {

    private GenerateUploadUrlRequest instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new GenerateUploadUrlRequest();
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
        GenerateUploadUrlRequest a = new GenerateUploadUrlRequest();
        GenerateUploadUrlRequest b = new GenerateUploadUrlRequest();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        GenerateUploadUrlRequest a = new GenerateUploadUrlRequest();
        GenerateUploadUrlRequest b = new GenerateUploadUrlRequest();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class GenerateUploadUrlRequest"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        GenerateUploadUrlRequest deserialized = objectMapper.readValue(json, GenerateUploadUrlRequest.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_action() {
        GenerateUploadUrlRequest result = instance.action(null);
        assertSame(instance, result, "Fluent setter for action should return the same instance");
    }

    @Test
    public void testFluentSetter_token() {
        GenerateUploadUrlRequest result = instance.token(null);
        assertSame(instance, result, "Fluent setter for token should return the same instance");
    }

    @Test
    public void testFluentSetter_tracingId() {
        GenerateUploadUrlRequest result = instance.tracingId(null);
        assertSame(instance, result, "Fluent setter for tracingId should return the same instance");
    }

    @Test
    public void testFluentSetter_attachmentId() {
        GenerateUploadUrlRequest result = instance.attachmentId(null);
        assertSame(instance, result, "Fluent setter for attachmentId should return the same instance");
    }

    @Test
    public void testFluentSetter_fileName() {
        GenerateUploadUrlRequest result = instance.fileName(null);
        assertSame(instance, result, "Fluent setter for fileName should return the same instance");
    }

    @Test
    public void testFluentSetter_fileType() {
        GenerateUploadUrlRequest result = instance.fileType(null);
        assertSame(instance, result, "Fluent setter for fileType should return the same instance");
    }

    @Test
    public void testFluentSetter_fileSize() {
        GenerateUploadUrlRequest result = instance.fileSize(null);
        assertSame(instance, result, "Fluent setter for fileSize should return the same instance");
    }

    @Test
    public void testFluentSetter_fileMd5() {
        GenerateUploadUrlRequest result = instance.fileMd5(null);
        assertSame(instance, result, "Fluent setter for fileMd5 should return the same instance");
    }
}
