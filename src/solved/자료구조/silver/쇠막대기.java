package solved.자료구조.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 쇠막대기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        Stack<Character> stack = new Stack<>();
        int cnt = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == '('){
                stack.push(ch);
            }else{
                stack.pop();
                if(str.charAt(i - 1) == '('){ // 그 전 괄호가 열린 괄호면 레이저를 의미.
                    cnt += stack.size();
                }else{ // 그 전 괄호가 닫힌 괄호면 레이저가 아님.
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
