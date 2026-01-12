# ContentPush


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **deviceToken** | **String** | device token from the notification provider |  |
| **deviceTokenId** | **String** | Unique Id of the device token |  |
| **deviceType** | [**DeviceType**](DeviceType) | The device type used to send the push notification |  |
| **expiration** | **Double** | The time to live of the pushed message |  |
| **failedMessages** | [**List&lt;PushFailedMessageReferences&gt;**](PushFailedMessageReferences) | MessageIds failed to be sent which trigger the push event |  |
| **notificationMessage** | [**NotificationMessage**](NotificationMessage) | Title and body localized according to deployment |  |
| **pushProviderIntegration** | [**PushProviderIntegration**](PushProviderIntegration) | push provider integrations details configured on the deployment |  |




_cloud.genesys.webmessaging.sdk:web-messaging-sdk:16.0.0_
