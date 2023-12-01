import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Prb0018 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String input = in.readLine();
        String inputArr[] = input.split(" ");

        int n = Integer.parseInt(inputArr[0]);
        int k = Integer.parseInt(inputArr[1]);
        in.close();

        List<Integer> eliminate = new ArrayList<>();

        // seive of eratosthenes
        boolean isPrime[] = new boolean[n+1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for(int i=2; i <= n ; i++) {
            if(isPrime[i]) {
                eliminate.add(i);
                for(int j = i*2 ; j <= n ; j += i) {
                    if(isPrime[j]) {
                        eliminate.add(j);
                    }
                    isPrime[j] = false;
                }
            }
        }
        System.out.println(eliminate.get(k-1));

    }

}

// from : https://programming.in.th/tasks/0018