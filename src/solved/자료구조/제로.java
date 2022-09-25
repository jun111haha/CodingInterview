package solved.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 제로 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        for(int i =0; i<input; i++){
            int n = Integer.parseInt(br.readLine());
            if(n == 0){
                stack.pop();
            }else{
                stack.push(n);
            }
        }
        for(int i : stack){
            sum += i;
        }
        System.out.println(sum);
    }
}
