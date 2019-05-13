package com.bd.parkingLot;

/**
 * @Author: zhangzhuo05
 * @Date: 2019-05-13 17:09
 * @Description:
 */
public class EnPlaceThread extends Thread{
    private Park park;

    public EnPlaceThread(Park park) {
        this.park = park;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            park.enPlace();
        }
    }
}
