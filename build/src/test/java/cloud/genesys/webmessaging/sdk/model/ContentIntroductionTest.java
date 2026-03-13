package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for ContentIntroduction model.
 */
public class ContentIntroductionTest {

    private ContentIntroduction instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new ContentIntroduction();
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
        ContentIntroduction a = new ContentIntroduction();
        ContentIntroduction b = new ContentIntroduction();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        ContentIntroduction a = new ContentIntroduction();
        ContentIntroduction b = new ContentIntroduction();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class ContentIntroduction"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        ContentIntroduction deserialized = objectMapper.readValue(json, ContentIntroduction.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_buttonText() {
        ContentIntroduction result = instance.buttonText(null);
        assertSame(instance, result, "Fluent setter for buttonText should return the same instance");
    }

    @Test
    public void testFluentSetter_imageUrl() {
        ContentIntroduction result = instance.imageUrl(null);
        assertSame(instance, result, "Fluent setter for imageUrl should return the same instance");
    }

    @Test
    public void testFluentSetter_subtitle() {
        ContentIntroduction result = instance.subtitle(null);
        assertSame(instance, result, "Fluent setter for subtitle should return the same instance");
    }

    @Test
    public void testFluentSetter_title() {
        ContentIntroduction result = instance.title(null);
        assertSame(instance, result, "Fluent setter for title should return the same instance");
    }
}
