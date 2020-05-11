package homeWork3;

import java.util.Scanner;

public class Task2 {
    //Пользователь вводит координаты верхнего левого и нижнего правого угла прямоугольника,
    // а также координаты точки (X,Y) в прямоугольной системе координат.
    // Реализовать функцию, которая определяет принадлежит ли точка этому прямоугольнику.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input x1, y1 - coordinates of the upper left corner of the rectangle");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        System.out.println("Please input x2, y2 - coordinates of the lower right corner of the rectangle");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        System.out.println("Please input coordinates of point A(xA, yA)");
        int xA = scanner.nextInt();
        int yA = scanner.nextInt();
        if(xA>=x1 && yA>=y2 && xA<=x2 && yA<=y1)
            System.out.println("Point A belongs to a rectangle.");
        else
            System.out.println("Point A doesn't belongs to a rectangle.");

    }
}
