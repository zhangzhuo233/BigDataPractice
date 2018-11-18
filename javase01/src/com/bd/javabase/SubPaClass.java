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

    public static void main(String[] args) {
        SubPaClass sup = new SubPaClass();
        sup.show();
    }
}
