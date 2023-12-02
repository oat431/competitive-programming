import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Prb0023 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] input = in.readLine().split(" ");
        in.close();
        int day = Integer.parseInt(input[0]);
        int month = Integer.parseInt(input[1]);

        int[] dayInMonth = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
        String[] weekDay = {"Wednesday", "Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday"};

        System.out.println(weekDay[(day + dayInMonth[month-1])%7]);
    }
}

// from : https://programming.in.th/tasks/0023