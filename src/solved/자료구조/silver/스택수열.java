package solved.자료구조.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 스택수열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        boolean isCheck = false;
        int tc = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        int j = 1;
        for(int i=0; i<tc; i++){
            int N = Integer.parseInt(br.readLine());
            for(; j<=N; j++){
                stack.push(j);
                sb.append("+" + "\n");
            }

            if(stack.peek() == N){
                stack.pop();
                sb.append("-" + "\n");
            }else{
                isCheck = true;
            }
        }

        if(isCheck){
            System.out.println("NO");
        }else{
            System.out.println(sb);

        }

    }
}
