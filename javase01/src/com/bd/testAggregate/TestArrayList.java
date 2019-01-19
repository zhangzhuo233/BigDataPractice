package com.bd.testAggregate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestArrayList {
    public static void main(String[] args) {
//        // 基础应用
//        ArrayList ar = new ArrayList();
//        System.out.println(ar.isEmpty());
//        if(ar != null && ar.size() > 0)
//            System.out.println("false");
//        for (int i = 0; i < 10; i++) {
//            ar.add(i);
//        }
//        for (Object list:
//             ar) {
//            System.out.print(list);
//            System.out.printf(" ");
//        }
//        System.out.println("--------------------");
//        ar.removeAll(ar);
//        for (Object list:
//                ar) {
//            System.out.print(list);
//            System.out.printf(" ");
//        }
        List<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("World");
        list.add("HAHAHAHA");
        // I. 使用foreach遍历List
        for (String str :
                list) {
            System.out.println(str);
        }
        System.out.println("=============");
        // II. 使用for遍历
        for (int i = 0; i < list.size(); ++i) {
            System.out.println(list.get(i));
        }
        System.out.println("=============");
        // III. 把链表变为数组相关的内容进行遍历
        String[] strArray = new String[list.size()];
        list.toArray(strArray);
        for (int i=0; i<strArray.length; ++i) {
            System.out.println(strArray[i]);
        }
        System.out.println("=============");
        // IV. 使用迭代器进行相关遍历(该方法可以不用担心在遍历的过程中会超出集合的长度)
        Iterator<String> ite = list.iterator();
        while(ite.hasNext()) {
            System.out.println(ite.next());
        }
    }
}
