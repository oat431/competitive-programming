import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class CodeCube001 {
    public static void main(String[] args) {
        long a = 0L;
        long b = 0L;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            a = Long.parseLong(br.readLine());
            b = Long.parseLong(br.readLine());
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(a * b);
    }
}