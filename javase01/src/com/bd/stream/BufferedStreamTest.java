package com.bd.stream;

import java.io.*;

public class BufferedStreamTest {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            fis = new FileInputStream("./a/10.json");
            fos = new FileOutputStream("./a/10bak.json");
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);
            byte[] buf = new byte[1024];
            int len = 0;
            while (((len = bis.read(buf)) != -1)) {
                bos.write(buf, 0, len);
                System.out.println(len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bis != null) bis.close();
            if (bos != null) bos.close();
        }
    }
}
