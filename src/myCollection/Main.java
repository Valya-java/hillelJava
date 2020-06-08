package myCollection;


import students.Student;

public class Main {
    public static void main(String[] args) {
        MyCollection students = new MyCollection();
        students.add(new Student("Ivanov"));
        students.add(new Student("Sidorov"));
        students.add(new Student("Petrov"));
        System.out.println(students);
        System.out.println(students.contains(new Student( "Ivanov")));
        System.out.println(students.contains(new Student( "Dudkin")));
        MyCollection students2 = new MyCollection();
        students2.add(new Student("Kukushkin"));
        students2.add(new Student("Ovechkin"));
        students.addAll(students2);
        System.out.println(students);
        System.out.println(students.remove(new Student("Ivanov")));
        System.out.println(students.remove(new Student("iii")));
        System.out.println(students);
        System.out.println(students2);
        System.out.println(students.containsAll(students2));
        students2.add(new Student("Pechkin"));
        System.out.println(students.containsAll(students2));


    }


}
