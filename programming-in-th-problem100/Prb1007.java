import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Prb1007 {
    public static void main(String[] args) {
        String[] n = readInput();
        for(int i=0;i<n.length;i++) {
            if(!n[i].equals("-1")) {
                System.out.print(beeNumber(Integer.parseInt(n[i])));
            }
        }
    }

    private static StringBuffer beeNumber(int year) {
        int queen = 1;
        int worker = 1;
        int soldier = 0;
        int growth = 0;
        for(int i=0;i<year;i++) {
            growth = soldier;
            soldier = worker;
            worker = queen + worker + growth;
        }
        return new StringBuffer()
            .append(worker)
            .append(" ")
            .append(queen + worker + soldier)
            .append("\n");
    }


    private static String[] readInput() {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            String[] n = in.readLine().split(" ");
            in.close();
            return n;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}

// from : https://programming.in.th/tasks/1003