import java.util.Scanner;
public class Prb1012 {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int n = input.nextInt();
        double sum = 0;
        for(int i=0;i<n;i++) {
            sum += input.nextInt() * 1.0;
            sum += input.nextInt() * 0.75;
            sum += input.nextInt() * 0.5;
            sum += input.nextInt() * 0.25;
            sum += input.nextInt() * 0.125;
        }
        System.out.println((int)Math.ceil(sum));
    }
}

// from : https://programming.in.th/tasks/1012