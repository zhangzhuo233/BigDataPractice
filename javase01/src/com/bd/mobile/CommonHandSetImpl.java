package com.bd.mobile;

public class CommonHandSetImpl extends Handset implements PlayWiring {

    @Override
    public void play(String inContent) {
        System.out.println("开始播放音乐《" + inContent + "》");
    }
}
