package solved.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 스택수열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int input = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int last_value = 0;

        for(int i =0; i<input; i++){
            int n = Integer.parseInt(br.readLine());

            if(n > last_value){
                for(int j = last_value + 1; j<=n; j++){
                    stack.push(j);
                    sb.append("+").append("\n");
                }
                last_value = n;
            }else{
                if(stack.peek() != n){
                    System.out.println("NO");
                    return;
                }
            }
            stack.pop();
            sb.append("-").append("\n");
        }
        System.out.println(sb);
    }
}
