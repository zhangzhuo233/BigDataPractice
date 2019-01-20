package com.bd.fileTest;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTest {
    public static void main(String[] args) {
        /**
         * 创建，查看属性，删除文件
         */
        File fs = new File("." + File.separator + "file");
        try {
            fs.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Date date = new Date(fs.lastModified());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println("文件属性:" + fs.getAbsolutePath() + " " + fs.length() + " " + fs.lastModified() + " " + sdf.format(date));
        if (fs.exists()) {
            System.out.println("文件已存在");
            fs.delete();
        } else {
            System.out.println("文件不存在");
        }
    }
}
