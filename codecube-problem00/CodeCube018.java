import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class CodeCube018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<Integer>();

        for(int i = 0; i < n; i++) {
            arr.add(sc.nextInt()) ;
        }
        sc.close();

        int max = arr.stream().max(Integer::compare).get();
        int min = arr.stream().min(Integer::compare).get();

        System.out.println(max);
        System.out.println(min);
    }
}

// from : https://programming.in.th/tasks/codecube_018