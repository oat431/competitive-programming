import java.util.Scanner;

public class Prb0033 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] number = new int[n];
		int[] like = new int[10000];
		
		for(int i=0; i<number.length; i++) {
			number[i] = in.nextInt();
			like[number[i]]++;
		}
        in.close();
		

		int max=0;
		for(int i=0; i<number.length; i++) {
			if(max<=like[number[i]]) {
				max = like[number[i]];
			}
		}
		for(int i=0; i<like.length; i++) {
			if(like[i] == max) {
				System.out.print(i+" ");
            }
		}
    }
}

// from : https://programming.in.th/tasks/0033