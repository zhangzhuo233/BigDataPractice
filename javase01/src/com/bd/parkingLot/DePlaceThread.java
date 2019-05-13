package com.bd.parkingLot;

/**
 * @Author: zhangzhuo05
 * @Date: 2019-05-13 18:59
 * @Description:
 */
public class DePlaceThread extends Thread{
    private Park park;

    public DePlaceThread(Park park) {
        this.park = park;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // park.dePlace(i);
            // 对dePlace做优化
            park.dePlace();
            if (i == 2) {
                i = 0;
            }
        }
    }
}
