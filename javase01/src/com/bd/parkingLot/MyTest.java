package com.bd.parkingLot;

import java.util.ArrayList;

/**
 * @Author: zhangzhuo05
 * @Date: 2019-05-13 17:01
 * @Description: 车库测试程序
 */
public class MyTest {
    public static void main(String[] args) {
        Park park = new Park(new ArrayList<>(), 3);
        new EnPlaceThread(park).start();
        new DePlaceThread(park).start();
    }
}
