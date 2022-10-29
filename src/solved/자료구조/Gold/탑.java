package solved.자료구조.Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class 탑 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<int []> stack = new Stack<>();
        for(int i =1; i<=n; i++){
            /*
            * 입력 받은 높이 값이 현재 높이값 보다 낮으면 해당 탑에는 레이저가 닿을수 없음 pop 처리
            * 스택이 비어있다면 레이저가 닿을 수 있는 탑이 없다는 의미로 0을 출력
            * */
            int top = Integer.parseInt(st.nextToken());
            while (!stack.isEmpty()){
                if(stack.peek()[1] >= top){
                    System.out.print(stack.peek()[0] + " ");
                    break;
                }
                stack.pop();
            }
            if(stack.isEmpty()){
                System.out.print("0 ");
            }
            stack.push(new int[] {i, top});
        }

    }
}
