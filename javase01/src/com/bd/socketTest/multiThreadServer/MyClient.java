package com.bd.socketTest.multiThreadServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

/**
 * @Author: zhangzhuo05
 * @Date: 2019-05-21 14:42
 * @Description: 客户端程序（加入多线程）,运行多个client程序，相当于多人聊天
 */
public class MyClient {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("127.0.0.1", 30000);
            // 从服务器端读取数据
            new Thread(new ClientThread(s)).start();
            // 获取该Socket对应的输出流
            PrintStream ps = new PrintStream(s.getOutputStream());
            String line = null;
            // 不断读取键盘输入
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            while ((line = br.readLine()) != null) {
                // 将用户输入 打入 输出流
                ps.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
