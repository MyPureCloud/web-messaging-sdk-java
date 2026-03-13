package cloud.genesys.webmessaging.sdk.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for MessagingRecipient model.
 */
public class MessagingRecipientTest {

    private MessagingRecipient instance;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        instance = new MessagingRecipient();
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
        MessagingRecipient a = new MessagingRecipient();
        MessagingRecipient b = new MessagingRecipient();
        assertEquals(a, b);
    }

    @Test
    public void testHashCodeConsistentWithEquals() {
        MessagingRecipient a = new MessagingRecipient();
        MessagingRecipient b = new MessagingRecipient();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testToStringContainsClassName() {
        String str = instance.toString();
        assertTrue(str.contains("class MessagingRecipient"));
    }

    @Test
    public void testJsonRoundTrip() throws Exception {
        String json = objectMapper.writeValueAsString(instance);
        MessagingRecipient deserialized = objectMapper.readValue(json, MessagingRecipient.class);
        assertEquals(instance, deserialized);
    }

    @Test
    public void testFluentSetter_additionalIds() {
        MessagingRecipient result = instance.additionalIds(null);
        assertSame(instance, result, "Fluent setter for additionalIds should return the same instance");
    }

    @Test
    public void testFluentSetter_email() {
        MessagingRecipient result = instance.email(null);
        assertSame(instance, result, "Fluent setter for email should return the same instance");
    }

    @Test
    public void testFluentSetter_externalContactDivisionId() {
        MessagingRecipient result = instance.externalContactDivisionId(null);
        assertSame(instance, result, "Fluent setter for externalContactDivisionId should return the same instance");
    }

    @Test
    public void testFluentSetter_externalContactId() {
        MessagingRecipient result = instance.externalContactId(null);
        assertSame(instance, result, "Fluent setter for externalContactId should return the same instance");
    }

    @Test
    public void testFluentSetter_externalOrganizationId() {
        MessagingRecipient result = instance.externalOrganizationId(null);
        assertSame(instance, result, "Fluent setter for externalOrganizationId should return the same instance");
    }

    @Test
    public void testFluentSetter_firstName() {
        MessagingRecipient result = instance.firstName(null);
        assertSame(instance, result, "Fluent setter for firstName should return the same instance");
    }

    @Test
    public void testFluentSetter_id() {
        MessagingRecipient result = instance.id(null);
        assertSame(instance, result, "Fluent setter for id should return the same instance");
    }

    @Test
    public void testFluentSetter_idType() {
        MessagingRecipient result = instance.idType(null);
        assertSame(instance, result, "Fluent setter for idType should return the same instance");
    }

    @Test
    public void testFluentSetter_image() {
        MessagingRecipient result = instance.image(null);
        assertSame(instance, result, "Fluent setter for image should return the same instance");
    }

    @Test
    public void testFluentSetter_lastName() {
        MessagingRecipient result = instance.lastName(null);
        assertSame(instance, result, "Fluent setter for lastName should return the same instance");
    }

    @Test
    public void testFluentSetter_nickname() {
        MessagingRecipient result = instance.nickname(null);
        assertSame(instance, result, "Fluent setter for nickname should return the same instance");
    }
}
