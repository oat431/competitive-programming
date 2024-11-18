import java.util.Scanner;

public class Prb1005 {
    private static final Scanner in = new Scanner(System.in);

    private static int[] findMaxSum(int[] num) {
        int mSum = 0;
        int start = 0;
        int end = 0;
        for (int i = 0; i < num.length; i++) {
            int sum = 0;
            for (int j = i; j < num.length; j++) {
                sum += num[j];
                if (mSum < sum) {
                    mSum = sum;
                    start = i;
                    end = j;
                }
            }
        }
        return new int[] { mSum, start, end };
    }

    private static void programming1005MaxSeq(int[] num, int maxSeq, int startSeq, int endSeq) {
        if (maxSeq <= 0) {
            System.out.println("Empty sequence");
            return;
        }
        for (int i = startSeq; i <= endSeq; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
        System.out.println(maxSeq);
    }

    private static int[] prepareInput() {
        int n = in.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = in.nextInt();
        }
        return num;
    }

    public static void main(String[] args) {
        int[] num = prepareInput();
        int[] res = findMaxSum(num);
        programming1005MaxSeq(num, res[0], res[1], res[2]);
    }
}
