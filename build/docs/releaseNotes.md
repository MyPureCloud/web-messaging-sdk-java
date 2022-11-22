Platform API version: 6333


# Major Changes (6 changes)

**CardAction** (1 change)

* Model CardAction was removed

**ContentCard** (2 changes)

* Property actions was changed from CardAction[] to array
* Property defaultAction was changed from CardAction to ContentCardAction

**IncomingNormalizedMessage** (1 change)

* Required property channel was added

**SendMessageRequest** (1 change)

* Property attachmentIds was removed

**SessionResponse** (1 change)

* Property sessionId was removed


# Minor Changes (18 changes)

**ConfigureSessionRequest** (2 changes)

* Optional property resumeToken was added
* Optional property startNew was added

**ContentAttachment** (1 change)

* Optional property contentSizeBytes was added

**ContentCardAction** (1 change)

* Model was added

**ContentQuickReplyV2** (1 change)

* Model was added

**ContentText** (1 change)

* Model was added

**MessageContent** (2 changes)

* Optional property quickReplyV2 was added
* Optional property text was added

**BaseMessagingRecipient** (1 change)

* Optional property image was added

**ConfigureAuthenticatedSessionRequest** (2 changes)

* Optional property resumeToken was added
* Optional property startNew was added

**SessionResponse** (1 change)

* Optional property readOnly was added

**ResumeTokenResponse** (1 change)

* Model was added

**StructuredMessage** (1 change)

* Optional property metadata was added

**CleanMessagingRecipient** (1 change)

* Optional property image was added

**CleanMessageContent** (3 changes)

* Optional property carousel was added
* Optional property text was added
* Optional property quickReplyV2 was added


# Point Changes (0 changes)
