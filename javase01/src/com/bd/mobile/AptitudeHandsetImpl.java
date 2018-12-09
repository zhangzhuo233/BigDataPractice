package com.bd.mobile;

public class AptitudeHandsetImpl extends Handset implements TheakePictures, Network, PlayWiring {
    @Override
    public void networkConn() {
        System.out.println("已经启动移动网络");
    }

    @Override
    public void takePicture() {
        System.out.println("咔嚓...拍照成功");
    }

    @Override
    public void play(String inContent) {
        System.out.println("开始播放视频《" + inContent + "》");
    }

    @Override
    public void sendInfo() {
        System.out.println("发送带图片和文字的信息");
    }

    @Override
    public void call() {
        System.out.println("开始视频通话");
    }
}
