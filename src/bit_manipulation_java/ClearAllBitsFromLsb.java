package bit_manipulation_java;

import java.util.Scanner;

public class ClearAllBitsFromLsb {

    /*

     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = in.nextInt();

        int m = 0;
        for(int j=0; j<i; j++) {
            m = m<<1;
            m = m + 1;
        }
        m = ~m;

        //say m = 0000 0001 and i = 3, we now hava a number like ~0000 0111 = 1111 1000
        System.out.println(n & m);
    }
}
