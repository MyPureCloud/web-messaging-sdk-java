package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for ContentRichLink model.
 */
public class ContentRichLinkTest {

    private ContentRichLink instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new ContentRichLink();
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
        ContentRichLink a = new ContentRichLink();
        ContentRichLink b = new ContentRichLink();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        ContentRichLink a = new ContentRichLink();
        ContentRichLink b = new ContentRichLink();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class ContentRichLink"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        ContentRichLink deserialized = objectMapper.readValue(json, ContentRichLink.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_footer() {
        ContentRichLink result = instance.footer(null);
        assertSame(instance, result, "Fluent setter for footer should return the same instance");
    }

    @Test
    public void testFluentSetter_header() {
        ContentRichLink result = instance.header(null);
        assertSame(instance, result, "Fluent setter for header should return the same instance");
    }

    @Test
    public void testFluentSetter_text() {
        ContentRichLink result = instance.text(null);
        assertSame(instance, result, "Fluent setter for text should return the same instance");
    }

    @Test
    public void testFluentSetter_url() {
        ContentRichLink result = instance.url(null);
        assertSame(instance, result, "Fluent setter for url should return the same instance");
    }

    @Test
    public void testFluentSetter_urlLabel() {
        ContentRichLink result = instance.urlLabel(null);
        assertSame(instance, result, "Fluent setter for urlLabel should return the same instance");
    }
}
