package com.bd.Zoo;

import java.util.Scanner;

public class Master {
    private Animal[] animals = new Animal[3];
    Scanner sc = new Scanner(System.in);
    int input = 0;
    public Master() {
        animals[0] = new Cat("加菲猫", 4);
        animals[1] = new Duck("烤鸭", 2);
        animals[2] = new Dolphin("海豚", 0);
    }

    public void show() {
        System.out.println("动物名字" + "\t" + "腿的条数"
                + "\t" + "叫声");
        for (Animal an : animals) {
            System.out.println(an.getName() + "\t" + an.getLegNum() + "\t" + an.shout());
        }
        System.out.println("是否继续修改数据：按0进行修改，其他任意数字键退出");
    }

    public void update() {
        System.out.println("1.cat 2.duck 3.dolphin，请输入");
        int chooseValue = sc.nextInt();
        switch (chooseValue) {
            case 1:
                System.out.println("请输入名字:");
                String name = sc.next();
                animals[0].setName(name);
                try{
                    System.out.println("请输入腿数:");
                    int legNum = sc.nextInt();
                    animals[0].setLegNum(legNum);
                } catch(AnimalException ex) {
//                    ex.printStackTrace();
                    System.out.println("error" + ex.getMessage());
                }

                break;
            case 2:
                System.out.println("请输入名字:");
                String name1 = sc.next();
                animals[1].setName(name1);
                break;
            case 3:
                System.out.println("请输入名字:");
                String name2 = sc.next();
                animals[2].setName(name2);
                break;
            default:
                System.out.println("请检查输入");
                break;
        }
    }

    public void start() {
        do {
            show();
            input = sc.nextInt();
            if (input != 0)
                return;
            update();
        } while (input == 0);
    }
}
