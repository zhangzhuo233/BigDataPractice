package com.bd.socketTest;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author: zhangzhuo05
 * @Date: 2019-05-20 21:10
 * @Description: 服务器端程序
 */
public class Server {
    public static void main(String[] args) {
        try {
            // 创建一个ServerSocket,用于监听客户端Socket的连接请求
            ServerSocket ss = new ServerSocket(30000);
            // 采用循环不断的接收来自客户端的请求
            while (true) {
                // 每当接收到客户端Socket的请求时，服务器端也对应产生一个Socket
                Socket s = ss.accept();
                // 将Socket对应的输出流包装成PrintStream
                PrintStream ps = new PrintStream(s.getOutputStream());
                // 进行普通IO操作
                ps.println("hello, this is a server");
                // 关闭输出流，关闭Socket
                ps.close();
                s.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
