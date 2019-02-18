package com.bd.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
    public static void main(String[] args) {
        // 1.定义输入流
        FileInputStream fis = null;
        // 2.定义输出流
        FileOutputStream fos = null;
        int len = 0;
        byte[] buf = new byte[1024];
        // 3.读取文件A
        // 4.写入文件B
        try {
            fis = new FileInputStream("./a/10.json");
            fos = new FileOutputStream("./a/10bak.json");
            while ((len = fis.read(buf)) > 0) {
                fos.write(buf);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 5.关闭文件
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
