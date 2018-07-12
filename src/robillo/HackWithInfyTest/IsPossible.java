package robillo.HackWithInfyTest;

import java.util.Scanner;

public class IsPossible {

    /*
        given 2 integers a and b, you can perform only 2 operations to convert a and b:
        a, b = a+b, b
        a, b = a, a+b
        you have to return if it is possible to convert a and b = c and d using these operations
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        System.out.println(isPossible(a, b, c, d));
    }

    static boolean isPossible(int a, int b, int c, int d) {
        if(a == c && b == d) return true;
        if(a > c || b > d) return false;

        return isPossible(a+b, b, c, d) || isPossible(a, a+b, c, d);
    }
}
