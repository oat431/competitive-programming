import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Prb0034 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] numbers = in.readLine().split(" ");
        in.close();

        int varA = Integer.parseInt(numbers[0]);
        int varB = Integer.parseInt(numbers[1]);
        int varC = Integer.parseInt(numbers[2]);

        quadeq(varA, varB, varC);

    }

    private static void quadeq(int varA, int varB, int varC) {
        for (int a=1; a<=varA; a++){
            for (int b=-Math.abs(varC); b<=Math.abs(varC); b++){
                for (int c=1; c<=varA; c++){
                    for (int d=-Math.abs(varC); d<=Math.abs(varC); d++){
                        if (checkSolution(varA, varB, varC, a, b, c, d)){
                            System.out.println(a + " " + b + " " + c + " " + d);
                            return ;
                        }
                    }
                }
            }
        }
        System.out.println("No Solution");
    }

    // A = ac, B = ad+bc, C = bd
    private static boolean checkSolution(
        int varA,
        int varB,
        int varC,
        int a,
        int b,
        int c,
        int d
    ) {
        return (a*c)==varA && (a*d)+(b*c)==varB && (b*d)==varC;
    }
}

// from : https://programming.in.th/tasks/0034