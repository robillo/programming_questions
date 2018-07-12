package robillo.patterns;

public class PatternFour {

    private static int n = 4;

    public static void main(String[] args) {

        for(int i=1; i<=n; i++) {
            printOneLadder(i);
        }
    }

    private static void printOneLadder(int level) {
        int spaces = 8*level;
        printSpaces(spaces-8);
        for(int i=1; i<=4; i++) {
            System.out.print(" _");
        }
        System.out.println();
        for(int i=1; i<=n; i++) {
            printSpaces(spaces);
            System.out.print("|");
            System.out.println();
        }
    }

    private static void printSpaces(int spaces) {
        for(int j=1; j<=spaces; j++) {
            System.out.print(" ");
        }
    }
}
