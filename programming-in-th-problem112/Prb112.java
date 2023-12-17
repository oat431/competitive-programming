import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.io.BufferedReader;
import java.io.IOException;

public class Prb112 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        String[] parents = new String[n];
        for(int i = 0; i < n; i++) {
            parents[i] = input.readLine();
        }
        input.close();
        for(String parent : parents) {
            System.out.println(checkValidParent(parent) ? "yes" : "no");
        }
    }

    private static boolean checkValidParent(String parents) {
        Deque<Character> stack = new ArrayDeque<Character>();

        for (char x : parents.toCharArray()) {
            if (x == '(' || x == '[' || x == '{') {
                stack.push(x);
                continue;
            }

            if (stack.isEmpty()) {
                return false;
            }

            char check;
            switch (x) {
            case ')':
                check = stack.pop();
                if (check == '{' || check == '[')
                    return false;
                break;
            case '}':
                check = stack.pop();
                if (check == '(' || check == '[')
                    return false;
                break;
            case ']':
                check = stack.pop();
                if (check == '(' || check == '{')
                    return false;
                break;
            }
        }
        return stack.isEmpty();
    }
}

// form : https://programming.in.th/tasks/1121