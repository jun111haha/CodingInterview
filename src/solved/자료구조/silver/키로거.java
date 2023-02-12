package solved.자료구조.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/*
1
<<BP<A>>Cd-
stack []
deleteStack []
stack []
deleteStack []
stack [B]
deleteStack []
stack [B, P]
deleteStack []
stack [B]
deleteStack [P]
stack [B, A]
deleteStack [P]
stack [B, A, P]
deleteStack []
stack [B, A, P]
deleteStack []
stack [B, A, P, C]
deleteStack []
stack [B, A, P, C, d]
deleteStack []
stack [B, A, P, C]
deleteStack []
* */
public class 키로거 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int tc = Integer.parseInt(br.readLine());

        Stack<Character> stack = new Stack<>();
        Stack<Character> deleteStack = new Stack<>();
        for(int i=0; i<tc; i++){
            String str = br.readLine();
            for(int j=0; j<str.length(); j++){
                char temp = str.charAt(j);
                if(temp == '-'){
                    if(!stack.isEmpty()){
                        stack.pop();
                    }
                }else if(temp == '<'){
                    if(!stack.isEmpty()){
                        deleteStack.push(stack.pop());
                    }
                }else if(temp == '>'){
                    if(!deleteStack.isEmpty()){
                        stack.push(deleteStack.pop());
                    }
                }else{
                    stack.push(temp);
                }
                System.out.println("stack " + stack);
                System.out.println("deleteStack " + deleteStack);
            }
            stack.clear();
            deleteStack.clear();;
        }
    }
}
