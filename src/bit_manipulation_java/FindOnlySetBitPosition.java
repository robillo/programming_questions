package bit_manipulation_java;

import java.util.Scanner;

public class FindOnlySetBitPosition {

    /*You are given an integer N.
    You need to find position of the only set bit in its binary representation
    */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int position = 1;
        while (n != 1) {
            n = n<<1;
            position++;
        }

        System.out.println(position);
    }
}
