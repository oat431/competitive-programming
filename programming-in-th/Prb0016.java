import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Prb0016 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        String answer = in.readLine();

        int adrain = 0;
        int bruno = 0;
        int goran = 0;

        String adrainPattern = "ABC";
        String brunoPattern = "BABC";
        String goranPattern = "CCAABB";

        for(int i = 0; i < n; i++) {
            if(answer.charAt(i) == adrainPattern.charAt(i % 3)) {
                adrain++;
            }
            if(answer.charAt(i) == brunoPattern.charAt(i % 4)) {
                bruno++;
            }
            if(answer.charAt(i) == goranPattern.charAt(i % 6)) {
                goran++;
            }
        }

        int max = Math.max(Math.max(adrain, bruno), goran);
        System.out.println(max);
        if(adrain == max) {
            System.out.println("Adrian");
        }
        if(bruno == max) {
            System.out.println("Bruno");
        }
        if(goran == max) {
            System.out.println("Goran");
        }

    }
}

// from : https://programming.in.th/tasks/0016