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
        group.setMarks(group.findStudent("Sidorov"), 5, 5);
        group.setVisits(group.findStudent("Sidorov"), true, 5);
        group.print();
        System.out.println();
        group.sortStudent();
        group.print();

    }



}
