package com.bd.mySerializableTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class DeserializableTest {
    public static void main(String[] args) {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("./asserts/data.txt"));
            List<Student> stus = (List<Student>)ois.readObject();
            if (null != stus && stus.size() > 0) {
                for(Student stu : stus) {
                    System.out.println(stu.getId() + " " + stu.getName());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
