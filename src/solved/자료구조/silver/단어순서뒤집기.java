package solved.자료구조.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 단어순서뒤집기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int tc = Integer.parseInt(br.readLine());

        for(int i=0; i<tc; i++){
            String str = br.readLine();
            String [] tempArr = str.split(" ");
            sb.append("Case #" + (i + 1) + ": ");

            for(int j=tempArr.length-1; j>=0; j--){
                sb.append(tempArr[j] + " ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
