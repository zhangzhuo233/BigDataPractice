package com.bd.socketTest.multiThreadServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

/**
 * @Author: zhangzhuo05
 * @Date: 2019-05-21 12:11
 * @Description: 处理客户端的请求
 */
public class ServerThread  implements Runnable{
    // 定义当前线程所处理的Socket
    private Socket s = null;
    private BufferedReader br = null;

    public ServerThread(Socket s) {
        this.s = s;
        try {
            // 初始化该Socket对应的输入流
            br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // 定义读取客户端数据的方法
    private String readFromClient() {
        try {
            return br.readLine();
        }
        // 捕获到异常，客户端出现问题，将对应Socket删除
        catch (IOException e) {
            // e.printStackTrace();
            // 删除该Socket
            MyServer.socketList.remove(s);
        }
        return null;
    }
    @Override
    public void run() {
        // Todo: 发出消息的客户端不再重复自己所发送的消息
        String content = null;
        // 采用循环不断地从Socket中读取客户端发送过来的数据
        while ((content = readFromClient()) != null) {
            // 遍历Socket中的每个Socket
            // 将读到的内容向每个Socket发送一次
            for (Socket s : MyServer.socketList) {
                try {
                    PrintStream ps = new PrintStream(s.getOutputStream());
                    ps.println(content);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
