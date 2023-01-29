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
            String str = br.readLine();
            Stack<Character> stack = new Stack<>();
            if(str.equals(".")){
                break;
            }

            for(int i=0; i<str.length(); i++){
                char tempChar = str.charAt(i);
                if(tempChar == '(' || tempChar == '['){
                    stack.push(tempChar);
                }else if(tempChar == ')'){
                    if(stack.isEmpty()){
                        stack.push(tempChar);
                        break;
                    }
                    if(!stack.isEmpty() && stack.peek() == '('){
                        stack.pop();
                    }else{
                        break;
                    }

                }else if(tempChar == ']'){
                    if(stack.isEmpty()){
                        stack.push(tempChar);
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
