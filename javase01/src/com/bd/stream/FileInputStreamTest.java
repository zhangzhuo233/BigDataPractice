package com.bd.stream;

import java.io.*;

public class FileInputStreamTest {
    public static void main(String[] args) {
        File fs = new File("./a/10.json");
        System.out.println(fs.getAbsolutePath());
        try {
            FileInputStream fis = new FileInputStream(fs);
            FileDescriptor fd = fis.getFD();
            System.out.println(fd);
            // 1.读取单个字符
            // System.out.write(fis.read());
            // System.out.write('\n');
            // 2.读取整个文件
            int b = 0;
            while ((b = fis.read()) > 0) {
                System.out.write(b);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}