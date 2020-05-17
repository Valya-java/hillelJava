package students;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    final static int NUM_OF_LESSONS = 7;
    String surname;
    boolean[] visits;
    int[] marks;


    public Student(String surname){
        this.surname = surname;
        this.visits = new boolean[NUM_OF_LESSONS];
        this.marks = new int[NUM_OF_LESSONS];
    }


}







