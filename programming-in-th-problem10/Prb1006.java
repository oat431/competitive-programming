import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Dice {
    int top = 1;
    int bottom = 6;
    int left = 3;
    int right = 4;
    int front = 2;
    int back = 5;

    public void x_roll(int a, int b, int c, int d) {
        this.front = a;
        this.bottom = b;
        this.back = c;
        this.top = d;
    }

    public void y_roll(int a, int b, int c, int d) {
        this.top = a;
        this.left = b;
        this.bottom = c;
        this.right = d;
    }

    public void z_roll(int a, int b, int c, int d) {
        this.front = a;
        this.left = b;
        this.back = c;
        this.right = d;
    }

    public int get_front() {
        return this.front;
    }
}

public class Prb1006 {
    public static void main(String[] args) {
        String[] pattern = readInput();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < pattern.length; i++) {
            sb.append(rollDice(new Dice(), pattern[i])).append(" ");
        }
        System.out.println(sb.toString());
    }

    private static String[] readInput() {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(in.readLine());
            String[] pattern = new String[n];
            for (int i = 0; i < n; i++) {
                pattern[i] = in.readLine();
            }
            in.close();
            return pattern;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static int rollDice(Dice dice, String pattern) {
        for (char i : pattern.toCharArray()) {
            switch (i) {
                case 'F':
                    dice.x_roll(dice.top, dice.front, dice.bottom, dice.back);
                    break;
                case 'B':
                    dice.x_roll(dice.bottom, dice.back, dice.top, dice.front);
                    break;
                case 'L':
                    dice.y_roll(dice.right, dice.top, dice.left, dice.bottom);
                    break;
                case 'R':
                    dice.y_roll(dice.left, dice.bottom, dice.right, dice.top);
                    break;
                case 'C':
                    dice.z_roll(dice.right, dice.front, dice.left, dice.back);
                    break;
                case 'D':
                    dice.z_roll(dice.left, dice.back, dice.right, dice.front);
                    break;
            }
        }
        return dice.get_front();
    }
}

// // from : https://programming.in.th/tasks/1006