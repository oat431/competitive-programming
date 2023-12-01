import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Prb0017 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 4; i++) {
            list.add(in.nextInt());
        }
        in.close();
        Collections.sort(list);
        System.out.println(list.get(0) * list.get(2));
    }
}

// from : https://programming.in.th/tasks/0017