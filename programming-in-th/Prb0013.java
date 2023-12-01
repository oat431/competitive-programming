import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Prb0013 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int[] dwarfs = new int[9];
        for(int i = 0; i < 9; i++) {
            dwarfs[i] = Integer.parseInt(in.readLine());
        }

        int sum = 0;
        int weirdDwarf1 = 0;
        int weirdDwarf2 = 0;

        for(int i = 0; i < 9; i++) {
            sum += dwarfs[i];
        }

        for(int i = 0; i < 9; i++) {
            for(int j = i+1; j < 9; j++) {
                if(sum - dwarfs[i] - dwarfs[j] == 100) {
                    weirdDwarf1 = dwarfs[i];
                    weirdDwarf2 = dwarfs[j];
                    break;
                }
            }
        }

        for(int i = 0; i < 9; i++) {
            if(dwarfs[i] != weirdDwarf1 && dwarfs[i] != weirdDwarf2) {
                System.out.println(dwarfs[i]);
            }
        }
    }
}

// from : https://programming.in.th/tasks/0013