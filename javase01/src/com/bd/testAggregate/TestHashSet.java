package com.bd.testAggregate;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestHashSet {
    public static void main(String[] args) {
        Set DogList = new HashSet();
        DogList.add(new Dog("旺财", "中华田园犬"));
        DogList.add(new Dog("旺财2", "中华田园犬2"));
        DogList.add(new Dog("旺财3", "中华田园犬3"));
        System.out.println(DogList.size());

        for (Object it :
                DogList) {
            System.out.println(((Dog) it).getName() + '\t' + ((Dog) it).getType());
        }
        Iterator var2 = DogList.iterator();
        while(var2.hasNext()){
            Dog var3 = (Dog)var2.next();
            System.out.println(var3.getName());
        }

    }
}
