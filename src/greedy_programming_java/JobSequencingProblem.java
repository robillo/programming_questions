package greedy_programming_java;

public class JobSequencingProblem {

    /*Given an array of jobs where every job has a deadline and associated profit if the job is finished before the deadline.
     It is also given that every job takes single unit of time, so the minimum possible deadline for any job is 1.
      How to maximize total profit if only one job can be scheduled at a time.*/

    public static void main(String[] args) {

        int n = 5;
        int[] deadlines = {2, 1, 2, 1, 3};
        int[] profits = {100, 19, 27, 25, 15};

        System.out.println(findMaxProfit(deadlines, profits, n));
    }

    private static int findMaxProfit(int[] d, int[] p, int n) {

        //step 1 -> initialize all profit array values to 0
        int[] profitArray = {0, 0, 0, 0, 0};

        sortBasedOnMaxProfit(d, p, n);

        for(int i=0; i<n; i++) {
            boolean isAllotted = false;
            for(int j=d[i]-1; j>=0; j--) {
                if(profitArray[j] == 0 && !isAllotted) {
                    profitArray[j] = p[i];
                    isAllotted = true;
                }
            }
        }

        int profit = 0;
        for(int i=0; i<n; i++) {
            profit += profitArray[i];
        }

        return profit;
    }

    private static void sortBasedOnMaxProfit(int[] d, int[] p, int n) {
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(p[i] < p[j]) {
                    swapValues(d, p, i, j);
                }
            }
        }
    }

    private static void swapValues(int[] s, int[] f, int indexLeft, int indexRight) {
        //swap finish values
        int temp = f[indexLeft];
        f[indexLeft] = f[indexRight];
        f[indexRight] = temp;

        //swap start values
        temp = s[indexLeft];
        s[indexLeft] = s[indexRight];
        s[indexRight] = temp;
    }

}
