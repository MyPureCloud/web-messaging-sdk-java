package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for DeleteAttachmentRequest model.
 */
public class DeleteAttachmentRequestTest {

    private DeleteAttachmentRequest instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new DeleteAttachmentRequest();
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
        DeleteAttachmentRequest a = new DeleteAttachmentRequest();
        DeleteAttachmentRequest b = new DeleteAttachmentRequest();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        DeleteAttachmentRequest a = new DeleteAttachmentRequest();
        DeleteAttachmentRequest b = new DeleteAttachmentRequest();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class DeleteAttachmentRequest"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        DeleteAttachmentRequest deserialized = objectMapper.readValue(json, DeleteAttachmentRequest.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_action() {
        DeleteAttachmentRequest result = instance.action(null);
        assertSame(instance, result, "Fluent setter for action should return the same instance");
    }

    @Test
    public void testFluentSetter_token() {
        DeleteAttachmentRequest result = instance.token(null);
        assertSame(instance, result, "Fluent setter for token should return the same instance");
    }

    @Test
    public void testFluentSetter_tracingId() {
        DeleteAttachmentRequest result = instance.tracingId(null);
        assertSame(instance, result, "Fluent setter for tracingId should return the same instance");
    }

    @Test
    public void testFluentSetter_attachmentId() {
        DeleteAttachmentRequest result = instance.attachmentId(null);
        assertSame(instance, result, "Fluent setter for attachmentId should return the same instance");
    }
}
