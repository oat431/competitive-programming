import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Prb1035 {
    public static void main(String[] args) {
        int n = readInput();
        while(!isPalindrome(n) || !isPrime(n)) {
            n++;
        }
        System.out.println(n);
    }

    private static boolean isPrime(int n) {
        if(n<=1){
            return false;
        } 
        for(int i=2;i*i<=n;i++) {
            if(n%i==0) return false;
        }
        return true;
    }

    private static boolean isPalindrome(int n) {
        String s = Integer.toString(n);
        int first = 0;
        int last = s.length()-1;
        while(first<last) {
            if(s.charAt(first)!=s.charAt(last)) {
                return false;
            } 
            first++;
            last--;
        }
        return true;
    }

    private static int readInput() {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            return Integer.parseInt(in.readLine());
        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        }
    }
}

// from : https://programming.in.th/tasks/1035