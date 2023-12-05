import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Prb1002 {
    private static int I = 0;
    private static int V = 0;
    private static int X = 0;
    private static int L = 0;
    private static int C = 0;

    public static void main(String[] args) {
        int num = readInput();
        for(int i=1;i<=num;i++) {
            updateRoman(i);
        }
        System.out.println(I + " " + V + " " + X + " " + L + " " + C);
    }

    private static void updateRoman(int number) {
        if (number > 99) {
            C += number / 100;
            number %= 100;
        }
        if (number > 9) {
            if (number >= 90) {
                X++;
                C++;
                number -= 90;
            }
            if (number >= 50) {
                L++;
                X += (number - 50) / 10;
                number %= 10;
            }
            if (number >= 40) {
                L++;
                X++;
                number %= 40;
            }
            if (number > 9) {
                X += number / 10;
                number %= 10;
            }
        }
        if (number == 9) {
            X++;
            I++;
            return;
        }
        if (number >= 5) {
            V++;
            I += number - 5;
            return;
        }
        if (number == 4) {
            V++;
            I++;
            return;
        }
        I += number;
    }

    private static int readInput() {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(in.readLine());
            in.close();
            return n;
        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        }
    }
}

// from : https://programming.in.th/tasks/1002