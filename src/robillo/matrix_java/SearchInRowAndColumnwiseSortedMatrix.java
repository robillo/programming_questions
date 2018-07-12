package robillo.matrix_java;

public class SearchInRowAndColumnwiseSortedMatrix {

    public static void main(String[] args) {

        //size of the matrix
        int n = 4;

        //element to be searched for
        int x = 29;

        int[][] sortedMatrix = new int[][] {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}
        };

        System.out.println(searchItemInMatrixNaive(sortedMatrix, n, x));

        System.out.println(searchItemMatrixOptimal(sortedMatrix, n, x));
    }

    //naive solution that is of complexity O(n^2)
    private static boolean searchItemInMatrixNaive(int[][] m, int n, int x) {

        boolean found = false;

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(m[i][j] == x) {
                    found = true;
                    break;
                }
            }
        }

        return found;
    }

    //optimal solution with complexity O(n)
    private static boolean searchItemMatrixOptimal(int[][] m, int n, int x) {

        boolean found = false;

        int p = 0, q = n-1;

        do {
            if(m[p][q] == x) {
                found = true;
                break;
            }
            else if(x < m[p][q]) {
                q--;
            }
            else if(x > m[p][q]) {
                p++;
            }
        } while (p != n-1 && q != 0);

        return found;
    }
}
