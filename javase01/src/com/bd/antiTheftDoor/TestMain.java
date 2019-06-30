package com.bd.antiTheftDoor;

public class TestMain {
    public static void main(String[] args) {
       Door dr = new TheftproofDoor();
       dr.open();
       ((TheftproofDoor) dr).lockUp();
       ((TheftproofDoor) dr).openLock();
    }
}
