import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Prb0040 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        char[] isOddPrime = new char[n];
        for(int i = 0 ; i < n ; i ++ ) {
            String num = input.readLine();
            int lastdigit = num.charAt(num.length() - 1) - '0';
            if(num.equals("2") || lastdigit % 2 == 1) {
                isOddPrime[i] = 'T';
            } else {
                isOddPrime[i] = 'F';
            }
        }
        for(char c : isOddPrime) {
            System.out.println(c);
        }
    }
}

// from : https://programming.in.th/tasks/0040
