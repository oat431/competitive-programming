import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Prb0008 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String input = in.readLine();
        String[] inputArr = input.split(" ");
        in.close();

        int x1 = Integer.parseInt(inputArr[0]);
        int s = Integer.parseInt(inputArr[1]);
        int x2 = 2 * s - x1;

        System.out.println(x2);
    }
}

// from : https://programming.in.th/tasks/0008