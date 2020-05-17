package students;

import java.util.ArrayList;
import java.util.Arrays;

public class Group {

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

    public static Student[] deleteStudent(String studentToDelete, Student [] students){
        Student[] result = new Student[students.length - 1];
        Integer k = 0;
        for (Integer i = 0; i < students.length - 1; i++) {

            if (students[i].surname.equalsIgnoreCase(studentToDelete)) {
                k = 1;
                // Если нашли студента которого нужно удалить, устанавливаем k = 1
                // Чтоб при копировании в новый массив пропустить этого студента
            }

            result[i] = students[i + k];
        }
        students = result;
        return students;
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

