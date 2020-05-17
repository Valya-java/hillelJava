package lessons;

public class m {
    public static void main(String[] args) {
        Group group = new Group();
        group.AddStudent("Ivanov");
        group.AddStudent("Sidorov");
        group.AddStudent("Petrov");
        group.print();
        group.RemoveStudent("Ivanov");
        group.print();


    }
}
