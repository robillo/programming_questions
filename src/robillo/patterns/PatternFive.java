package robillo.patterns;

public class PatternFive {

    public static void main(String[] args) {
        System.out.println();
        printMountains();
    }

    private static void printMountains() {
        int numRows = 20;
        for(int i=1; i<=numRows; i++) {
            printOneRow(numRows, i);
            printOneRow(numRows, i);
            printOneRow(numRows, i);
            printOneRow(numRows, i);
            System.out.println();
        }
    }

    private static void printOneRow(int numRows, int i) {
        for(int j=numRows-i; j>0; j--) {
            System.out.print(" ");
        }
        System.out.print("/");
        for(int j=2*i-2; j>0; j--) {
            System.out.print(" ");
        }
        System.out.print("\\");
        for(int j=numRows-i; j>0; j--) {
            System.out.print(" ");
        }
    }
}
