import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Prb0015 {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String input = in.readLine();
        String[] str = input.split(" ");
        in.close();

        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        int c = Integer.parseInt(str[2]);

        int fwJump = c - b - 1;
        int bwJump = b - a - 1;

        System.out.println(Math.max(fwJump, bwJump));
    }
}

// from : https://programming.in.th/tasks/0015