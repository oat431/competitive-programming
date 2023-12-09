import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeCube005 {
        public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] arr = new int[n];
        br.close();
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        long bus = arr[0];
        for(int i = 1; i < n; i++) {
            bus = bus * arr[i] / gcd(bus, arr[i]);
        }

        System.out.println(bus);
    }

    private static long gcd(long a, long b) {
        return a == 0 ? b : gcd(b % a, a);
    }
}

// from : https://programming.in.th/tasks/codecube_005