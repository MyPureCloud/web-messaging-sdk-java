package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for WebMessagingAttachment model.
 */
public class WebMessagingAttachmentTest {

    private WebMessagingAttachment instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new WebMessagingAttachment();
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
        WebMessagingAttachment a = new WebMessagingAttachment();
        WebMessagingAttachment b = new WebMessagingAttachment();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        WebMessagingAttachment a = new WebMessagingAttachment();
        WebMessagingAttachment b = new WebMessagingAttachment();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class WebMessagingAttachment"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        WebMessagingAttachment deserialized = objectMapper.readValue(json, WebMessagingAttachment.class);
        assertEquals(instance, deserialized);
    }
}
