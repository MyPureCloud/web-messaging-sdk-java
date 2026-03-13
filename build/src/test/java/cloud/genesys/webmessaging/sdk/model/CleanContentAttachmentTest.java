package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for CleanContentAttachment model.
 */
public class CleanContentAttachmentTest {

    private CleanContentAttachment instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new CleanContentAttachment();
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
        CleanContentAttachment a = new CleanContentAttachment();
        CleanContentAttachment b = new CleanContentAttachment();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        CleanContentAttachment a = new CleanContentAttachment();
        CleanContentAttachment b = new CleanContentAttachment();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class CleanContentAttachment"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        CleanContentAttachment deserialized = objectMapper.readValue(json, CleanContentAttachment.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_id() {
        CleanContentAttachment result = instance.id(null);
        assertSame(instance, result, "Fluent setter for id should return the same instance");
    }

    @Test
    public void testFluentSetter_filename() {
        CleanContentAttachment result = instance.filename(null);
        assertSame(instance, result, "Fluent setter for filename should return the same instance");
    }

    @Test
    public void testFluentSetter_fileSize() {
        CleanContentAttachment result = instance.fileSize(null);
        assertSame(instance, result, "Fluent setter for fileSize should return the same instance");
    }

    @Test
    public void testFluentSetter_mediaType() {
        CleanContentAttachment result = instance.mediaType(null);
        assertSame(instance, result, "Fluent setter for mediaType should return the same instance");
    }

    @Test
    public void testFluentSetter_mime() {
        CleanContentAttachment result = instance.mime(null);
        assertSame(instance, result, "Fluent setter for mime should return the same instance");
    }

    @Test
    public void testFluentSetter_sha256() {
        CleanContentAttachment result = instance.sha256(null);
        assertSame(instance, result, "Fluent setter for sha256 should return the same instance");
    }

    @Test
    public void testFluentSetter_text() {
        CleanContentAttachment result = instance.text(null);
        assertSame(instance, result, "Fluent setter for text should return the same instance");
    }

    @Test
    public void testFluentSetter_url() {
        CleanContentAttachment result = instance.url(null);
        assertSame(instance, result, "Fluent setter for url should return the same instance");
    }
}
