import java.util.Scanner;

public class Prb0020 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] score = new int[5];
        int max = 0;
        int rank = 0;
        for(int i=0;i<5;i++) {
            for(int j=0;j<4;j++) {
                score[i] += in.nextInt();
            }
            if(score[i] > max) {
                max = score[i];
                rank = i + 1;
            } 
        }
        System.out.println(rank + " " + max);
        in.close();

    }
}

// from : https://programming.in.th/tasks/0020