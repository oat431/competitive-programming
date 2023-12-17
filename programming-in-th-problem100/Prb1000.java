import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Prb1000 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        // word length
        int wl = Integer.parseInt(in.readLine());
        int n = Integer.parseInt(in.readLine());
        String[] words = new String[n];
        for(int i=0;i<n;i++) {
            words[i] = in.readLine();
        }
        in.close();

        System.out.println(wordChain(words, wl));
    }

    private static String wordChain(String[] words, int wl) {
        String chkWord = words[0];
        for(String word : words) {
            if(word.equals(chkWord)) {
                continue;
            }
            int diff = 0;
            for(int i=0;i<wl;i++) {
                if (chkWord.charAt(i) != word.charAt(i)) {
                    diff++;
                }
                if(diff > 2) {
                    break;
                }
            }
            if(diff <= 2) {
                chkWord = word;
            } else {
                break;
            }
        }
        return chkWord;
    }
}

// from : https://programming.in.th/tasks/1000