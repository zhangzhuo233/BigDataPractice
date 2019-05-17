package com.bd.inetNormalTest.DowLoader;

/**
 * @Author: zhangzhuo05
 * @Date: 2019-05-14 15:21
 * @Description: 一个多线程下载器
 */
public class MutiThreadDown {
    public static void main(String[] args) {
        // System.out.println(Runtime.getRuntime().availableProcessors());
        // System.out.println(System.getProperty("user.dir") + "/tmpdir/");
        // 初始化DownUtil对象
        final DownUtil downUtil = new DownUtil("https://b.bdstatic.com/"
                + "miniapp/development_tool/百度开发者工具-2.2.4.dmg",
                System.getProperty("user.dir") + "/tmpdir/" + "devtool.dmg",
                Runtime.getRuntime().availableProcessors());
        // 开始下载
        downUtil.download();
        new Thread(() -> {
            while (downUtil.getCompleteRate() < 1) {
                // 每间隔1秒查询一次任务的完成进度
                // GUI中可根据此绘制进度条
                System.out.println("已完成: "
                        + downUtil.getCompleteRate());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
