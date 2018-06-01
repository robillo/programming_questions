package arrays_and_strings;

import java.util.Scanner;

public class MaximiseSumPath {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int[] a = new int[m];
        for(int i=0; i<m; i++) {
            a[i] = in.nextInt();
        }

        int n = in.nextInt();
        int[] b = new int[n];
        for(int i=0; i<n; i++) {
            b[i] = in.nextInt();
        }

        System.out.print(maximumSumPath(a, b));
    }

    public static long maximumSumPath(int[] input1, int[] input2) {
        int m = input1.length-1;
        int n = input2.length-1;
        boolean isNk = true;
        int mk = 0, nk = 0, sum = 0, prevSum;
        while (mk<=m || nk<=n) {
            prevSum = sum;
            if(isNk && nk<=n) {
                int index;
                do {
                    sum += input2[nk];
                    index = checkIfSecondEqualsFirst(input1, input2, nk);
                    nk++;
                } while (index<0 && nk<=n);
                if(index>=0) {
                    isNk = false;
                    mk = index+1;
                }
            }
            else if (!isNk && mk<=m){
                int index;
                do {
                    sum += input1[mk];
                    index = checkIfFirstEqualsSecond(input1, input2, mk);
                    mk++;
                } while (index<0 && mk<=n);
                if(index>=0) {
                    isNk = true;
                    nk = index+1;
                }
            }
            else if(mk > m || nk > n) {
                isNk = !isNk;
            }
            else if(sum == prevSum) {
                break;
            }
        }
        return (long) sum;
    }

    private static int checkIfFirstEqualsSecond(int[] input1, int[] input2, int mk) {
        for(int i=0; i<input2.length; i++) {
            if(input1[mk] == input2[i]) {
                return i;
            }
        }
        return -1;
    }

    private static int checkIfSecondEqualsFirst(int[] input1, int[] input2, int nk) {
        for(int i=0; i<input1.length; i++) {
            if(input2[nk] == input1[i]) {
                return i;
            }
        }
        return -1;
    }
}
