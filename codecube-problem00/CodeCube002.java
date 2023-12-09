import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class CodeCube002 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            a = Integer.parseInt(br.readLine());
            b = Integer.parseInt(br.readLine());
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(gcd(a, b));

    }

    private static int gcd(int a, int b) {
        return a == 0 ? b : gcd(b % a, a);
    }
}

// from : https://programming.in.th/tasks/codecube_002