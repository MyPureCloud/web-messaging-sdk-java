---
title: WebMessagingAttachment
---
## WebMessagingAttachment


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **mediaType** | [**MediaTypeEnum**](#MediaTypeEnum)<!----> | The type of media represented by the file |  [optional] |
| **url** | <!----><!---->**String**<!----> | The url of the file |  [optional] |
| **mime** | <!----><!---->**String**<!----> | The mime type, also known as the IANA media type, of the file.  E.g. image/jpeg.  See https://www.iana.org/assignments/media-types/media-types.xhtml |  [optional] |
| **text** | <!----><!---->**String**<!----> | Optional text about the file |  [optional] |
| **sha256** | <!----><!---->**String**<!----> | A 256 bit secure hash of the file |  [optional] |
| **filename** | <!----><!---->**String**<!----> | The file name associated with the file |  [optional] |
| **fileSize** | <!----><!---->**Integer**<!----> | The file size associated with the file |  [optional] |
{: class="table table-striped"}


<a name="MediaTypeEnum"></a>

## Enum: MediaTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| IMAGE | &quot;Image&quot; |
| VIDEO | &quot;Video&quot; |
| AUDIO | &quot;Audio&quot; |
| FILE | &quot;File&quot; |
{: class="table table-striped"}



