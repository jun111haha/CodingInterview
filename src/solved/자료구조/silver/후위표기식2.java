package solved.자료구조.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Stack;

/*
5
ABC*+DE/-
1
2
3
4
5
* */
public class 후위표기식2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        String str = br.readLine();
        HashMap<Character, Double> hashMap = new HashMap<>();
        Stack<Double> stack = new Stack<>();

        char ch = 'A';
        for(int i=0; i<tc; i++){
            double temp = Double.parseDouble(br.readLine());
            hashMap.put(ch, temp);
            ch++;
        }

        for(int i=0; i<str.length(); i++){
            if(Character.isAlphabetic(str.charAt(i))){
                stack.push(hashMap.get(str.charAt(i)));
            }else{
                double d1 = stack.pop();
                double d2 = stack.pop();

                switch (str.charAt(i)){
                    case '+' :
                        stack.push(d2 + d1);
                        break;
                    case '-' :
                        stack.push(d2 - d1);
                        break;
                    case '*' :
                        stack.push(d2 * d1);
                        break;
                    case '/' :
                        stack.push(d2 / d1);
                        break;
                }
            }
        }
        System.out.printf("%.2f", stack.pop()); //6.20
    }
}
