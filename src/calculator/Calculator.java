package calculator;

import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please input first number");
        float num1 = getNum();
        System.out.println("Please input second number");
        float num2 = getNum();
        char operation = getOperation();
        float result = calculation(num1, num2, operation);
        System.out.println("Result = " + result);


    }

    static float getNum() {
        float num;
        if (scanner.hasNextFloat())
            num = scanner.nextFloat();
        else {
            System.out.println("You made a mistake. Try again.");
            scanner.next();
            num = getNum();
        }
        return num;
    }

    static char getOperation(){
        System.out.println("Please input operation");
        char operation = scanner.next().charAt(0);
        return operation;
    }

    static float calculation(float num1, float num2, char operation){
        float result;
        switch (operation){
            case'+':
                result = num1+num2;
                break;
            case'-':
                result = num1-num2;
                break;
            case'*':
                result = num1*num2;
                break;
            case'/':
                if(num2==0){
                    System.out.println("Error. Division by zero!");
                    System.out.println("Please input another second number");
                     num2 = getNum();}
                result = num1/num2;
                break;
            default:
                System.out.printf("Operation isn't found. Try again.");
                result = calculation(num1, num2, getOperation());
        }
        return result;

    }
    static float average(float num1, float num2){
        float average = (num1+num2)/2;
        return average;
    }


}

