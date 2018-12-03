package robillo.recursion;

import java.util.Scanner;

public class MinimumCount {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(minCount(n));
    }

    private static int minCount(int n){
        return getMinSquares(n);
    }

    private static int getMinSquares(int n) {
        if (n <= 3)
            return n;

        int res = n;

        for (int x = 1; x <= n; x++) {
            int temp = x*x;
            if (temp > n)
                break;
            else
                res =  Math.min(res, 1 + getMinSquares(n - temp));
        }
        return res;
    }
}
