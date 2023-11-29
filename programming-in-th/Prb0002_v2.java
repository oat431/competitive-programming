import java.util.List;
import java.util.ArrayList;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Prb0002_v2 {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(in.readLine());
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < m; i++) {
            int num = Integer.parseInt(in.readLine());
            list.add(num);
        }
        in.close();

        int min = list.stream().min(Integer::compare).get();
        int max = list.stream().max(Integer::compare).get();

        System.out.println(min);
        System.out.println(max);
    }
}

// problem from : https://programming.in.th/tasks/0002