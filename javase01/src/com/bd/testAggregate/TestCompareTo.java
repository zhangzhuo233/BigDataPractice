package com.bd.testAggregate;

import java.util.*;

public class TestCompareTo {
    public static void main(String[] args) {
        List<Student> stuList = new ArrayList<Student>();
        stuList.add(new Student("qq", 18));
        stuList.add(new Student("ds", 100));
        stuList.add(new Student("af", 10));
        stuList.add(new Student("qq", 45));
        Collections.sort(stuList);
        for (Student stu:
             stuList) {
            System.out.println(stu.getName() + stu.getAge());
        }
    }
}
