package com.bd.stream;

import java.io.*;

public class InputStreamReaderTest {
    public static void main(String[] args) {
        // 转换流解决中文乱码问题
        InputStreamReader isr = null;
        try {
            isr = new InputStreamReader(new FileInputStream("./a/10.json"), "UTF-8");
            char[] cbuf = new char[1];
            // System.out.println(isr.getEncoding());
            while (isr.read(cbuf) != -1) {
                System.out.print(cbuf);
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                isr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
