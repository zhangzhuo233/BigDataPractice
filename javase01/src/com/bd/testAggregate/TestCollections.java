package com.bd.testAggregate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCollections {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("haha");
        list.add("qaha");
        list.add("waha");
        list.add("aaha");
        System.out.println("before sort++");
        for (String str:
             list) {
            System.out.println(str);
        }
        Collections.sort(list);
        System.out.println("after sort++");
        for (String str:
                list) {
            System.out.println(str);
        }
        System.out.println(Collections.binarySearch(list, "haha"));
    }
}
