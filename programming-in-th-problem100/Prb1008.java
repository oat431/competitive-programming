import java.util.Scanner;

public class Prb1008 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] high = new int[258];
        for(int i=0;i<n;i++) {
            int l = in.nextInt();
            int h = in.nextInt();
            int r = in.nextInt();

            for(int j = l ; j< r ; j++) {
                high[j] = Math.max(high[j], h);
            }
        }

        in.close();

        for(int i=1;i<256;i++) {
            if(high[i] != high[i-1]) {
                System.out.printf("%d %d ", i, high[i]);
            }
        }
    }
}

// from : https://programming.in.th/tasks/1008
