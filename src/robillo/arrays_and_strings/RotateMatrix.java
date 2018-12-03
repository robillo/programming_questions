package robillo.arrays_and_strings;

import java.util.Scanner;

public class RotateMatrix {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int[][] a = new int[m][m];
        for(int i=0; i<m; i++) {
            for(int j=0; j<m; j++) {
                a[i][j] = in.nextInt();
            }
        }
        rotate(a);

        for(int i=0; i<m; i++) {
            for(int j=0; j<m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void rotate(int input[][]){
        int m = input.length;
        int[][] a = new int[m][m];
        for(int i=0; i<m; i++) {
            for(int j=0, k = m-1; j<m && k>=0; j++, k--) {
                a[k][i] = input[i][j];
            }
        }
        for(int i=0; i<m; i++)
            System.arraycopy(a[i], 0, input[i], 0, m);
    }
}
