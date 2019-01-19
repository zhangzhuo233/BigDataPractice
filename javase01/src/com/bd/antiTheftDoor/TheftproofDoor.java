package com.bd.antiTheftDoor;

public class TheftproofDoor extends Door implements Lock{
    @Override
    public void open() {
        System.out.println("open door");
    }

    @Override
    public void close() {
        System.out.println("close door");
    }

    @Override
    public void lockUp() {
        System.out.println("lock the door");
    }

    @Override
    public void openLock() {
        System.out.println("unlock");
    }
}
