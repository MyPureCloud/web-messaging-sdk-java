package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for ContentLineItem model.
 */
public class ContentLineItemTest {

    private ContentLineItem instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new ContentLineItem();
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
        ContentLineItem a = new ContentLineItem();
        ContentLineItem b = new ContentLineItem();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        ContentLineItem a = new ContentLineItem();
        ContentLineItem b = new ContentLineItem();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class ContentLineItem"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        ContentLineItem deserialized = objectMapper.readValue(json, ContentLineItem.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_description() {
        ContentLineItem result = instance.description(null);
        assertSame(instance, result, "Fluent setter for description should return the same instance");
    }

    @Test
    public void testFluentSetter_identifier() {
        ContentLineItem result = instance.identifier(null);
        assertSame(instance, result, "Fluent setter for identifier should return the same instance");
    }

    @Test
    public void testFluentSetter_name() {
        ContentLineItem result = instance.name(null);
        assertSame(instance, result, "Fluent setter for name should return the same instance");
    }

    @Test
    public void testFluentSetter_price() {
        ContentLineItem result = instance.price(null);
        assertSame(instance, result, "Fluent setter for price should return the same instance");
    }
}
