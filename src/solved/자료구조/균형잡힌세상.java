package solved.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 균형잡힌세상 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        //무한루프
        while (true){
            String input = br.readLine();
            Stack<Character> stack = new Stack<>();

            // . 만나면 종료
            if(input.equals(".")) break;

            for(int i =0; i<input.length(); i++){
                char temp = input.charAt(i);
                //여는괄호 스택에 푸쉬
                if(temp == '(' || temp == '[') {
                    stack.push(temp);
                }else if(temp == ')'){
                    //스택이 비어있으면 푸쉬후에 여는괄호가 없다는뜻이므로 break 처리
                    if(stack.isEmpty()){
                        stack.push(temp);
                        break;
                    }
                    //스택이 비어있지않거나 peek 했을때 '(' 일경우에 pop 처리 아닐경우 괄호가 안맞는경우 이므로 break 처리.
                    if(!stack.isEmpty() && stack.peek() == '('){
                        stack.pop();
                    }else{
                        break;
                    }
                //위에 분기처리와 동일.
                }else if(temp == ']'){
                    if(stack.isEmpty()){
                        stack.push(temp);
                        break;
                    }
                    if(!stack.isEmpty() && stack.peek() == '['){
                        stack.pop();
                    }else{
                        break;
                    }
                }
            }

            //스택이 비어있으면 yes
            if(stack.isEmpty()){
                sb.append("yes").append("\n");
            //스택이 비어있지않으면 no
            }else{
                sb.append("no").append("\n");
            }
        }
        System.out.println(sb);
    }
}
