import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.io.BufferedReader;
import java.io.IOException;

public class Prb0025 {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String num1 = in.readLine();
        String symbol = in.readLine();
        String num2 = in.readLine();
        in.close();

        BigDecimal bd1 = new BigDecimal(num1);
        BigDecimal bd2 = new BigDecimal(num2);

        switch(symbol) {
            case "+":
                System.out.println(bd1.add(bd2));
                break;
            case "*":
                System.out.println(bd1.multiply(bd2));
                break;
        }
    }
}

// from : https://programming.in.th/tasks/0025