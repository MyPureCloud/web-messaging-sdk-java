Platform API version: 10112


## Release Notes

* Changed some public WebMessagingClient methods (e.g. configureSession, sendMessage, ping, attachment, etc.) from void return type to CompletableFuture<WebSocket>, propagating the result of webSocket.sendText() back to callers.
* Replaced all // no-op catch blocks with SLF4J error logging and CompletableFuture.failedFuture(e) returns, so serialization failures are no longer silently swallowed.


# Major Changes (0 changes)


# Minor Changes (0 changes)


# Point Changes (0 changes)
