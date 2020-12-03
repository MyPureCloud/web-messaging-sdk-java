package cloud.genesys.webmessaging.sdk;

import java.util.Collections;
import java.util.Map;

public class WebMessagingException extends Exception {
    private final int statusCode;
    private final Map<String, String> headers;
    private final String body;

    public WebMessagingException(int statusCode, String message, Map<String, String> headers, String body) {
        super(message);
        this.statusCode = statusCode;
        this.headers = Collections.unmodifiableMap(headers);
        this.body = body;
    }

    public WebMessagingException(Throwable cause) {
        super(cause);
        this.statusCode = -1;
        this.headers = Collections.emptyMap();
        this.body = null;
    }
}
