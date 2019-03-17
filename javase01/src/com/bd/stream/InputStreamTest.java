package com.bd.stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        while ((str = br.readLine()) != null) {
            if ("quit".equals(str)) {
                System.out.println("bye");
                break;
            }
            System.out.println(str);
        }
    }
}
