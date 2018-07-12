package robillo.recursion_java;

import java.util.Scanner;

public class NumberOfDigits {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        count(n);
    }

    public static int count(int n){
        if(n == 0)
            return 0;

        return 1 + count(n/10);
    }
}
