package com.bd.socketTest.multiThreadServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * @Author: zhangzhuo05
 * @Date: 2019-05-21 15:25
 * @Description: 处理server端请求
 */
public class ClientThread implements Runnable{
    private Socket s;
    private BufferedReader br;

    public ClientThread(Socket s) {
        this.s = s;
        try {
            br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        try {
            String content = null;
            while ((content = br.readLine()) != null) {
                System.out.println(content);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
