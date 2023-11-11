package de.diskostu.codewars;

public class Fibonacci {
    public static long calculateFibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        long[] fib = new long[n + 1];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        return fib[n];
    }

    public static void main(String[] args) {
        int n = 100; // Beispiel: Fibonacci-Zahl an Position 10 berechnen
        long result = calculateFibonacci(n);
        System.out.println("Fibonacci-Zahl an Position " + n + ": " + result);
    }
}

