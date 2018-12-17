package com.bd.TestException;

public class TestException {
    public static void main(String[] args) {
        try {
            int num = 0;
            return;

        } catch (ArithmeticException ex) {
            System.out.println("ArithmeticException error");
            ex.printStackTrace();
        } catch (Exception ex) {
            System.out.println("Exception err");
        }finally {
            System.out.println("exit");
        }
    }
}
