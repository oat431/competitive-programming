import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Prb0021 {
    public static void main(String[] args){

        String word = new String();
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            word = in.readLine();
            in.close();
        } catch(IOException e) {
            e.printStackTrace();
        }

        String newWord = new String();
        for(int i=0;i<word.length();i++) {
            if(isVowel(word.charAt(i))) {
                i+=2;
            }
            newWord += word.charAt(i);
        }

        System.out.println(newWord);

    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}

// from : https://programming.in.th/tasks/0021