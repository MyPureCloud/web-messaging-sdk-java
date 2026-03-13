package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for BaseContentAttachment model.
 */
public class BaseContentAttachmentTest {

    private BaseContentAttachment instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new BaseContentAttachment();
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
        BaseContentAttachment a = new BaseContentAttachment();
        BaseContentAttachment b = new BaseContentAttachment();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        BaseContentAttachment a = new BaseContentAttachment();
        BaseContentAttachment b = new BaseContentAttachment();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class BaseContentAttachment"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        BaseContentAttachment deserialized = objectMapper.readValue(json, BaseContentAttachment.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_id() {
        BaseContentAttachment result = instance.id(null);
        assertSame(instance, result, "Fluent setter for id should return the same instance");
    }

    @Test
    public void testFluentSetter_filename() {
        BaseContentAttachment result = instance.filename(null);
        assertSame(instance, result, "Fluent setter for filename should return the same instance");
    }

    @Test
    public void testFluentSetter_fileSize() {
        BaseContentAttachment result = instance.fileSize(null);
        assertSame(instance, result, "Fluent setter for fileSize should return the same instance");
    }

    @Test
    public void testFluentSetter_mediaType() {
        BaseContentAttachment result = instance.mediaType(null);
        assertSame(instance, result, "Fluent setter for mediaType should return the same instance");
    }

    @Test
    public void testFluentSetter_mime() {
        BaseContentAttachment result = instance.mime(null);
        assertSame(instance, result, "Fluent setter for mime should return the same instance");
    }

    @Test
    public void testFluentSetter_sha256() {
        BaseContentAttachment result = instance.sha256(null);
        assertSame(instance, result, "Fluent setter for sha256 should return the same instance");
    }

    @Test
    public void testFluentSetter_text() {
        BaseContentAttachment result = instance.text(null);
        assertSame(instance, result, "Fluent setter for text should return the same instance");
    }

    @Test
    public void testFluentSetter_url() {
        BaseContentAttachment result = instance.url(null);
        assertSame(instance, result, "Fluent setter for url should return the same instance");
    }
}
