package graphics;

import java.util.Scanner;

public class Envelop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int width = scanner.nextInt();
        for (int i=1; i<=height; i++)
        {
            for (int j=1; j<=width; j++)
            {
                if (i==1 || j==1 || i==height || j==width || i==j || j==width-(i-1))
                    System.out.print("*");
                else
                    System.out.print(" ");

            }
            System.out.println();
        }
    }
}
