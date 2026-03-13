package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for BaseChannelMetadata model.
 */
public class BaseChannelMetadataTest {

    private BaseChannelMetadata instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new BaseChannelMetadata();
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
        BaseChannelMetadata a = new BaseChannelMetadata();
        BaseChannelMetadata b = new BaseChannelMetadata();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        BaseChannelMetadata a = new BaseChannelMetadata();
        BaseChannelMetadata b = new BaseChannelMetadata();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class BaseChannelMetadata"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        BaseChannelMetadata deserialized = objectMapper.readValue(json, BaseChannelMetadata.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_customAttributes() {
        BaseChannelMetadata result = instance.customAttributes(null);
        assertSame(instance, result, "Fluent setter for customAttributes should return the same instance");
    }
}
