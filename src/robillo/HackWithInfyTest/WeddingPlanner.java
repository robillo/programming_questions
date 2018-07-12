package robillo.HackWithInfyTest;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Scanner;

public class WeddingPlanner {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        float n = scanner.nextFloat();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int m = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        float[] quantities = new float[m];
        float[] prices = new float[m];

        for (int i = 0; i < m; i++) {
            quantities[i] = scanner.nextFloat();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            prices[i] = scanner.nextFloat();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        }

        float res = weddingPlanner(n, m, quantities, prices);

//        bufferedWriter.write(String.valueOf(res));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();

        System.out.println(res);
    }

    static float weddingPlanner(float n, int m, float[] quantities, float[] prices) {

        if(n <= 0) return 0;

//        for(int i=0; i<m; i++) {
//            for(int j=i+1; j<m; j++) {
//                if(quantities[i] > quantities[j]) {
//                    float temp = quantities[i];
//                    quantities[i] = quantities[j];
//                    quantities[j] = temp;
//
//                    temp = prices[i];
//                    prices[i] = prices[j];
//                    prices[j] = temp;
//                }
//            }
//        }

        if(n > quantities[m-1] || n < quantities[0]) {
            if(m >= 2)
                return unitPrice(quantities[m-2]/10, prices[m-2], quantities[m-1]/10, prices[m-1], n/10);
            else if(m == 1)
                return prices[1];
            else return 0;
        }

        int pos = -1;
        for(int i=0; i<m; i++) {
            if(n == quantities[i]) return prices[i];

            if(n < quantities[i]) pos++;
        }

        return unitPrice(quantities[pos-1]/10, prices[pos-1], quantities[pos]/10, prices[pos], n/10);
    }

    static float unitPrice(float x1, float y1, float x2, float y2, float x) {

//        System.out.println(x1 + " " + y1 + " " + x2 + " " + y2 + " " + x);

        if(y1 == 0 && y2 != 0) return y2;
        if(y2 == 0 && y1 != 0) return y1;

        float y = ((x - x1)/(x2 - x1))*(y2 - y1) + y1;
        return roundVal(y);
    }

    static float roundVal(float val) {
        BigDecimal d = new BigDecimal(Float.toString(val));
        d = d.setScale(2, BigDecimal.ROUND_HALF_UP);
        return d.floatValue();
    }
}
