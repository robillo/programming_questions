package matrix_java;

public class PrintUniqueRowsBooleanMatrix {

    public static void main(String[] args) {

        int rows = 4;
        int columns = 5;

        int[][] mat = new int[][]{
                {0, 1, 0, 0, 1},
                {1, 0, 1, 1, 0},
                {0, 1, 0, 0, 1},
                {1, 1, 1, 0, 0}
        };

        printUniqueRows(mat, rows, columns);
    }


    /*
        Naive Solution
        A simple approach is to check each row with all processed rows.
        Print the first row. Now, starting from the second row, for each row, compare the row with already processed rows.
        If the row matches with any of the processed rows, don’t print it.
        If the current row doesn’t match with any row, print it.
    */

    private static void printUniqueRows(int[][] m, int r, int c) {

        //print first row
        printRow(m, 0, c);

        //starting from 2nd row, check if all previous rows are not equal to the current row
        for(int i=1; i<r; i++) {
            boolean rowUnique = true;
            for(int j=i-1; j>=0; j--) {
                if(checkRowEquivalence(m, i, j, c))
                    rowUnique = false;
            }
            if(rowUnique)
                printRow(m, i, c);
        }
    }

    private static void printRow(int[][] m, int rowToPrint, int c) {
        for(int i=0; i<c; i++) {
            System.out.print(m[rowToPrint][i]);
        }
        System.out.println();
    }

    private static boolean checkRowEquivalence(int[][] m, int rowOne, int rowTwo, int c) {
        boolean equal = true;
        for(int i=0; i<c; i++) {
            if(m[rowOne][i] != m[rowTwo][i])
                equal = false;
        }
        return equal;
    }
}
