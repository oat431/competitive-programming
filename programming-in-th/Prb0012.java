import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prb0012 {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String input = in.readLine();
        in.close();

        int n = input.length();

        printOuterLine(n);
        printInnerLine(n);
        printCharacter(n, input);
        printInnerLine(n);
        printOuterLine(n);

    }

    private static void printOuterLine(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                System.out.print("..*.");
            } else {
                System.out.print("..#.");
            }
        }
        System.out.println(".");
    }

    private static void printInnerLine(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                System.out.print(".*.*");
            } else {
                System.out.print(".#.#");
            }
        }
        System.out.println(".");
    }

    private static void printCharacter(int n , String str) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || (i % 3 == 1 && i >= 4)) {
                System.out.print("*." + str.charAt(i-1) + ".");
            } else {
                System.out.print("#." + str.charAt(i-1) + ".");
            } 
        }

        if (n % 3 == 0) {
            System.out.println("*");
        } else {
            System.out.println("#");
        }
    }
}

// from : https://programming.in.th/tasks/0012