import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Prb0014 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String input = in.readLine();
        in.close();
        String[] str = input.split(" ");
        
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);

        System.out.println(greatCommonDivisor(a,b));

    }

    private static int greatCommonDivisor(int a,int b){ 
        if (b == 0) {
            return a;
        } else {
            return greatCommonDivisor(b, a % b);
        }
    }
}

// from : https://programming.in.th/tasks/0014