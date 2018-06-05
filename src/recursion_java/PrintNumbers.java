package recursion_java;

import java.util.Scanner;

public class PrintNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        print(6);
    }

    public static void print(int n){
        if(n == 1){
            System.out.print(n + " ");
            return;
        }
        print(n-1);
        System.out.print(n + " ");
    }
}
