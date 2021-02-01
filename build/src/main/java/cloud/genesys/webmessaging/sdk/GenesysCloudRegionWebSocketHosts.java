package cloud.genesys.webmessaging.sdk;

public enum GenesysCloudRegionWebSocketHosts {
    us_east_1("wss://webmessaging.mypurecloud.com/v1"),
    eu_west_1("wss://webmessaging.mypurecloud.ie/v1"),
    ap_southeast_2("wss://webmessaging.mypurecloud.com.au/v1"),
    ap_northeast_1("wss://webmessaging.mypurecloud.jp/v1"),
    eu_central_1("wss://webmessaging.mypurecloud.de/v1"),
    us_west_2("wss://webmessaging.usw2.pure.cloud/v1"),
    ca_central_1("wss://webmessaging.cac1.pure.cloud/v1"),
    ap_northeast_2("wss://webmessaging.apne2.pure.cloud/v1"),
    eu_west_2("wss://webmessaging.euw2.pure.cloud/v1");

    private String webSocketHost;
    GenesysCloudRegionWebSocketHosts(String host) {
        this.webSocketHost = host;
    }

    public String getWebSocketHost() {
        return webSocketHost;
    }

    public String asApiHost() {
        return asApiHost(webSocketHost);
    }

    public static String asApiHost(GenesysCloudRegionWebSocketHosts host) {
        return asApiHost(host.getWebSocketHost());
    }

    public static String asApiHost(String host) {
        return host
                .replace("wss://webmessaging.", "https://api.")
                .replace("/v1", "");
    }
}
