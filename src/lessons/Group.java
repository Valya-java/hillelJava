package lessons;

import java.util.Arrays;

public class Group {
    public Group() {
        Students = new Student[0]; // Создаёт пустой массив студентов в группе
    }

    public Student[] Students;

    public Student GetStudent(String studentName) {

        for(Integer i = 0; i < Students.length; i++) {
            if(Students[i].Name.equalsIgnoreCase(studentName)) {
                return Students[i];
            }

        }

        return null;
    }


    public void AddStudent(String studentName) {

        // Можно сделать проверку, нет ли такого студента (если есть вывести ошибку или предупреждение)

        Integer studentsCount = Students.length;

        // Так как переопределить длину массива нельзя - создаём новый
        Student[] newStudentsArray = new Student[studentsCount + 1];

        // Копируем из старого массива в новый

        for(Integer i = 0; i < studentsCount; i++) {
            newStudentsArray[i] = Students[i];
        }

        // Записываем нового студаента в конец массива

        newStudentsArray[studentsCount] = new Student(studentName);

        // записываем в поле Students новый массив
        Students = newStudentsArray;
    }


    public Boolean RemoveStudent(String studentName) {

        // Можно сделать проверку, нет ли такого студента (если есть вывести ошибку или предупреждение)

        Integer studentsCount = Students.length;

        if(GetStudent(studentName) == null)
            return false;

        // Так как переопределить длину массива нельзя - создаём новый
        Student[] newStudentsArray = new Student[studentsCount - 1];

        // Копируем из старого массива в новый
        Integer k = 0;
        for(Integer i = 0; i < studentsCount - 1; i++) {

            if(Students[i].Name.equalsIgnoreCase(studentName)) {
                k = 1;
                // Если нашли студента которого нужно удалить, устанавливаем k = arg1
                // Чтоб при копировании в новый массив пропустить этого студента
            }

            newStudentsArray[i] = Students[i + k];


        }

        // записываем в поле Students новый массив
        Students = newStudentsArray;

        return true;
    }
    public void print(){
        for (int i = 0; i <Students.length ; i++) {
            System.out.println(Students[i].Name);
        }
    }


    // Далее нужно написать все нужные методы
}
