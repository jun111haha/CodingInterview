package Programmers;

import java.util.Stack;

public class 같은숫자는싫어 {
    public static void main(String[] args) {
        int [] arr = {1,1,3,3,0,1,1};
        for(int i : solution(arr)) System.out.println(i);
    }

    /*
    * 정확성: 71.9
    * 효율성: 28.1
    * 합계: 100.0 / 100.0
    * 스택 활용 문제 stack 에 arr 첫번째 항목을 넣어준다
    * peek() : 스택의 제일 위에 값을 반환(마지막에 들어간 값) 하여 arr[i] 와 같지 않으면 스택에 add
    * */
    public static int[] solution(int[] arr) {
        int [] answer = {};
        Stack<Integer> stack = new Stack<>();

        stack.add(arr[0]);
        for(int i =1; i<arr.length; i++){
            if(stack.peek() != arr[i])
                stack.add(arr[i]);
        }

        answer = new int[stack.size()];
        for(int j =0; j<stack.size(); j++){
            answer[j] = stack.get(j);
        }

        return answer;
    }

}
