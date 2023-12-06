import java.util.Arrays;
import java.util.Scanner;

public class Prb0032 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] number = new int[n];

        for (int i=0; i<n; i++) {
            number[i] = in.nextInt();
        }
        in.close();

        Arrays.sort(number);

        if(number[0] == 0) {
            for(int i=0;i<n;i++) {
                if(number[i] != 0) {
                    int temp = number[i];
                    number[i] = number[0];
                    number[0] = temp;
                    break;
                }
            }
        }
        
        for(int i: number) {
            System.out.print(i);
        }

    }
}

// from : https://programming.in.th/tasks/0032