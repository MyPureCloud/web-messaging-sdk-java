package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for ContentThumbnail model.
 */
public class ContentThumbnailTest {

    private ContentThumbnail instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new ContentThumbnail();
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
        ContentThumbnail a = new ContentThumbnail();
        ContentThumbnail b = new ContentThumbnail();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        ContentThumbnail a = new ContentThumbnail();
        ContentThumbnail b = new ContentThumbnail();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class ContentThumbnail"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        ContentThumbnail deserialized = objectMapper.readValue(json, ContentThumbnail.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_contentSizeBytes() {
        ContentThumbnail result = instance.contentSizeBytes(null);
        assertSame(instance, result, "Fluent setter for contentSizeBytes should return the same instance");
    }

    @Test
    public void testFluentSetter_mime() {
        ContentThumbnail result = instance.mime(null);
        assertSame(instance, result, "Fluent setter for mime should return the same instance");
    }

    @Test
    public void testFluentSetter_sha256() {
        ContentThumbnail result = instance.sha256(null);
        assertSame(instance, result, "Fluent setter for sha256 should return the same instance");
    }

    @Test
    public void testFluentSetter_url() {
        ContentThumbnail result = instance.url(null);
        assertSame(instance, result, "Fluent setter for url should return the same instance");
    }
}
