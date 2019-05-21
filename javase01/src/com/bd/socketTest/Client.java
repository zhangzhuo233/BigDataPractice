package com.bd.socketTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * @Author: zhangzhuo05
 * @Date: 2019-05-20 21:22
 * @Description: 客户端程序
 */
public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 30000);
            // 将Socket对应的输入流包装成BUfferedRender
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            // 进行普通IO操作
            String line = br.readLine();
            System.out.println("Data from Server: " + line);
            // 关闭输入流，关闭socket
            br.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
