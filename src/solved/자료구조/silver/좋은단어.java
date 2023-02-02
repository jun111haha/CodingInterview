package solved.자료구조.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 좋은단어 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        int cnt = 0;
        for(int i=0; i<tc; i++){
            String str = br.readLine();
            Stack<Character> stack = new Stack<>();
            for(int j=0; j<str.length(); j++){
                if(!stack.isEmpty() && str.charAt(j) == stack.peek()){
                    stack.pop();
                }else{
                    stack.push(str.charAt(j));
                }
            }

            if(stack.size() == 0){
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
