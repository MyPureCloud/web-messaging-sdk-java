package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for Header model.
 */
public class HeaderTest {

    private Header instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new Header();
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
        Header a = new Header();
        Header b = new Header();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        Header a = new Header();
        Header b = new Header();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class Header"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        Header deserialized = objectMapper.readValue(json, Header.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_media() {
        Header result = instance.media(null);
        assertSame(instance, result, "Fluent setter for media should return the same instance");
    }

    @Test
    public void testFluentSetter_parameters() {
        Header result = instance.parameters(null);
        assertSame(instance, result, "Fluent setter for parameters should return the same instance");
    }

    @Test
    public void testFluentSetter_text() {
        Header result = instance.text(null);
        assertSame(instance, result, "Fluent setter for text should return the same instance");
    }

    @Test
    public void testFluentSetter_type() {
        Header result = instance.type(null);
        assertSame(instance, result, "Fluent setter for type should return the same instance");
    }
}
