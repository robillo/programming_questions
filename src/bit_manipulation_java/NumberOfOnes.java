package bit_manipulation_java;

import java.util.Scanner;

public class NumberOfOnes {

    /*You are given an integer N.
    You need to count number of 1's in its binary representation*/

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int count = 0;
        while (n > 0) {
            n = n & n-1;
            count++;
        }

        System.out.println(count);
    }
}
