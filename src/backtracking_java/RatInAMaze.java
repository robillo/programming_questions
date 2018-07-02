package backtracking_java;

import java.util.Scanner;

@SuppressWarnings("RedundantIfStatement")
public class RatInAMaze {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[][] a = new int[n][n];

        for(int i=0; i<n; i++)
            for( int j=0; j<n; j++)
                a[i][j] = in.nextInt();

        //has path
//        System.out.println(hasPath(a, n));

        //print all paths
        printAllPaths(a, n);
    }

    private static boolean hasPath(int[][] a, int n) {
        int[][] sol = new int[n][n];

        for(int i=0; i<n; i++)
            for( int j=0; j<n; j++)
                sol[i][j] = 0;

        return hasPathHelper(a, n, sol, 0, 0);
    }

    private static boolean hasPathHelper(int[][] input, int n, int[][] solution, int x, int y) {

        if(x == n-1 && y == n-1)
            return true;

        //                                       invalid location    already visited
        if(x < 0 || y < 0 || x >= n || y >= n || input[x][y] == 0 || solution[x][y] == 1)
            return false;

        solution[x][y] = 1;

        if(hasPathHelper(input, n, solution, x-1, y))
            return true;

        if(hasPathHelper(input, n, solution, x+1, y))
            return true;

        if(hasPathHelper(input, n, solution, x, y-1))
            return true;

        if(hasPathHelper(input, n, solution, x, y+1))
            return true;

        solution[x][y] = 0;

        return false;
    }

    private static void printAllPaths(int[][] input, int n) {
        int[][] sol = new int[n][n];

        for(int i=0; i<n; i++)
            for( int j=0; j<n; j++)
                sol[i][j] = 0;

        printPathHelper(input, n, sol, 0, 0);
    }

    private static void printPathHelper(int[][] input, int n, int[][] solution, int x, int y) {

        if(x == n-1 && y == n-1) {
            solution[x][y] = 1;
            printHelper(solution, n);
            return;
        }

        //                                       invalid location    already visited
        if(x < 0 || y < 0 || x >= n || y >= n || input[x][y] == 0 || solution[x][y] == 1)
            return;

        solution[x][y] = 1;

        printPathHelper(input, n, solution, x-1, y);

        printPathHelper(input, n, solution, x+1, y);

        printPathHelper(input, n, solution, x, y-1);

        printPathHelper(input, n, solution, x, y+1);

        solution[x][y] = 0;


    }

    private static void printHelper(int[][] sol, int n) {
        System.out.println();

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(sol[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}
