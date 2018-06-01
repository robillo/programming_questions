package arrays_and_strings;

import java.util.Scanner;

public class LeaderInArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] a = new int[n];

        for(int i=0; i<n; i++) {
            a[i] = in.nextInt();
        }

        leaders(a);

    }

    public static void leaders(int[] input) {
        int loopCount = input.length;
        boolean[] isLeader = new boolean[loopCount];

        for(int i=0; i<loopCount; i++) {
            isLeader[i] = true;
            for(int j=i+1; j<loopCount; j++) {
                if(input[i] < input[j]) {
                    isLeader[i] = false;
                    break;
                }
            }
        }

        for(int i=0; i<loopCount; i++) {
            if(isLeader[i]) System.out.print(input[i] + " ");
        }
    }
}
