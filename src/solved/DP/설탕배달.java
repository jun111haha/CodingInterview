package solved.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 설탕배달 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        int cnt = 0;
        while (true){
            if(tc % 5 == 0){
                cnt+= cnt / 5;
                System.out.println(cnt);
                break;
            }else{
                tc =- 3;
                cnt++;
            }

            if(tc < 0){
                System.out.println(-1);
                break;
            }
        }

    }
}
