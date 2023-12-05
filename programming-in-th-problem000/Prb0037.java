import java.util.Scanner;

public class Prb0037 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        // fields
        int n = in.nextInt();
        int m = in.nextInt();

        // jetpack
        int l = in.nextInt();
        int k = in.nextInt();

        // people
        int c = in.nextInt();

        int sum = 0;
        for (int i = 0; i < n * m; i++) {
            sum += in.nextInt();
        }

        double total = sum + l * c * k;
        System.out.println((int) Math.ceil(total / (double) c));

    }
}

// from : https://programming.in.th/tasks/0037