import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Prb0010 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String input = in.readLine();
        in.close();

        String pos = "1";

        for(int i = 0; i < input.length(); i++) {
            switch (input.charAt(i)) {
                case 'A':
                    if(pos.equals("1")) {
                        pos = "2";
                    } else if(pos.equals("2")) {
                        pos = "1";
                    }
                    break;
                case 'B':
                    if(pos.equals("2")) {
                        pos = "3";
                    } else if(pos.equals("3")) {
                        pos = "2";
                    }
                    break;
                case 'C':
                    if(pos.equals("1")) {
                        pos = "3";
                    } else if(pos.equals("3")) {
                        pos = "1";
                    }
                    break;
            }
        }
        System.out.println(pos);
    }
}

// from : https://programming.in.th/tasks/0010