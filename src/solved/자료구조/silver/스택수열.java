package solved.자료구조.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/*
8
4
3
6
8
7
5
2
1
* */
public class 스택수열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int tc = Integer.parseInt(br.readLine());

        int start = 0;
        Stack<Integer> stack = new Stack<>();
        while (tc --> 0){
            int value = Integer.parseInt(br.readLine());
            if(value > start){
                for(int i=start + 1; i<=value; i++){
                    stack.push(i);
                    sb.append("+" + "\n");
                }
                start = value;
            }else if(stack.peek() != value){
                System.out.println("NO");
                return;
            }
            stack.pop();
            sb.append("-" + "\n");
        }
        System.out.println(sb);
    }
}
