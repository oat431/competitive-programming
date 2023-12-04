import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Prb0036 {
    public static void main(String[] args) {
        int n = readInput();
        System.out.printf("%.0f",n%2==0 ? activity(n) : 2*activity(n));
    }

    private static double activity(int n) {
        return factorial(n) / (factorial(n-n/2) * factorial(n/2)) ;
    }

    private static double factorial(int n) {
        return n == 0 ? 1 : n * factorial(n-1);
    }

    private static int readInput() {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(in.readLine());
            in.close();
            return n;
        } catch(IOException e) {
            e.printStackTrace();
            return 0;
        }
    }
}

// from : https://programming.in.th/tasks/0036