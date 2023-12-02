import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Prb0022 {
    public static void main(String[] args) {
        int height = 0;
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            height = Integer.parseInt(in.readLine());
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        int length = height + height % 2 - 1;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                if (isTopPosition(i, height)) {
                    System.out.print(shouldPrintTopStar(i, j, length) ? "*" : "-");
                } else {
                    System.out.print(shouldPrintBottomStar(i, j, length, height) ? "*" : "-");
                }

            }
            System.out.println();
        }
    }

    private static boolean isTopPosition(int i, int height) {
        return i < height / 2 + height % 2;
    }

    private static boolean shouldPrintTopStar(int i, int j, int length) {
        return j == length / 2 - i || j == length / 2 + i;
    }

    private static boolean shouldPrintBottomStar(int i, int j, int length,int height) {
        return j == length / 2 - (height - i - 1) || j == length / 2 + (height - i - 1);
    }
}

// from : https://programming.in.th/tasks/0022