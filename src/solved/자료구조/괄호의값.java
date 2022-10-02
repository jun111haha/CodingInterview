package solved.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 괄호의값 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = br.readLine();

        Stack<Character> stack = new Stack<>();
        int cnt = 1;
        int answer = 0;
        for(int i =0; i<input.length(); i++){
            char ch = input.charAt(i);
            if(ch == '('){
                stack.push(ch);
                cnt *= 2;
            }else if (ch == '['){
                stack.push(ch);
                cnt *= 3;
            }else if (ch == ')'){
                if(stack.isEmpty() || stack.peek() != '('){
                    answer = 0;
                    break;
                }else if(input.charAt(i - 1) == '('){
                    answer += cnt;
                }
                stack.pop();
                //괄호가 닫힐때마다 저장해준값 정리
                cnt /= 2;
            }else if (ch == ']'){
                if (stack.isEmpty() || stack.peek() != '[') {
                    answer = 0;
                    break;
                } else if (input.charAt(i - 1) == '[') {
                    answer += cnt;
                }
                stack.pop();
                //괄호가 닫힐때마다 저장해준값 정리
                cnt /= 3;
            }
        }

        if(!stack.isEmpty()){
            sb.append(0).append("\n");
        }else{
            sb.append(answer).append("\n");
        }
        System.out.println(sb);
    }
}
