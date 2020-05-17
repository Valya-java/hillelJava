package students;

public class Main {
    public static void main(String[] args) {
        Group group = new Group();
        group.addStudent("Ivanov");
        group.addStudent("Sidorov");
        group.addStudent("Petrov");
        group.addStudent("Abramov");
        group.print();
        System.out.println();
        group.deleteStudent("Ivanov");
        group.print();
        System.out.println();
        Student student = (group.findStudent("Sidorov"));
        student.setMarks(5,5);
        student.setVisits(true, 5);
        group.print();
        System.out.println();
        group.sortStudent();
        group.print();

    }
}
