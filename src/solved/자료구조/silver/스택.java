package solved.자료구조.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 스택 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int tc = Integer.parseInt(br.readLine());

        Stack<Character> stack = new Stack<>();
        for(int i=0; i<tc; i++){
            String temp = br.readLine();
            for(int j=0; j<temp.length(); j++){
                char ch = temp.charAt(j);
                if(ch == '('){
                    stack.push(ch);
                }else{
                    if(stack.isEmpty()){
                        stack.push(ch);
                        break;
                    }else{
                        stack.pop();
                    }
                }
            }

            if(stack.isEmpty()){
                sb.append("YES" + "\n");
            }else {
                sb.append("NO" + "\n");
            }
            stack.clear();
        }
        System.out.println(sb);
    }
}
