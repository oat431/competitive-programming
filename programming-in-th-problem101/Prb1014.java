import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prb1014 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] input = in.readLine().split(" ");
        int w = Integer.parseInt(input[0]);
        int h = Integer.parseInt(input[1]);
        int n = Integer.parseInt(input[2]);

        char[] filter = new char[w];
        Arrays.fill(filter, 'O');

        for(int i=0;i<n;i++) {
            String[] curtain = in.readLine().split(" ");
            int x = Integer.parseInt(curtain[0]);
            int a = Integer.parseInt(curtain[1]);
            int xa = (x+a-1) >= w ? w-1 : x+a-1;
            for(int j=x;j<=xa;j++) {
                filter[j] = filterLight(filter[j]);
            }
        }
        in.close();

        List<Character> filterList = new ArrayList<>();
        for(char c : filter) {
            filterList.add(c);
        }


        long light100 = calLight(h, filterList, 'O');
        long light50 = calLight(h, filterList, '#');

        System.out.println(light100 + " " + light50);
    }

    // O 100% light ; # 50% light ; X 0% light
    private static char filterLight(char c) {
        return c == 'O' ? '#' : 'X';
    }

    private static long calLight(int h, List<Character> filter, char light) {
        return h * filter.stream().filter(c -> c == light).count();
    }

}

// from : https://programming.in.th/tasks/1014