# ContentNotificationResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **notificationStatus** | [**NotificationStatus**](NotificationStatus) | The status of the notification response. |  |
| **notificationText** | **String** | The localized display text of the user's response (e.g. \"Yes\"). |  [optional] |
| **originatingMessageId** | **String** | Reference to the ID of the original outbound notification message this response is for (e.g. the Apple requestIdentifier). |  |
| **referenceId** | **String** | The business context reference associated with the notification (e.g. order ID, case ID). May be empty if the provider does not return it. |  [optional] |




_cloud.genesys.webmessaging.sdk:web-messaging-sdk:19.2.0_
