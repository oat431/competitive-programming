import java.util.Scanner; 
public class Prb0019 {
    private static int n;
    private static int[] s;
    private static int[] b;
    private static int best = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        s = new int[n];
        b = new int[n];

        for(int i = 0; i < n; i++) {
            s[i] = in.nextInt();
            b[i] = in.nextInt();
        }
        in.close();

        perket(0, 1, 0);
        System.out.println(best);
    }

    private static int diff(int x, int y) {
        return x < y ? y - x : x - y;
    }

    private static void perket(int i, int sour, int bitt) {
        if(i == n) {
            if(bitt > 0 && diff(sour, bitt) < best) {
                best = diff(sour, bitt);
            }
            return;
        }
        perket(i+1, sour, bitt);
        perket(i+1, sour * s[i], bitt + b[i]);
    }
}

// from : https://programming.in.th/tasks/0019