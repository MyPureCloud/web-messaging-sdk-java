package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for GetJwtRequest model.
 */
public class GetJwtRequestTest {

    private GetJwtRequest instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new GetJwtRequest();
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
        GetJwtRequest a = new GetJwtRequest();
        GetJwtRequest b = new GetJwtRequest();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        GetJwtRequest a = new GetJwtRequest();
        GetJwtRequest b = new GetJwtRequest();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class GetJwtRequest"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        GetJwtRequest deserialized = objectMapper.readValue(json, GetJwtRequest.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_action() {
        GetJwtRequest result = instance.action(null);
        assertSame(instance, result, "Fluent setter for action should return the same instance");
    }

    @Test
    public void testFluentSetter_token() {
        GetJwtRequest result = instance.token(null);
        assertSame(instance, result, "Fluent setter for token should return the same instance");
    }

    @Test
    public void testFluentSetter_tracingId() {
        GetJwtRequest result = instance.tracingId(null);
        assertSame(instance, result, "Fluent setter for tracingId should return the same instance");
    }
}
