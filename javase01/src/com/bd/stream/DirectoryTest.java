package com.bd.stream;

import java.io.File;

public class DirectoryTest {
    public static void main(String[] args) {
        /**
         * 使用递归遍历目录及文件
         */
        File fs = new File("." + File.separator + "a" + File.separator + "b");
        if (fs.exists()) {
            System.out.println("目录已存在");
        } else {
            System.out.println("正在创建...");
            fs.mkdirs();
            System.out.println("创建成功");
        }
        new DirectoryTest().show(new File("." + File.separator + "a"));
        System.out.println(fs.delete());
    }

    public void show(File file) {
        File[] fs = file.listFiles();
        for (File f : fs) {
            System.out.println(f.getAbsolutePath());
            if (f.isDirectory()) {
                show(f);
            }
        }
    }

}
