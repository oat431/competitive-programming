import java.util.ArrayList;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Prb1043 {
    private static final int MXN = 10001;
    private static ArrayList<Boolean> notprime = new ArrayList<>();
    private static ArrayList<Integer> prime = new ArrayList<>();
    private static final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(in.readLine());
        sieve();

        int[] nums = new int[n];
        for(int i=0;i<n;i++) {
            nums[i] = Integer.parseInt(in.readLine());
        }

        for(int num : nums) {
            int ans = -1;
            for (int i : prime) {
                if (num % i == 0) {
                    int pf = 0;
                    while (num % i == 0) {
                        pf++;
                        num /= i;
                    }
                    ans = (ans == -1) ? pf : gcd(ans, pf);
                }
            }
            System.out.println( (num != 1 || ans == 1) ? "NO" : ans );
        }
    }

    private static void sieve() {
        for (int i = 0; i < MXN; i++) {
            notprime.add(false);
        }

        for (int i = 2; i < MXN; i++) {
            if (notprime.get(i)) {
                continue;
            }
            prime.add(i);
            for (int j = i * 2; j < MXN; j += i) {
                notprime.set(j, true);
            }
        }
    }

    private static int gcd(int a, int b) {
        return a==0 ? b : gcd(b%a, a);
    }
}

// from : https://programming.in.th/tasks/1043