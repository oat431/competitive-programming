import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prb1017 {
    private static final Scanner br = new Scanner(System.in);
    private static int[][] mSquare;
    private static int num;
    public static void main(String[] args) {
        num = br.nextInt();
        mSquare = new int[num][num];

        for(int i=0;i<num;i++) {
            for(int j=0;j<num;j++) {
                mSquare[i][j] = br.nextInt();
            }
        }

        System.out.println(isMagicSquare() ? "Yes" : "No");
    }

    private static boolean isMagicSquare() {
        if(isDuplicate()) {
            return false;
        }
        int checkRow = sumRow();
        int checkCol = sumCol();
        int checkDownDia = sumDownDia();
        int checkUpDia = sumUpDia();
        return checkRow == checkCol && checkCol == checkDownDia && checkDownDia == checkUpDia;
    }

    private static int sumRow() {
        int sum[] = new int[num];
        for(int i=0;i<num;i++) {
            for(int j=0;j<num;j++) {
                sum[i] += mSquare[i][j];
            }
        }
        return checkSumArray(sum) ? sum[0] : -1;     
    }


    private static int sumCol() {
        int sum[] = new int[num];
        for(int i=0;i<num;i++) {
            for(int j=0;j<num;j++) {
                sum[i] += mSquare[j][i];
            }
        }
        return checkSumArray(sum) ? sum[0] : -1;     
    }

    private static int sumDownDia() {
        int sum = 0;
        for(int i=0;i<num;i++) {
            sum += mSquare[i][i];
        }
        return sum;
    }

    private static int sumUpDia() {
        int sum = 0;
        for(int i=0;i<num;i++) {
            sum += mSquare[i][num-i-1];
        }
        return sum;
    }

    private static boolean checkSumArray(int[] sum) {
        for(int i=0;i<num-1;i++) {
            if (sum[i] != sum[i+1]) {
                return false;
            }
        }
        return true;
    }

    private static boolean isDuplicate() {
        List<Integer> set = new ArrayList<>();
        for(int i=0;i<num;i++) {
            for(int j=0;j<num;j++) {
                if (set.contains(mSquare[i][j])) {
                    return true;
                }
                set.add(mSquare[i][j]);
            }
        }
        return false;
    }
}

// from : https://programming.in.th/tasks/1017