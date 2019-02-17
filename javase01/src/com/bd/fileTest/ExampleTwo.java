package com.bd.fileTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExampleTwo {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("./a/10.json");
            FileOutputStream fos = new FileOutputStream("./a/10bak.json");
            byte words[] = new byte[1024];
            while(fis.read(words) != -1) {
                fos.write(words, 0, words.length);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
