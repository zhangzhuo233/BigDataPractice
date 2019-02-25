package com.bd.stream;

import java.io.*;

public class DataStreamTest {
    public static void main(String[] args) {
        DataInputStream dis = null;
        DataOutputStream dos = null;
        try {
            File srcFile = new File("./a/BinarySrcFile");
            File desFile = new File("./a/BinaryDesFile");
            byte[] buf = new byte[1];
            int len = 0;
            if (!srcFile.exists()) {
                srcFile.createNewFile();
            }
            if (!desFile.exists()) {
                desFile.createNewFile();
            }
            dis = new DataInputStream(new FileInputStream(srcFile));
            dos = new DataOutputStream(new FileOutputStream(desFile));
            while ((len = dis.read(buf)) > 0) {
                dos.write(buf, 0, len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != dis)
                    dis.close();
                if (null != dos)
                    dos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
