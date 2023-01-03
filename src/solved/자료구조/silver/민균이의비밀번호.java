package solved.자료구조.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class 민균이의비밀번호 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int tc = Integer.parseInt(br.readLine());
        ArrayList<String> list = new ArrayList<>();

        for(int i=0; i<tc; i++){
            String str = br.readLine();
            String reverseStr = new StringBuffer(str).reverse().toString();

            if(list.contains(reverseStr) || str.equals(reverseStr)){
                sb.append(reverseStr.length() + " ");
                sb.append(reverseStr.charAt(reverseStr.length() / 2));
                break;
            }else{
                list.add(str);
            }

        }

        System.out.println(sb);
    }
}
