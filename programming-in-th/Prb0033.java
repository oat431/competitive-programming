import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Prb0033 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());

        Map<Integer, Integer> map = new HashMap<>();
        String[] numbers = in.readLine().split(" ");

        for(int i=0; i<n; i++) {
            int num = Integer.parseInt(numbers[i]);
            if(map.containsKey(num)) {
                map.put(num, map.get(num)+1);
            } else {
                map.put(num, 1);
            }
        }
        in.close();

        final int MAX_LIKE = map.values().stream().max(Integer::compare).get();
        map.keySet()
            .stream()
            .filter(i -> map.get(i) == MAX_LIKE).collect(Collectors.toList())
            .stream().sorted().forEach(
                i -> System.out.print(i + " ")
            );
    }
}

// from : https://programming.in.th/tasks/0033