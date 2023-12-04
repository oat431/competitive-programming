import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;
import java.io.BufferedReader;
import java.io.IOException;

public class Prb0038 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        Set<String> jokes = new TreeSet<>();
        for(int i=0;i<n;i++) {
            jokes.add(in.readLine());
        }
        in.close();
        jokes.forEach(System.out::println);
    }
}

// from : https://programming.in.th/tasks/0038