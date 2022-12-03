package solved.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 단어뒤집기2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        boolean isCheck = false;
        Stack<Character> stack = new Stack<>();
        String str = br.readLine();
        for(int i =0; i<str.length(); i++){
            if(str.charAt(i) == '<'){
                // 꺽새 안에 속하지않는 문자열 sb 에 추가
                while (!stack.isEmpty()){
                    sb.append(stack.pop());
                }
                isCheck = true;
            }else if(str.charAt(i) == '>'){
                isCheck = false;
                sb.append(str.charAt(i));
                continue;
            }

            if(isCheck){
                sb.append(str.charAt(i));
            }else{
                if (str.charAt(i) == ' ') {
                    // 공백전에 문자열 sb 에 추가
                    while (!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                    sb.append(' ');
                    continue;
                } else {
                    stack.push(str.charAt(i));
                }
            }
        }

        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }

        System.out.println(sb);
    }
}
