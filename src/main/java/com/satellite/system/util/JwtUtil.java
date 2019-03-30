package com.satellite.system.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.interfaces.DecodedJWT;
import java.util.Date;

/**
 * @Author:yuanhu
 * @Description:
 * @Date: Created in 10:45 2019/3/30
 * @Modified By:
 */
public class JwtUtil {

    private static final String encodeSecretKey = "XX#$%()(#*!()!KL<><MQLMNQNQJQKsdfkjsdrow32234545fdf>?N<:{LWPW";

    /**
     * token过期时间
     */
    private static final long EXPIRE_TIME = 1000 * 60 * 60 * 24 * 7;

    /**
     * 生成token
     * @return
     */
    public static String createToken(String account) {
        try {
            Date date = new Date(System.currentTimeMillis() + EXPIRE_TIME);
            Algorithm algorithm = Algorithm.HMAC256(account + encodeSecretKey);
            return JWT.create()
                    .withExpiresAt(date)
                    .withClaim("account", account)
                    .sign(algorithm);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 校验token是否失效
     * @param token
     * @return
     */
    public static boolean checkToken(String token, String account) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(account + encodeSecretKey);
            JWTVerifier verifier = JWT.require(algorithm)
                    .build();
            DecodedJWT jwt = verifier.verify(token);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * 获取用户account
     * @param token
     * @return
     */
    public static String getAccount(String token){
        try {
            DecodedJWT jwt = JWT.decode(token);
            return jwt.getClaim("account").asString();
        } catch (JWTDecodeException e) {
            return null;
        }
    }

}
