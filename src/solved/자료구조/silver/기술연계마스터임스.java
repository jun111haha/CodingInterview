package solved.자료구조.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/*
5
S12K2
* */
public class 기술연계마스터임스 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        String str = br.readLine();
        Stack<Character> stack = new Stack<>();
        Stack<Character> stack1 = new Stack<>();

        int cnt = 0;
        for(int i=0; i<tc; i++){
            char c = str.charAt(i);
            if(c == 'S'){
                stack.push(c);
            }else if(c == 'L'){
                stack1.push(c);
            }else if(c == 'K'){
                if (!stack.isEmpty()){
                    stack.pop();
                    cnt ++;
                }else{
                    break;
                }
            }else if(c == 'R'){
                if(!stack1.isEmpty()){
                    stack.pop();
                    cnt ++;
                }else {
                    break;
                }
            }else {
                cnt ++;
            }
        }

        System.out.println(cnt);
    }
}
