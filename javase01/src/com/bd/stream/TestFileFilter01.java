package com.bd.stream;


import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

/**
 * 使用内部类做文件过滤
 */
public class TestFileFilter01 {
    public static void main(String[] args) throws IOException {
        // 建立多个以.java结尾的文件
        for (int i = 0; i < 10; i++) {
            File fs = new File("." + File.separator + 'a' + File.separator + i + ".java");
            fs.createNewFile();
        }
        // 调用内部类对文件进行筛选(内部类不能再static方法中使用，所以另外定义show方法)
        // 展示筛选后的文件名称
        new TestFileFilter01().showFileName(new File("." + File.separator + "a"));
    }
    void showFileName(File fs) {
        File[] files = fs.listFiles(new Filter());
        for (File file:
             files) {
            System.out.println(file.getName());
        }
    }
    class Filter implements FileFilter {
        @Override
        public boolean accept(File pathname) {
            return pathname.toString().endsWith(".java");
        }
    }
}
