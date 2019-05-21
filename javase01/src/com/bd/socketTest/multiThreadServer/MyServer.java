package com.bd.socketTest.multiThreadServer;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * @Author: zhangzhuo05
 * @Date: 2019-05-21 12:02
 * @Description: 服务器端程序(加入多线程)
 */
public class MyServer {
    // 定义一个包含所有Socket的ArrayList,并包装成线程安全的
    public static List<Socket> socketList = Collections.synchronizedList(new ArrayList<>());
    public static void main(String[] args) {
        try {
            // 一直等待连接
            ServerSocket ss = new ServerSocket(30000);
            while (true) {
                Socket s = ss.accept();
                socketList.add(s);
                // 每当有客户端连接，启动一个ServerThread为其服务
                new Thread(new ServerThread(s)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
