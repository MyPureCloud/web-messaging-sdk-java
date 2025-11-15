# ContentForm


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **cannedResponseId** | **String** | The id of the canned response which was used to create the form. |  |
| **formPages** | [**List&lt;FormPage&gt;**](FormPage) | Form pages |  [optional] |
| **introduction** | [**ContentIntroduction**](ContentIntroduction) | The introduction component, used to give an intro into what the form entails |  [optional] |
| **originatingMessageId** | **String** | Reference to the ID of the original message. |  [optional] |
| **receivedMessage** | [**ContentReceivedReplyMessage**](ContentReceivedReplyMessage) | The message prompt to fill out the form received. |  [optional] |
| **replyMessage** | [**ContentReceivedReplyMessage**](ContentReceivedReplyMessage) | The reply message after the user has filled out the form received. |  [optional] |
| **response** | [**List&lt;FormResponseComponent&gt;**](FormResponseComponent) | Content of the payload included in the Form response. |  [optional] |
| **showSummary** | **Boolean** | Show summary at end of form submission. |  [optional] |




_cloud.genesys.webmessaging.sdk:web-messaging-sdk:15.2.0_
