package robillo.recursion;

import java.util.Scanner;

public class Staircase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(staircase(n));
    }

    // A recursive function used by countWays
    static int countWaysUtil(int n, int m)
    {
        if (n <= 1)
            return n;
        int res = 0;
        for (int i = 1; i<=m && i<=n; i++)
            res += countWaysUtil(n-i, m);
        return res;
    }

    // Returns number of ways to reach s'th stair
    static int staircase(int s)
    {
        return countWaysUtil(s+1, 3);
    }

}
