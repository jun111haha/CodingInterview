package solved.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 쇠막대기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int cnt = 0;
        Stack<Character> stack = new Stack<>();
        for(int i =0; i<input.length(); i++){
            if(input.charAt(i) == '('){
                stack.push(input.charAt(i));
            }else{
                stack.pop();
                if(input.charAt(i - 1) == '('){
                    cnt += stack.size();
                }else{
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}
