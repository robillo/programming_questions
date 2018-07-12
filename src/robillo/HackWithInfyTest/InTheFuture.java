package robillo.HackWithInfyTest;

import java.io.IOException;
import java.util.Scanner;

public class InTheFuture {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int A = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int K = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int P = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int res = minNum(A, K, P);

//        bufferedWriter.write(String.valueOf(res));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();

        System.out.println(res);
    }

    // Complete the minNum function below.
    static int minNum(int A, int K, int P) {

        int n = K-A;
        if(n == 0) return 0;
        return P/n + 1;

//        int n = K%A;
//        if(n == 0) return P/(K/A) + 2;
//        return P/n + 1;

//        int count = 0;
//        while (P >= 0) {
//            P-=Math.abs(A-K);
//            count+=1;
//        }
//        return count;
    }
}
