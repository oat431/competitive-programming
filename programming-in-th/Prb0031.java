import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Prb0031 {
    public static void main(String[] args) {
        String[] number = new String[3];
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            number = in.readLine().split(" ");
            in.close();
        } catch(IOException e) {
            e.printStackTrace();
        }

        int a = Integer.parseInt(number[0]);
        int b = Integer.parseInt(number[1]);
        int c = Integer.parseInt(number[2]);

        int cutCount = getCutCount(a) + getCutCount(b) + getCutCount(c);
        System.out.println(cutCount);
    }

    private static int getCutCount(int n) {
        int count = 0;
        while (n!=1) {
            count++;
            n/=2;
        }
        return count;
    }
}

// from : https://programming.in.th/tasks/0031
