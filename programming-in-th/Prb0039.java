import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Prb0039 {
    private static int n = 0;
    private static int[] answer;
    private static boolean[] ch;
    private static boolean[] ir;
    private static StringBuffer sb = new StringBuffer();

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(in.readLine());
        answer = new int[n + 1];
        ch = new boolean[n + 1];
        ir = new boolean[n + 1];
        int m = Integer.parseInt(in.readLine());
        String[] line = in.readLine().split(" ");
        for(int i=0;i<m;i++) {
            int x = Integer.parseInt(line[i]);
            ch[x] = true;
        }
        in.close();
        permutation(1);
        System.out.println(sb.toString());
    }

    private static void permutation(int count) {
        if(count == n + 1) {
            for(int i=1; i<=n; i++) {
                sb.append(answer[i]).append(" ");
            }
            sb.append("\n");
            return ;
        }

        for(int i=1;i<=n;i++) {
            if((ch[i] && count == 1) || ir[i]) {
                continue;
            }
            answer[count] = i;
            ir[i] = true;
            permutation(count + 1);
            ir[i] = false;
        }
    }
}

// from : https://programming.in.th/tasks/0039