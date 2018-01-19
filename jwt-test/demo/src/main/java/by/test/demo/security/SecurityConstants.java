package by.test.demo.security;

public class SecurityConstants {
    public static final String SECRET = "SecretKeyToGenJWTs";
    public static final long EXPIRATION_TIME = 300; // 5 min
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
    //public static final String SIGN_IN_URL = "/e-pharm/clients/sign";
    public static final String SIGN_UP_URL = "/e-pharm/clients/sign-up";
}
