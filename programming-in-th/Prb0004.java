import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Prb0004 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String checkString = in.readLine();
        in.close();

        String upperCase = checkString.toUpperCase();
        String lowerCase = checkString.toLowerCase();

        if (checkString.equals(upperCase)) {
            System.out.println("All Capital Letter");
        } else if (checkString.equals(lowerCase)) {
            System.out.println("All Small Letter");
        } else {
            System.out.println("Mix");
        }
    }
}

// from : https://programming.in.th/tasks/0004