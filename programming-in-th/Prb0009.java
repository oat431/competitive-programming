import java.util.Scanner;

public class Prb0009 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[3];

        for (int i = 0; i < 3; i++) {
            nums[i] = in.nextInt();
        }
        String strs = in.next();

        in.close();

        if(nums[0] > nums[1]) {
            int temp = nums[0];
            nums[0] = nums[1];
            nums[1] = temp;
        }

        if(nums[1] > nums[2]) {
            int temp = nums[1];
            nums[1] = nums[2];
            nums[2] = temp;
        }

        if(nums[0] > nums[1]) {
            int temp = nums[0];
            nums[0] = nums[1];
            nums[1] = temp;
        }

        for(int i = 0; i < 3; i++) {
            switch (strs.charAt(i)) {
                case 'A':
                    System.out.print(nums[0] + " ");
                    break;
                case 'B':
                    System.out.print(nums[1] + " ");
                    break;
                case 'C':
                    System.out.print(nums[2] + " ");
                    break;
            }
        }

    }
}

// from : https://programming.in.th/tasks/0008