import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.io.BufferedReader;
import java.io.IOException;

public class Prb0042 {
    public static void main(String[] args) {
        int n;
        int[] fpt;
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            n = Integer.parseInt(input.readLine());
            fpt = new int[n];
            for(int i = 0 ; i < n ; i ++ ) {
                fpt[i] = Integer.parseInt(input.readLine());
            }
        } catch(IOException e) {
            e.printStackTrace();
            return;
        }
        BigDecimal two = new BigDecimal(2);
        for(int i=0;i<n;i++) {
            StringBuffer sb = new StringBuffer(
                two.pow(fpt[i]).toString()
            );
            System.out.println(sb);
        }
    }
}

// from : https://programming.in.th/tasks/0042