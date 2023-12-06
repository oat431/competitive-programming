import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Prb1025 {
    private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        long n = Long.parseLong(in.readLine());
        long answer = 1;
        for(int i=0;i<n;i++) {
            int num = Integer.parseInt(in.readLine());
            answer = lcm(answer, num);
        }
        System.out.println(answer);
    }

    private static long gcd(long a, long b) {
        return a==0 ? b : gcd(b%a, a);
    }

    private static long lcm(long a, long b) {
        return (a*b)/gcd(a,b);
    }
}

// from : https://programming.in.th/tasks/1025