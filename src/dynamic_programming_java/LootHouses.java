package dynamic_programming_java;

import java.util.Scanner;

public class LootHouses {

    /*
        A thief wants to loot houses.
        He knows the amount of money in each house. He cannot loot two consecutive houses.
        Find the maximum amount of money he can loot.
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];

        for(int i=0; i<n; i++) a[i] = in.nextInt();

        System.out.println(getMaxMoney(a, n));
    }

    public static int getMaxMoney(int arr[], int n){
        int[] sumFromLast = new int[arr.length];

        for(int i=n-1; i>=0; i-=2)
            sumFromLast[i]+=arr[i];

        for(int i=n-2; i>=0; i-=2)
            sumFromLast[i]+=arr[i];

        int sum = 0;
        for(int i=0; i<n-2; i+=2) {
            if(sumFromLast[i] > sumFromLast[i+1]) sum+=sumFromLast[i];
            else {
                sum+=sumFromLast[i+1];
                i++;
            }
        }

        return sum;
    }
}
