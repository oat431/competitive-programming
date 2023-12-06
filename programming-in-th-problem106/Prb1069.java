import java.io.InputStreamReader;
import java.util.Stack;
import java.io.BufferedReader;
import java.io.IOException;

public class Prb1069 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException{
        Stack<Character> stack = new Stack<Character>();
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++) {
            char c = br.readLine().charAt(0);
            if(stack.empty()) {
                stack.push(c);
            } else {
                if(stack.peek() == c) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
        }
        if(stack.empty()) {
            System.out.println(stack.size());
            System.out.println("empty");
        } else {
            System.out.println(stack.size());
            while(!stack.empty()) {
                System.out.print(stack.pop());
            }
        }
    }
}

// from : https://programming.in.th/tasks/1069