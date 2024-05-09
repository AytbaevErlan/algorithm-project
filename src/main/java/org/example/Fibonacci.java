package org.example;

public class Fibonacci {

    public static void main(String[] args) {
        int n = 5;

        System.out.println("Fibonacci sequence:");
        for (int i = 0; i < n; i++) {
            System.out.print(iterativeFibonacci(i) + " ");
        }
    }

    private static int iterativeFibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        int fib = 1;
        int prevFib = 1;

        for (int i = 2; i < n; i++) {
            int temp = fib;
            fib += prevFib;
            prevFib = temp;
        }

        return fib;
    }
}


//Time Complexity:  O(n)
//Space Complexity: O(1)