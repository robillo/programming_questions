package robillo.bit_manipulation;

import java.util.Scanner;

public class cnClearAllBitsFromMsb {

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

        //say m = 0000 0000 and i = 3, we now have a number like 0000 0011
        System.out.println(n & m);
    }
}
