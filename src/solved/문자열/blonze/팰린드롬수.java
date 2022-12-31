package solved.문자열.blonze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 팰린드롬수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            String str = br.readLine();
            int n = Integer.parseInt(str);
            if(n != 0){
                String reverseStr = new StringBuffer(str).reverse().toString();
                if(reverseStr.equals(str)){
                    System.out.println("yes");
                }else{
                    System.out.println("no");
                }
            }else{
                return;
            }

        }
    }
}

