import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Prb1019 {
    public static void main(String[] args) {
        String dna1 = new String();
        String dna2 = new String();
        int m = 0;
        int n = 0;
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            dna1 = in.readLine();
            dna2 = in.readLine();
            m = dna1.length();
            n = dna2.length();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(longestCommongSubDNA(dna1, dna2, m, n));
    }

    private static String longestCommongSubDNA(String dna1, String dna2, int m, int n) {
        int max = Integer.MIN_VALUE;
        int end = 0;
        int ch[][] = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (dna1.charAt(i - 1) == dna2.charAt(j - 1)) {
                    ch[i][j] = ch[i - 1][j - 1] + 1;
                    if (ch[i][j] > max) {
                        max = ch[i][j];
                        end = i;
                    }
                }
            }
        }
        return max == 0 ? "No Match" : dna1.substring(end - max, end);
    }
}

// from : https://programming.in.th/tasks/1019