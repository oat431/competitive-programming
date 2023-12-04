import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Prb1003 {
    private static boolean[] nugget = new boolean[121];
    private static StringBuffer sb = new StringBuffer();
    public static void main(String[] args) {
        int n = readInput();
        nugget = genNugget(n);
        System.out.println(nuggetNumber(n).toString());
    }

    private static StringBuffer nuggetNumber(int n) {
        if(n < 6) {
            sb.append("no");
        } 
        for(int i=6;i<=n;i++) {
            if(nugget[i]) {
                nugget[i+6] = nugget[i+9] = nugget[i+20] = true;
                sb.append(i).append("\n");
            }
        }
        return sb;
    }

    private static boolean[] genNugget(int n) {
        nugget[6] = nugget[9] = nugget[20] = true;
        for(int i=6;i<=n;i++) {
            if(nugget[i]) {
                nugget[i+6] = nugget[i+9] = nugget[i+20] = true;
            }
        }
        return nugget;
    }

    private static int readInput() {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(in.readLine());
            in.close();
            return n;
        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        }
    }
}

// from : https://programming.in.th/tasks/1003
