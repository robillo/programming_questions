package robillo.dynamic_programming;

import java.util.Scanner;

@SuppressWarnings({"WeakerAccess", "UnusedAssignment"})
public class CountStepsTo1 {

    /*
        Given a positive integer n,
        find the minimum number of steps s, that takes n to 1.
        You can perform any one of the following 3 steps.
    */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(countStepsTo1(n));
    }

    public static int countStepsTo1(int n){
        int[] mem = new int[n+1];

        for(int i=0; i<mem.length; i++) mem[i] = -1;

        return getMinSteps(n);
    }

    public static int getMinSteps(int n, int[] mem) {
        if(n <= 1) return 0;
        if(mem[n] != -1) return mem[n];

        // store temp value for n as min(f(n-1),f(n/2),f(n/3)) + 1
        int res = getMinSteps(n-1, mem);

        if(n%2 == 0) res = Math.min(res, getMinSteps(n/2, mem));
        if(n%3 == 0) res = Math.min(res, getMinSteps(n/3, mem));

        // store memo[n] and return
        mem[n] = 1 + res;
        return mem[n];
    }

    public static int getMinSteps(int n) {
        int[] table = new int[n+1];
        for(int i=0; i<n; i++) table[i] = n-i;

        for(int i=n; i>=1; i--) {
            if(i%2 == 0) table[i/2] = Math.min(table[i]+1, table[i/2]);
            if(i%3 == 0) table[i/3] = Math.min(table[i]+1, table[i/3]);
        }

        return table[1];
    }

    public static int min_steps(int num) {
        int x = num, y = num, z = num;

        if (num <= 1) return 0;

        if (num%2 == 0)
            x = min_steps(num/2);

        if (num%3 == 0)
            y = min_steps(num/3);

        z = min_steps(num-1);

        return 1 + (Math.min(Math.min(x,y), Math.min(y,z)));
    }
}
