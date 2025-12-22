# ContentPaymentRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **countryCode** | **String** | The merchant's two-letter ISO 3166 country code. |  |
| **currencyCode** | **String** | The three-letter ISO 4217 currency code for the payment. |  |
| **lineItems** | [**List&lt;ContentLineItem&gt;**](ContentLineItem) | The items that make up the order. |  [optional] |
| **orderTotal** | **Double** | The total price of the order. |  |
| **paymentPlatform** | [**PaymentPlatform**](PaymentPlatform) | The payment platform being used (e.g. Apple Pay) |  |
| **receivedMessage** | [**ContentReceivedReplyMessage**](ContentReceivedReplyMessage) | The message prompt to complete a payment transaction. |  [optional] |
| **replyMessage** | [**ContentReceivedReplyMessage**](ContentReceivedReplyMessage) | The reply message after the user has completed the payment transaction. |  [optional] |
| **requiredContactFields** | [**List&lt;ContentRequiredContactField&gt;**](ContentRequiredContactField) | Contact fields required to complete the order. |  [optional] |
| **shippingOptions** | [**List&lt;ContentLineItem&gt;**](ContentLineItem) | The available shipping options. |  [optional] |




_cloud.genesys.webmessaging.sdk:web-messaging-sdk:15.3.0_
