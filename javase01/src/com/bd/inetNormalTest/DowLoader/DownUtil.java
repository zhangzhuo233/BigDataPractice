package com.bd.inetNormalTest.DowLoader;

import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @Author: zhangzhuo05
 * @Date: 2019-05-14 15:25
 * @Description: 下载器的工具库
 */
public class DownUtil {
    // 资源的源路径
    private String path;
    // 资源的目的（保存）路径
    private String targetFile;
    // 下载该资源的线程数
    private int threadNum;
    // 下载的线程对象
    private DownThread[] threads;
    // 定义下载的文件的总大小
    private int fileSize;

    public DownUtil(String path, String targetFile, int threadNum) {
        this.path = path;
        this.targetFile = targetFile;
        this.threadNum = threadNum;
        // 初始化threads数组
        threads = new DownThread[threadNum];
    }

    public void download() {
        try {
            URL url = new URL(path);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setConnectTimeout(5 * 1000);
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Charset", "UTF-8");
            conn.setRequestProperty("Connection", "Keep-Alive");
            // 得到文件大小
            fileSize = conn.getContentLength();
            conn.disconnect();
            // why do +1?
            // 每个线程是在+1的位置开始下载
            int currentPartSize = fileSize / threadNum + 1;
            RandomAccessFile file = new RandomAccessFile(targetFile, "rw");
            // 设置本地文件大小
            file.setLength(fileSize);
            file.close();
            for (int i = 0; i < threadNum; i++) {
                // 计算每个线程下载的开始位置
                int startPos = i * currentPartSize;
                // 每个线程使用一个RandomAccessFile进行下载
                RandomAccessFile currentPart = new RandomAccessFile(targetFile,
                        "rw");
                // 定义该线程的下载位置
                currentPart.seek(startPos);
                // 创建下载线程
                threads[i] = new DownThread(startPos, currentPartSize, currentPart);
                threads[i].start();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // 获取下载的完成百分比
    public double getCompleteRate() {
        // 统计多个线程已经下载的总大小
        int sumSize = 0;
        for (int i = 0; i < threadNum; i++) {
            sumSize += threads[i].length;
        }
        return sumSize * 1.0 / fileSize;
    }

    private class DownThread extends Thread {
        // 当前线程的下载位置
        private int startPos;
        // 当前线程负责下载的文件大小
        private int currentPartSize;
        // 当前线程需要下载的文件块
        private RandomAccessFile currentPart;
        // 已下载的字节数
        public int length;

        public DownThread(int startPos, int currentPartSize,
                          RandomAccessFile currentPart) {
            this.startPos = startPos;
            this.currentPartSize = currentPartSize;
            this.currentPart = currentPart;
        }

        @Override
        public void run() {
            try {
                URL url = new URL(path);
                HttpURLConnection conn = (HttpURLConnection) url
                        .openConnection();
                conn.setConnectTimeout(5 * 1000);
                conn.setRequestMethod("GET");
                // conn.setRequestProperty("Accept",);
                conn.setRequestProperty("Charset", "UTF-8");
                InputStream inStream = conn.getInputStream();
                // 跳过startPos个字节，表明该线程只下载自己负责的那部分文件
                inStream.skip(this.startPos);

                byte[] buffer = new byte[1024];
                int hasRead = 0;

                // 读取网络数据，并写入本地
                while (length < currentPartSize
                        && (hasRead = inStream.read(buffer)) != -1) {
                    currentPart.write(buffer, 0, hasRead);
                    // 累计该线程下载的总大小
                    length += hasRead;
                }
                currentPart.close();
                inStream.close();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
