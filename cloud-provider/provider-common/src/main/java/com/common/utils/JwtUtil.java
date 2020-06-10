//package com.common.utils;
//
//import com.auth0.jwt.JWT;
//import com.auth0.jwt.algorithms.Algorithm;
//import com.common.pojo.UserInfo;
//
//import java.util.Date;
//
//public class JwtUtil {
//    /**
//     * 生成token
//     *
//     * @param user
//     * @return
//     */
//    public static String getToken(UserInfo user) {
//        String token = JWT.create()
//                .withAudience(user.getId().toString())
//                .withExpiresAt(new Date(System.currentTimeMillis() + 24 * 3600 * 1000 * 10))
//                .sign(Algorithm.HMAC256(user.getPwd()));
//        return token;
//    }
//}