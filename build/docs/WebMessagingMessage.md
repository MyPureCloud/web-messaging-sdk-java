---
title: WebMessagingMessage
---
## WebMessagingMessage


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The message unique identifier |  [optional] |
| **channel** | <!----><!---->[**WebMessagingChannel**](WebMessagingChannel.html)<!----> | Additional information about the message and its delivery |  [optional] |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | The type of message |  [optional] |
| **text** | <!----><!---->**String**<!----> | The text of the message.  For messages of type Text this is the actual text of the message.  For messages of type Structured this is fallback text, for clients unable to interpret the structured content. |  [optional] |
| **content** | <!----><!---->[**List&lt;WebMessagingContent&gt;**](WebMessagingContent.html)<!----> | Optional, additional message content |  [optional] |
| **direction** | [**DirectionEnum**](#DirectionEnum)<!----> | The direction of the message.  Direction is always from the perspective of the Genesys Cloud platform.  An Inbound message is one sent from a guest to the Genesys Cloud Platform.  An Outbound message is one sent from the Genesys Cloud Platform to a guest. |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| TEXT | &quot;Text&quot; |
| STRUCTURED | &quot;Structured&quot; |
| RECEIPT | &quot;Receipt&quot; |
{: class="table table-striped"}


<a name="DirectionEnum"></a>

## Enum: DirectionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| INBOUND | &quot;Inbound&quot; |
| OUTBOUND | &quot;Outbound&quot; |
{: class="table table-striped"}



