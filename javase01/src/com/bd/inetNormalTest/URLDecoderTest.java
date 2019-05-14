package com.bd.inetNormalTest;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * @Author: zhangzhuo05
 * @Date: 2019-05-14 12:22
 * @Description: 使用URLDecoder & URLEncoder
 */
public class URLDecoderTest {
    public static void main(String[] args) {
        // 将普通字符串转换成application/x-www-form-urlencoded 字符串
        String enodeStr = null;
        String keyword = null;
        try {
            enodeStr = URLEncoder.encode("疯狂的孩子", "UTF-8");
            // 将application/x-www-form-urlencoded 字符串
            // 转换成普通字符串
            keyword = URLDecoder.decode(enodeStr, "UTF-8");

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println("encode Str, normal Str: " + enodeStr + " " + keyword);
    }
}
