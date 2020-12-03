package cloud.genesys.webmessaging.sdk.auth;

import cloud.genesys.webmessaging.sdk.Pair;

import java.util.Map;
import java.util.List;

public interface Authentication {
  /** Apply authentication settings to header and query params. */
  void applyToParams(List<Pair> queryParams, Map<String, String> headerParams);
}
