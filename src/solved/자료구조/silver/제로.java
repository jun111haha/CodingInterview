package solved.자료구조.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 제로 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        for(int i=0; i<tc; i++){
            int temp = Integer.parseInt(br.readLine());
            if(temp != 0){
                stack.push(temp);
            }else{
                stack.pop();
            }
        }

        for(int i : stack){
            sum += i;
        }
        System.out.println();
    }
}
