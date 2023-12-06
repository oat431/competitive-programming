import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Prb0029 {
    private static final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        String[] input = in.readLine().split(" ");;
        System.out.println(frog(Integer.parseInt(input[0]), Integer.parseInt(input[1])));
    }
    private static int frog(int x, int y) { if(y >= x) { return y%x == 0 ? (y/x) : (y/x) + 1; } return 2; }
}

// from : https://programming.in.th/tasks/0029