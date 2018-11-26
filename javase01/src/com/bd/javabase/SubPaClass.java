package com.bd.javabase;

import com.bd.javatest.SubClass;

public class SubPaClass extends com.bd.javatest.SubClass {
//    private int id;
    SubPaClass(){
//        super();
    }
    SubPaClass(int id){
        super(id);
    }
    public void test(){
        SubClass su = new SubClass();
        super.show();
    }

    public static void main(String[] args) {
        SubPaClass sup = new SubPaClass();
        sup.show();

        SubClass su = new SubClass();

    }
}
