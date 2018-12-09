package com.bd.mobile;

public class TestMobile {
    public static void main(String[] args) {
        Handset oldMobile = new CommonHandSetImpl();
        oldMobile.setBrand("G502c");
        oldMobile.setType("索尼爱立信");
        Handset smartMobile = new AptitudeHandsetImpl();
        smartMobile.setBrand("HTC");
        smartMobile.setType("I9100");
        oldMobile.info();
        ((CommonHandSetImpl) oldMobile).play("起风了");
        oldMobile.sendInfo();
        oldMobile.call();
        System.out.println();
        smartMobile.info();
        ((AptitudeHandsetImpl) smartMobile).networkConn();
        ((AptitudeHandsetImpl) smartMobile).play("80000");
        ((AptitudeHandsetImpl) smartMobile).takePicture();
        smartMobile.sendInfo();
        smartMobile.call();
    }
}
