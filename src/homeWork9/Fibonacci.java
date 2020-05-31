package homeWork9;

import java.math.BigInteger;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(25));
        System.out.println(fibonacci(52));
        System.out.println(fibonacci(3));
        System.out.println(fibonacci(17));
    }

    public static BigInteger fibonacci(int n) {
        if (n <= 1) return BigInteger.valueOf(n);
        BigInteger first = BigInteger.ZERO;
        BigInteger next = BigInteger.ONE;
        BigInteger sum;

        for (int i = 2; i <= n; i++) {
            sum = first;
            first = next;
            next = sum.add(first);
        }

        return next;


    }

}