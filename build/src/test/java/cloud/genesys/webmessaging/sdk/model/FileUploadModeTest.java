package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for FileUploadMode model.
 */
public class FileUploadModeTest {

    private FileUploadMode instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new FileUploadMode();
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
        FileUploadMode a = new FileUploadMode();
        FileUploadMode b = new FileUploadMode();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        FileUploadMode a = new FileUploadMode();
        FileUploadMode b = new FileUploadMode();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class FileUploadMode"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        FileUploadMode deserialized = objectMapper.readValue(json, FileUploadMode.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_fileTypes() {
        FileUploadMode result = instance.fileTypes(null);
        assertSame(instance, result, "Fluent setter for fileTypes should return the same instance");
    }

    @Test
    public void testFluentSetter_maxFileSizeKB() {
        FileUploadMode result = instance.maxFileSizeKB(null);
        assertSame(instance, result, "Fluent setter for maxFileSizeKB should return the same instance");
    }
}
