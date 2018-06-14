package test;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumProfit {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] budgets = new int[n];
        for(int i=0; i<budgets.length; i++) {
            budgets[i] = in.nextInt();
        }

        System.out.println(maximumProfit(budgets));
    }

    public static int maximumProfit(int budget[]) {

        Arrays.sort(budget);

        int maxProfit = 0;

        for(int i=0; i<budget.length; i++) {
            int temp = budget[i] * (budget.length - i);
            if(maxProfit < temp) maxProfit = temp;
        }

        return maxProfit;
    }
}
