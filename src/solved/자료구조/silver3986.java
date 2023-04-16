package solved.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//좋은단어
public class silver3986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        Stack<Character> stack = new Stack<>();
        for(int i=0; i<N; i++){
            String str = br.readLine();
            for(int j=0; j<str.length(); j++){
                if(!stack.isEmpty() && stack.peek() == str.charAt(j)){
                    stack.pop();
                }else{
                    stack.push(str.charAt(j));
                }
            }
            if(stack.isEmpty()){
                cnt++;
            }
            stack.clear();
        }
        System.out.println(cnt);
    }
}
