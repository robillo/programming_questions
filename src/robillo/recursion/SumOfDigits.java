package robillo.recursion;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(sumOfDigits(n));
    }

    public static int sumOfDigits(int input){
        if(input == 0) return 0;
        return input%10 + sumOfDigits(input/10);
    }
}
