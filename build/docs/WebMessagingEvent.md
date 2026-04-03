# WebMessagingEvent


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **eventType** | [**EventTypeEnum**](#Enum--EventTypeEnum) | Type of this event element |  |
| **coBrowse** | [**WebMessagingEventCoBrowse**](WebMessagingEventCoBrowse) | Cobrowse event. |  [optional] |
| **presence** | [**WebMessagingEventPresence**](WebMessagingEventPresence) | Presence event. |  [optional] |
| **video** | [**WebMessagingEventVideo**](WebMessagingEventVideo) | Video event. |  [optional] |


## Enum: EventTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| COBROWSE | &quot;CoBrowse&quot; | 
| PRESENCE | &quot;Presence&quot; | 
| VIDEO | &quot;Video&quot; | 




_cloud.genesys.webmessaging.sdk:web-messaging-sdk:18.1.0_
