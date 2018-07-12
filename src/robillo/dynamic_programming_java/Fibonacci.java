package robillo.dynamic_programming_java;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        //typical fib
        System.out.println(fib(n));

        //dynamic programming fib
        int[] a = new int[n + 1];
        a[0] = 1;
        a[1] = 1;
        System.out.println(dpFib(n, a));

        //iterative fib
        System.out.println(dpFibIterative(n));

        //iterative and space optimised fib
        System.out.println(dpFibIterativeSpaceOptimised(n));
    }

    private static int fib(int n) {
        if(n == 0 || n == 1) return 1;
        return fib(n-1) + fib(n-2);
    }

    private static int dpFibIterative(int n) {
        int[] a = new int[n+1];
        a[0] = 1;
        a[1] = 1;
        for(int i=2; i<=n; i++) {
            a[i] = a[i-1] + a[i-2];
        }
        //noinspection UnnecessaryLocalVariable
        int output = a[n];
        return output;
    }

    private static int dpFibIterativeSpaceOptimised(int n) {
        int a = 1, b = 1;
        int res = a + b;
        for(int i=2; i<=n; i++) {
            res = a + b;

            a = b;
            b = res;
        }
        return res;
    }


    private static int dpFib(int n, int[] a) {
        if(a[n] > 0) return a[n];

        else {
            a[n] = dpFib(n-1, a) + dpFib(n-2, a);
            return a[n];
        }
    }
}
