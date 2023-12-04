import java.util.Scanner;

public class Prb0001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int assignment = in.nextInt();
        int midterm = in.nextInt();
        int finalExam = in.nextInt();
        int total = assignment + midterm + finalExam;
        if (total >= 80 && total <= 100) {
            System.out.println("A");
        } else if (total >= 75 && total < 80) {
            System.out.println("B+");
        } else if (total >= 70 && total < 75) {
            System.out.println("B");
        } else if (total >= 65 && total < 70) {
            System.out.println("C+");
        } else if (total >= 60 && total < 65) {
            System.out.println("C");
        } else if (total >= 55 && total < 60) {
            System.out.println("D+");
        } else if (total >= 50 && total < 55) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
        in.close();
    }
}

// problem from : https://programming.in.th/tasks/0001