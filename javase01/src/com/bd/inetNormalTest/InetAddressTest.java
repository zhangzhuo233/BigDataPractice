package com.bd.inetNormalTest;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Author: zhangzhuo05
 * @Date: 2019-05-14 11:29
 * @Description: InetAddress类测试
 */
public class InetAddressTest {
    public static void main(String[] args) {
        // 根据hostname获取InetAddress实例
        try {
            InetAddress ip = InetAddress.getByName("www.baidu.com");

            System.out.println("InetAddress, Address: " + ip + " " + ip.getHostName());
            // 判断ip是否可达
            System.out.println("baidu可达:" + ip.isReachable(3000));
            // 获取InetAddress实例的IP字符串
            System.out.println("IP字符串: " + ip.getHostAddress());
            // 根据原始ip获取对应的InetAddress实例
            InetAddress local = InetAddress.getByAddress(new byte[]{127,0,0,1});
            System.out.println("本机可达:" + local.isReachable(3000));
            // 获取该InetAddress实例对应的the fully qualified domain
            System.out.println("fully qualified domain: " + local.getCanonicalHostName());
        } catch (UnknownHostException e) {
            e.printStackTrace();
            System.out.println("UnknownHostException error: " + e);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("ip reachable error: " + e);
        }
    }
}
