package myCollection;


import students.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

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
        students2.add(new Student("AAA"));
        students.addAll(students2);
        students2.add(new Student("Sidorov"));
        students2.add(new Student("Petrov"));
        System.out.println(students);
        System.out.println(students.remove(new Student("Ivanov")));
        System.out.println(students.remove(new Student("iii")));
        System.out.println(students);
        System.out.println(students2);
        System.out.println(students.retainAll(students2));
        System.out.println(students);
        Iterator iterator = students.iterator();
        while (iterator.hasNext()){
            Object o = iterator.next();
            System.out.println(o);}






    }


}
