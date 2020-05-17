package students;

public class Main {
    public static void main(String[] args) {
        Group group = new Group();
        Student [] students = new Student [0];
        students = group.addStudent("Ivanov", students);
        students = group.addStudent("Sidorov", students);
        group.print(students);
        students = group.deleteStudent("Ivanov",students);
        group.print(students);
        group.setMarks(group.findStudent("Sidorov", students), 5, 5);
        group.print(students);
    }



}
