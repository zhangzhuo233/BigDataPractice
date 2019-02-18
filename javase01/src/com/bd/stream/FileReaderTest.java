package com.bd.stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) throws IOException {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader("./a/10.json");
            fw = new FileWriter("./a/10bak.json");
            char[] words = new char[1024];
            int len = 0;
            while ((len = fr.read(words)) > 0) {
                fw.write(words, 0, len);
            }
            fw.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fr != null) fr.close();
            if (fw != null) fw.close();
        }
    }
}
