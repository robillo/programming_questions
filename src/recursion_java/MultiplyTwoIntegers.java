package recursion_java;

import java.util.Scanner;

public class MultiplyTwoIntegers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();

        System.out.println(multiplyTwoIntegers(m, n));
    }

    public static int multiplyTwoIntegers(int m, int n){
        if(n == 1) return m;
        return m + multiplyTwoIntegers(m, n-1);
    }
}
