package robillo.HackWithInfyTest;

import java.io.IOException;
import java.util.Scanner;

public class WholeMinuteDilemma {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int songsCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] songs = new int[songsCount];

        for (int i = 0; i < songsCount; i++) {
            int songsItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            songs[i] = songsItem;
        }

        long res = playlist(songs);

//        bufferedWriter.write(String.valueOf(res));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();

        System.out.println(res);
    }

    // Complete the playlist function below.
    static long playlist(int[] songs) {

//        HashMap<Integer, Integer> frequency = new HashMap<>();
//
//        for(int i=0; i<songs.length; i++) {
//            if(!frequency.containsKey(songs[i]))
//                frequency.put(songs[i], 0);
//
//            frequency.put(songs[i], frequency.get(songs[i]) + 1);
//        }
//
        int count = 0;
//
//        for(int i=0; i<songs.length; i++) {
//            if(frequency.get(songs[i]) != null)
//                count += frequency.get()
//        }

        for(int i=0; i<songs.length; i++) {
            int curr = songs[i];
            for(int j=0; j<songs.length; j++)
                if(j != i && (curr + songs[j])%60 == 0)
                    count++;
        }
        return count/2;
    }
}
