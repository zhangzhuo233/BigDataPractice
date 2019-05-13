package com.bd.parkingLot;

import javax.naming.InitialContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author: zhangzhuo05
 * @Date: 2019-05-13 16:36
 * @Description: 停车服务，包括是否还有车位，入库，出库
 */
public class Park {
    private List<Boolean> parkPlaces;

    public Park(List<Boolean> parkPlaces, int capacity) {
        this.parkPlaces = Collections.synchronizedList(parkPlaces);
        InitialParkPalces(this.parkPlaces, capacity);
        System.out.println("park已构造...,车位数为" + this.parkPlaces.size());
    }
    public void InitialParkPalces(List<Boolean> list, int capacity) {
        for (int i = 0; i < capacity; i++) {
            parkPlaces.add(i, false);
        }
        System.out.println("park已初始化...");
    }
    // 获取可停车位置,车位已满返回-1
    public int getPlace() {
        System.out.println("park数为:" + parkPlaces.size());
        for (int i = 0; i < parkPlaces.size(); i++) {
            if (parkPlaces.get(i) == false) {
                return i;
            }
        }
        return -1;
    }
    public boolean enPlace() {
        int place = getPlace();
        if (place != -1) {
            parkPlaces.set(place, true);
            System.out.println("入库成功，位置：" + place);
            return true;
        }
        System.out.println("入库失败，车位已满");
        return false;
    }
    // 指定位置出库
    public boolean dePlace(int place) {
        if (parkPlaces.set(place, false)) {
            System.out.println("出库成功，出库位置：" + place);
            return true;
        }
        System.out.println("出库失败，库内无车");
        return false;
    }
    // 当车位满了之后再出库
    public boolean dePlace() {
        // 还有空车位不出库
        if (getPlace() != -1) {
            System.out.println("车位不满，不用出库");
            return false;
        }
        // 车位满了，出最近的车位
        for (int i = 0; i < parkPlaces.size(); i++) {
            if (parkPlaces.get(i) == true) {
                parkPlaces.set(i, false);
                System.out.println(i + "车位已被出库");
            }
        }
        return true;
    }
}
