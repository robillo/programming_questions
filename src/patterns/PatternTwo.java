package patterns;

public class PatternTwo {

    static int n;

    public static void main(String[] args) {

        n = 4;

        for(int i=0; i<n; i++) {
            printStarUpper(i);
            printSpace();
            printMiddle(i);
            printSpace();
            printStarUpper(i);
            System.out.println();
        }
    }

    private static void printStarUpper(int num) {
        for(int j=0; j<=num; j++) System.out.print("*");
    }

    private static void printSpace() {
        System.out.print(" ");
    }

    private static void printMiddle(int num) {
        for(int i= 2*(3-num); i>=0; i--) {
            System.out.print("*");
        }
    }
}
