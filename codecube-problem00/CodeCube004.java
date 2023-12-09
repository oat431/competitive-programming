import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class CodeCube0004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] arr = new int[n];
        br.close();
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        int totalBrick = arr[0];
        int minBrick = arr[0];
        for(int i = 1; i < n; i++) {
            totalBrick += arr[i];
            minBrick = gcd(minBrick, arr[i]);
        }

        System.out.println(totalBrick / minBrick);
    }

    private static int gcd(int a, int b) {
        return a == 0 ? b : gcd(b % a, a);
    }
}

// from : https://programming.in.th/tasks/codecube_004