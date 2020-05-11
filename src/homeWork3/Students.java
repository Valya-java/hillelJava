package homeWork3;

import java.util.Arrays;
import java.util.Scanner;

public class Students {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] Students = new String[5][5];
        for (int i = 0; i <Students.length; i++ ) {
            System.out.println("Input student name and his marks");
            for (int j = 0; j <Students[i].length; j++) {
                Students[i][j] = scanner.nextLine();
            }
        }

        for (int i = 0; i <Students.length ; i++) {
            for (int j = 0; j <Students[i].length; j++) {
                System.out.print(Students[i][j]);
            }
            System.out.println();
        }
    }
}






