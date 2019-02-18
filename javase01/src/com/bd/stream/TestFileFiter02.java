package com.bd.stream;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

public class TestFileFiter02 {
    public static void main(String[] args) throws IOException {
        // 建立多个以.java结尾的文件
        for (int i = 0; i < 10; i++) {
            File fs = new File("." + File.separator + 'a' + File.separator + i + ".java");
            fs.createNewFile();
        }
        // 调用匿名内部类对文件进行筛选
        // 展示筛选后的文件名称
        File direc = new File("." + File.separator + 'a');
        File[] files = direc.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.toString().endsWith(".java");
            }
        });
        for (File file:
             files) {
            System.out.println(file.getName());
        }
    }
}
