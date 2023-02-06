package solved.자료구조.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 균형잡힌세상 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true){
            String input = br.readLine();
            Stack<Character> stack = new Stack<>();
            if(input.equals(".")) {
                break;
            }

            for(int i=0; i<input.length(); i++){
                char ch = input.charAt(i);
                if(ch == '(' || ch == '['){
                    stack.push(ch);
                }else if(ch == ')'){
                    if(stack.isEmpty()){
                        stack.push(ch);
                        break;
                    }
                    if(!stack.isEmpty() && stack.peek() == '('){
                        stack.pop();
                    }else{
                        break;
                    }
                }else if(ch == ']'){
                    if(stack.isEmpty()){
                        stack.push(ch);
                        break;
                    }
                    if(!stack.isEmpty() && stack.peek() == '['){
                        stack.pop();
                    }else{
                        break;
                    }
                }
            }

            if(stack.isEmpty()){
                sb.append("yes" + "\n");
            }else{
                sb.append("no" + "\n");
            }
        }

        System.out.println(sb);
    }
}
