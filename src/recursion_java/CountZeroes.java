package recursion_java;

import java.util.Scanner;

public class CountZeroes {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(countZerosRec(n));
    }

    public static int countZerosRec(int input){
        if(input == 0) return 0;
        int temp = input % 10;
        int val = 0;
        if(temp == 0) val = 1; else  val = 0;
        return val + countZerosRec(input/10);
    }
}
