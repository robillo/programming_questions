package recursion_java;

import java.util.Scanner;

public class GeometricSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(findGeometricSum(n));
    }

    public static double findGeometricSum(int k){
        if(k == 0) return 1;
        return ((double) 1)/Math.pow(2, k) + findGeometricSum(k-1);
    }
}
