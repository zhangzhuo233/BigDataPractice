package com.bd.stream;

import java.io.*;

public class BufferedReaderTest {
    public static void main(String[] args) {
        // System.out.println(System.getProperty("file.encoding"));
        BufferedReader br = null;
        BufferedWriter bw = null;
        char[] cbuf = new char[1024];
        try {
            br = new BufferedReader(new FileReader("./a/10.json"));
            bw = new BufferedWriter(new FileWriter("./a/10bak.json"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            // System.out.println(br.readLine());
            while(br.read(cbuf) != -1) {
                bw.write(cbuf);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}