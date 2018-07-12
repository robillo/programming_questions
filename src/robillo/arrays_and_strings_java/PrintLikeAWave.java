package robillo.arrays_and_strings_java;

import java.util.Scanner;

public class PrintLikeAWave {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int[][] a = new int[m][n];
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                a[i][j] = in.nextInt();
            }
        }
        wavePrint(a);
    }

    public static void wavePrint(int input[][]){
        int m = input.length;
        int n = input[0].length;
        boolean isUpDown = true;
        for(int i=0; i<n; i++) {
            if(isUpDown) {
                for(int j=0; j<m; j++) {
                    System.out.print(input[j][i] + " ");
                }
                isUpDown = false;
            }
            else {
                for(int j=m-1; j>=0; j--) {
                    System.out.print(input[j][i] + " ");
                }
                isUpDown = true;
            }
        }
    }
}
