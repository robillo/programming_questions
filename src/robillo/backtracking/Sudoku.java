package robillo.backtracking;

public class Sudoku {

    private static final int SIZE = 9;

    public static void main(String[] args) {
        int[][] a = new int[][] {
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };

        System.out.println(canBeCompleted(a));

        printHelper(a);
    }


    private static boolean canBeCompleted(int[][] a) {
        return canBeCompletedHelper(a, 0, 0);
    }

    private static boolean canBeCompletedHelper(int[][] a, int x, int y) {

        if(x == SIZE-1 && y == SIZE-1 && a[x][y] != 0)
            return true;

        if(x < 0 || y < 0 || x >= SIZE || y >= SIZE)
            return false;

        if(a[x][y] == 0) {
            for(int i=1; i<=SIZE; i++) {
                if(checkIfNumCanBeFilled(a, i, x, y)) {
                    a[x][y] = i;
                    boolean optionWorked = false;
                    if(x == SIZE-1 && y == SIZE-1) {
                        return true;
                    }
                    else if(x == SIZE-1) {
                        if(canBeCompletedHelper(a, 0, y+1)) optionWorked = true;
                    }
                    else {
                        if(canBeCompletedHelper(a, x+1, y)) optionWorked = true;
                    }
                    if(!optionWorked) {
                        a[x][y] = 0;
                    }
                    else {
                        return true;
                    }
                }
                //no need for else as once the loop ends it will return false
            }
        }
        else {
            if(x == SIZE-1) return canBeCompletedHelper(a, 0, y+1);
            else return canBeCompletedHelper(a, x+1, y);
        }

        return false;
    }

    private static boolean checkIfNumCanBeFilled(int[][] a, int num, int x, int y) {
        return checkHorizontalAndVertical(a, num, x, y) && checkCurrentBox(a, num, x, y);
    }

    private static boolean checkCurrentBox(int[][] a, int num, int x, int y) {
        Pos pos = new Pos(x - x%3, y - y%3);

        for(int i = pos.x; i<pos.x + 3; i++)
            for(int j=pos.y; j<pos.y + 3; j++)
                if(a[i][j] != 0 && a[i][j] == num) return false;

        return true;
    }

    private static boolean checkHorizontalAndVertical(int[][] a, int num, int x, int y) {

        for(int i = 0; i< SIZE; i++) if(a[i][y] == num) return false;

        for(int i = 0; i< SIZE; i++) if(a[x][i] == num) return false;

        return true;
    }

    private static void printHelper(int[][] a) {
        System.out.println();
        for(int i=0; i<SIZE; i++) {
            for(int j=0; j<SIZE; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static class Pos {
        int x, y;

        Pos(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
