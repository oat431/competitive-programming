import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Prb0005 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String input = in.readLine();
        String[] inputArr = input.split(" ");
        double a = Double.parseDouble(inputArr[0]);
        double b = Double.parseDouble(inputArr[1]);
        in.close();

        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.printf("%.6f", c);
    }
}

// from : https://programming.in.th/tasks/0005