package robillo.bit_manipulation;

import java.util.Scanner;

public class cnFlipASpecificBit {

    /*You are given two integers N and i.
    You need to make ith bit of binary representation of N to complement of that bit and return the updated N.
    Counting of bits start from 0 from right to left.*/

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = in.nextInt();

        int setIthBitNumber = 1 << i; //will set 2 to power ith bit to 1 in binary representation of this number

        n = n ^ setIthBitNumber;  //at ith position, & operation will always make result bit 0
        System.out.println(n);
    }
}
