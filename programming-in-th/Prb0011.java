import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.io.BufferedReader;
import java.io.IOException;

public class Prb0011 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> mod = new HashSet<>();

        for(int i = 0; i < 10; i++) {
            mod.add(Integer.parseInt(in.readLine()) % 42);
        }
        in.close();

        System.out.println(mod.size());
    }
}

// from : https://programming.in.th/tasks/0011