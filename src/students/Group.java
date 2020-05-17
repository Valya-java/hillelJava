package students;

import java.util.ArrayList;
import java.util.Arrays;

public class Group {
    //final static int MAX_STUDENTS_IN_GROUP = 5;
    public static void main(String[] args) {
        Student [] students = new Student [0];
        students = addStudent("Ivanov", students);
        students = addStudent("Sidorov", students);
        print(students);
        deleteStudent("Ivanov",students);
        print(students);
        setMarks(findStudent("Sidorov", students), 5, 5);
        print(students);
    }


    public static Student [] addStudent(String newStudentsSurname, Student [] oldStudents) {
        Student[] result = new Student[oldStudents.length + 1];
        for (int i = 0; i < oldStudents.length; i++) {
            result[i] = oldStudents[i];
        }
        result[oldStudents.length] = new Student(newStudentsSurname);
        return result;
    }






    public static void print(Student [] students){
        System.out.println("Surname\tMarks\t\t\t\t\tVisits");
        for (int i = 0; i <students.length ; i++) {
            System.out.println(students[i].surname + "\t" + Arrays.toString(students[i].marks) + Arrays.toString(students[i].visits));
        }
    }

    public static void deleteStudent(String studentToDelete, Student [] students){
        for (int i = 0; i <students.length ; i++) {
            if( students[i].surname.equalsIgnoreCase(studentToDelete)){
                students[i] = null;}

        }
    }

    public static void setMarks(Student student, int mark, int lessonNum){
        student.marks[lessonNum-1] = mark;
    }

    public static Student findStudent(String surname,Student [] students){
        for (int i = 0; i <students.length ; i++) {
            if (students[i].surname.equalsIgnoreCase(surname))
                return students[i];
        }
            return null;
    }



}

