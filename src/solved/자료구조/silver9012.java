package solved.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//괄호
public class silver9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i<N; i++){
            Stack<Character> stack = new Stack<>();
            String str = br.readLine();
            for(int j=0; j<str.length(); j++){
                char temp = str.charAt(j);
                if(temp == '('){
                    stack.push(temp);
                }else{
                    if(stack.isEmpty()){
                        stack.push(temp);
                        break;
                    }else{
                        stack.pop();
                    }
                }
            }

            if (stack.isEmpty()){
                stringBuilder.append("YES" + "\n");
            }else{
                stringBuilder.append("NO" + "\n");
            }
        }

        System.out.println(stringBuilder);
    }
}
