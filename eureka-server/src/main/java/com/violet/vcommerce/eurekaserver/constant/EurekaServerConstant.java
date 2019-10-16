package com.violet.vcommerce.eurekaserver.constant;

public final class EurekaServerConstant {
    public static final String PROFILE_DEVELOPMENT = "dev";
    public static final String PROFILE_TEST = "test";
    public static final String PROFILE_PRODUCTION = "prod";

    // Regex for acceptable logins
    public static final String LOGIN_REGEX = "^[_.@A-Za-z0-9-]*$";

    public static final String SYSTEM_ACCOUNT = "system";
    public static final String DEFAULT_LANGUAGE = "en";
    public static final String ANONYMOUS_USER = "anonymoususer";

    private EurekaServerConstant() {
    }

}
