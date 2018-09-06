package robillo.patterns;

import java.util.Scanner;

public class cnPatternEight {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] a = new int[num*num];

        printPattern(a, num);
    }

    private static void printPattern(int[] a, int q) {
        int startIndexA = 0;
        int endIndexA = a.length - 1;
        int value = 1;
        int endIndexTemp = 0;
        boolean isOdd = true;
        for(int i=1; i<=q; i++) {
            endIndexTemp = endIndexA;
            for(int j=q; j>=1; j--) {
                if(isOdd) {
                    a[startIndexA] = value;
                    value++;
                    startIndexA++;
                }
                else {
                    a[endIndexTemp-j+1] = value;
                    value++;
                    endIndexA--;
                }
            }
            isOdd = !isOdd;
        }
        for(int i=0; i<a.length; i++) {
            System.out.print(a[i] + " ");
            if((i+1)%q==0) System.out.println();
        }
    }
}
