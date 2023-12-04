import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Prb0041 {
    public static void main(String[] args) {
        System.out.println(circlePack(readInput()));
    }

    private static String circlePack(int n) {
        return switch (n) {
            case 1 -> String.format("%.6f", 2.0);
            case 3 -> String.format("%.6f", 2 + Math.sqrt(3));
            default -> String.format("%.6f", n%2==0 ? n : n + 0.464102);
        };
    }

    private static int readInput() {
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            return Integer.parseInt(input.readLine());
        } catch(IOException e) {
            e.printStackTrace();
            return -1;
        }
    }
}

// from : https://programming.in.th/tasks/0041