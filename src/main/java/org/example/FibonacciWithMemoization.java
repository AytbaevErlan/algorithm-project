package org.example;

import java.util.HashMap;
import java.util.Map;

public class FibonacciWithMemoization {

    private static Map<Integer, Integer> memo = new HashMap<>();

    public static void main(String[] args) {
        int n = 10;

        System.out.println("Fibonacci sequence:");
        for (int i = 0; i < n; i++) {
            System.out.print(memoizedFibonacci(i) + " ");
        }
    }
    private static int memoizedFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        //checking if we already have values
        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        int fib = memoizedFibonacci(n - 1) + memoizedFibonacci(n - 2);

        memo.put(n, fib);

        return fib;
    }
}

//time complexity: O(n)
//Space Complexity: O(n)
