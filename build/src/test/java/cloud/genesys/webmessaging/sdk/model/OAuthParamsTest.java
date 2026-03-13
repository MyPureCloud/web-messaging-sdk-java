package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for OAuthParams model.
 */
public class OAuthParamsTest {

    private OAuthParams instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new OAuthParams();
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
        OAuthParams a = new OAuthParams();
        OAuthParams b = new OAuthParams();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        OAuthParams a = new OAuthParams();
        OAuthParams b = new OAuthParams();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class OAuthParams"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        OAuthParams deserialized = objectMapper.readValue(json, OAuthParams.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_code() {
        OAuthParams result = instance.code(null);
        assertSame(instance, result, "Fluent setter for code should return the same instance");
    }
}
