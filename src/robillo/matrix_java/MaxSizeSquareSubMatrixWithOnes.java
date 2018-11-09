package robillo.matrix_java;

public class MaxSizeSquareSubMatrixWithOnes {

    /*
        Given a square boolean matrix, find out the maximum size square sub-matrix with all ones
     */

    public static void main(String[] args) {

        int[][] boolMatrix = {
                { 0, 1, 1, 0, 1 },
                { 1, 1, 0, 1, 0 },
                { 0, 1, 1, 1, 0 },
                { 1, 1, 1, 1, 0 },
                { 1, 1, 1, 1, 1 },
                { 0, 0, 0, 0, 0 }
        };

        bruteForceMaxSizeSubMatrix(boolMatrix);
    }

    private static void bruteForceMaxSizeSubMatrix(int[][] boolMatrix) {

        int rowLength = boolMatrix[0].length;
        int colLength = boolMatrix.length;

        int[][] auxMatrix = new int[colLength][rowLength];

        for(int i=0; i<rowLength; i++)
            auxMatrix[0][i] = boolMatrix[0][i];

        for(int i=0; i<colLength; i++)
            auxMatrix[i][0] = boolMatrix[i][0];

        /*
            calculating auxiliary array from 2d array -> O(n^2)
         */

        for(int i=1; i<colLength; i++)
            for(int j=1; j<rowLength; j++)
                if(boolMatrix[i][j] == 1)
                    auxMatrix[i][j] =
                        returnMinOfThree(
                                auxMatrix[i][j-1],
                                auxMatrix[i-1][j],
                                (auxMatrix[i-1][j-1])
                        ) + 1;
                else auxMatrix[i][j] = 0;

         /*
            scanning for largest value in 2d array -> O(n^2)
         */

        int max = 0;
        int xCoordinate = 0, yCoordinate = 0;
        for(int i=1; i<colLength; i++)
            for(int j=1; j<rowLength; j++)
                if(max < auxMatrix[i][j]) {
                    max = auxMatrix[i][j];
                    xCoordinate = i;
                    yCoordinate = j;
                }

         /*
            printing 2d array -> O(n^2)
         */

        for(int i = colLength - xCoordinate; i < xCoordinate + 1; i++) {
            for (int j = rowLength - yCoordinate; j < yCoordinate; j++)
                System.out.print(boolMatrix[i][j]);
            System.out.println();
        }

        /*
            overall time complexity -> O(n^2)
         */
    }

    private static int returnMinOfThree(int first, int second, int third) {

        if(first >= second && first >= third)
            return first;

        if(second >= first && second >= third)
            return second;

        if(third >= second && third >= first)
            return third;

        return first;
    }
}
