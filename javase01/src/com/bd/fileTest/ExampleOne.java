package com.bd.fileTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExampleOne {
    public static void main(String[] args) throws IOException {
        // 1.创建FileInputStream对象
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("./a/10.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        // 2.定义字节数组接收读取的数据
        byte[] buf = new byte[1024];
        // 3.定义len接收每次读取长度
        int len = 0;
        // 4.循环读取
        while ((len = fis.read(buf)) > 0) {
            // 5.打印到控制台
            System.out.write(buf, 0, len);
        }
        if (fis != null) {
            fis.close();
        }
    }
}