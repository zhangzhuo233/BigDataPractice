package com.bd.mySerializableTest;

import javax.swing.event.ListSelectionEvent;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializableTest {
    public static void main(String[] args) {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("./asserts/data.txt"));
            Student stu1 = new Student(1, "haha");
            Student stu2 = new Student(2, "xix");
            List<Student> stus = new ArrayList<Student>();
            stus.add(stu1);
            stus.add(stu2);
            oos.writeObject(stus);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
