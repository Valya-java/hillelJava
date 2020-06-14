package myCollection;


import students.Student;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyCollection students = new MyCollection();
        students.add(new Student("Ivanov"));
        students.add(new Student("Sidorov"));
        students.add(new Student("Petrov"));
        System.out.println(students);
        System.out.println(students.contains(new Student( "Ivanov")));
        System.out.println(students.contains(new Student( "Dudkin")));
        ArrayList students2 = new ArrayList();
        students2.add(new Student("Kukushkin"));
        students2.add(new Student("Ovechkin"));
        students.addAll(students2);
        System.out.println(students);
        System.out.println(students.remove(new Student("Ivanov")));
        System.out.println(students.remove(new Student("iii")));
        System.out.println(students);
        System.out.println(students2);
        students.removeAll(students2);
        System.out.println(students);
        System.out.println(Arrays.toString(students.toArray()));



    }


}
