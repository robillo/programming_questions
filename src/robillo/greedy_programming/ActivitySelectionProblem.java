package robillo.greedy_programming;

public class ActivitySelectionProblem {

    /*You are given n activities with their start and finish times.
     Select the maximum number of activities that can be performed by a single person,
     assuming that a person can only work on a single activity at a time.*/

    public static void main(String[] args) {

        int n = 6;
        int[] startTimes = {0, 3, 1, 8, 5, 5};
        int[] finishTimes = {6, 4, 2, 9, 7, 9};

        System.out.print(returnMaxActivities(startTimes, finishTimes, n));
    }

    private static int returnMaxActivities(int[] s, int[] f, int n) {
        //first step -> sort the activities based on their finishing time (ascending order)
        sortBasedOnFinishing(s, f, n);

        return countActivities(s, f, n);
    }

    private static void sortBasedOnFinishing(int[] s, int[] f, int n) {
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(f[i] > f[j]) {
                    swapValues(s, f, i, j);
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

    private static int countActivities(int[] s, int[] f, int n) {

        //if no activities. return 0
        if(f.length == 0)
            return 0;

        //first activity based on increasing order of finishing time will always be printed
        int count = 1;

        for(int i=1; i<s.length; i++) {

            //if start time of ith activity is more than or equal to finish time of previous activity, it will be done and printed
            if(s[i] >= f[i-1]) {
                count++;
            }

        }

        return count;
    }
}
