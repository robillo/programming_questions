package matrix_java;

public class PrintUniqueRowsBooleanMatrix {

    private static TrieNode root;

    public static void main(String[] args) {

        int rows = 4;
        int columns = 5;

        int[][] mat = new int[][]{
                {0, 1, 0, 0, 1},
                {1, 0, 1, 1, 0},
                {0, 1, 0, 0, 1},
                {1, 1, 1, 0, 0}
        };

        System.out.println("Naive Solution:");
        printUniqueRows(mat, rows, columns);
        System.out.println();

        root = new TrieNode();

        System.out.println("Efficient Solution:");
        printUniqueRowsEfficient(mat, rows, root);
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

    /*
        Better Solution
        (Using Trie Data Structure)
        Since the matrix is boolean, a variant of Trie data structure can be used where each node will
        be having two children one for 0 and other for 1.
        Insert each row in the Trie.
        If the row is already there, don’t print the row.
        If row is not there in Trie, insert it in Trie and print it.
     */

    static class TrieNode {
        boolean isEndOfRow;
        TrieNode[] children = new TrieNode[2];  //boolean = 0 and 1

        TrieNode() {
            isEndOfRow = false;
            children[0] = null;
            children[1] = null;
        }
    }

    private static void printUniqueRowsEfficient(int[][] m, int row, TrieNode root) {

        for(int i=0; i<row; i++) {
            if(insert(m, i)) {
                printSingleRow(m, i);
            }
        }
    }

    private static void printSingleRow(int[][] m, int row) {
        for(int i=0; i<m[row].length; i++) {
            System.out.print(m[row][i]);
        }
        System.out.println();
    }

    private static boolean insert(int[][] m, int row) {
        TrieNode pCrawl = root;

        for(int level = 0; level<m[row].length; level++) {

            int index = m[row][level];

            if(pCrawl.children[index]== null)
                pCrawl.children[index] = new TrieNode();

            pCrawl = pCrawl.children[index];
        }


        /*This is the
          crux of the
          problem:
         */

        //mark last node as leaf
        //if isEndOfRow is false (in case we are coming here for the first time
        if(!pCrawl.isEndOfRow) {
            pCrawl.isEndOfRow = true;
            return true;
        }
        else return false;  //whenever we are coming here from 2nd time onwards, !pCrawl.isEndOfRow would be false, so false is returned (duplicate row found)
    }
}
