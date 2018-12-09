package com.bd.AntiTheftDoor;

public class TestMain {
    public static void main(String[] args) {
       Door dr = new TheftproofDoor();
       dr.open();
       ((TheftproofDoor) dr).lockUp();
       ((TheftproofDoor) dr).openLock();
       dr.open();
    }
}
