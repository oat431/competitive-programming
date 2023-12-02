import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Prb0030 {
    public static void main(String[] args) {
        String number = new String();
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            number = in.readLine();
            in.close();
        } catch(IOException e) {
            e.printStackTrace();
        }

        int n;
        int three = 0;
        int eleven = 0;
        for (char digit : number.toCharArray()) {
            n = digit - '0';
            three = (three * 10 + n) % 3;
            eleven = (eleven * 10 + n) % 11;
        }
        System.out.println(three+ " " +eleven);
    }
}

// from : https://programming.in.th/tasks/0030