package recursion_java;

import java.util.Scanner;

public class XToPowerN {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = in.nextInt();

        System.out.println(power(3, 4));
    }

    public static int power(int x, int n) {
        if(n == 0)
            return 1;
        return x * power(x, n-1);
    }
}
