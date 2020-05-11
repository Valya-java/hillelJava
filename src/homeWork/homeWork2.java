package homeWork;

import java.util.Scanner;

public class homeWork2 {


    public static void main(String[] args) {

        averageN();
    }
    //Программа, которая находит среднее арифметическое значение двух чисел
     static void average(){
         Scanner scanner = new Scanner(System.in);
         float num1 = scanner.nextFloat();
         float num2 = scanner.nextFloat();
        float average = (num1+num2)/2;
         System.out.println(average);
    }
    //Программа, которая находит среднее арифметическое значение произвольного количества чисел
    static void averageN(){
        Scanner scanner = new Scanner(System.in);
        float sum = 0;
        int count = 0;
        while (scanner.hasNextFloat()){
            float a = scanner.nextFloat();
            count++;
            sum += a;
        }
        sum = sum/count;
        System.out.println(sum);
    }
    //Программу, которая предлагает пользователю ввести сумму денежного вклада в гривнах,
    // процент годовых, которые выплачивает банк, длительность вклада (лет).
    // Вывести накопленную сумму денег за каждый год и начисленные проценты.
    public void deposit(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input deposit amount");
        float num1 = scanner.nextFloat();
    }



}
