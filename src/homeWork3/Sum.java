package homeWork3;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input number");
        int number = scanner.nextInt();
        System.out.println(SumDigitsInNumber(number));

    }
    public static int SumDigitsInNumber(int number){
        int sum = 0;
        while(number!=0){
            sum = sum + number%10;
            number = number/10;
        }
        return sum;

    }
}
