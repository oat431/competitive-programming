import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Prb0007 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Integer input = Integer.parseInt(in.readLine());

        double result1 = Math.PI * Math.pow(input, 2);
        double result2 = 2 * Math.pow(input, 2);

        System.out.printf("%.6f\n", result1);
        System.out.printf("%.6f\n", result2);
    }
}
