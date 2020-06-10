package com.user.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.user.model.UserInfo;

import java.util.Date;

public class TokenUtil {
    private static final String SECRET_KEY = "123456789";

    /**
     * 生成token
     *
     * @param user
     * @return
     */
    public static String getToken(UserInfo user) {
        String token = "";
        token = JWT.create()
                .withAudience(user.getId().toString())
                .withExpiresAt(new Date(System.currentTimeMillis() + 24 * 3600 * 1000 * 10))
                .sign(Algorithm.HMAC256(SECRET_KEY));
        return token;
    }
}