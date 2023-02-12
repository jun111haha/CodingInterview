package solved.자료구조.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 단어뒤집기2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();

        Stack<Character> stack = new Stack<>();
        boolean isCheck = false;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '<'){
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
                //tag 사이에있는 문자 추가
                sb.append(str.charAt(i));
            }else{
                //문자사이에 공백구분하여 뒤집어서 추가
                if(str.charAt(i) == ' '){
                    while (!stack.isEmpty()){
                        sb.append(stack.pop());
                    }
                    sb.append(' ');
                    continue;
                }else{
                    stack.push(str.charAt(i));
                }
            }

        }

        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }
        System.out.println(stack);
        System.out.println(sb);
    }
}
