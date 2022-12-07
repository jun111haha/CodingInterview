package solved.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
* 2839 번
* 18
* */
public class 설탕배달 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        while (true){
            //5 킬로그램 봉지 일경우 5로 나눠서 떨어지면
            if(n % 5 == 0){
                cnt += n / 5;
                System.out.println(cnt);
                break;
            //3 킬로그램 봉지 일 경우?
            }else{
                n -= 3;
                cnt ++;
            }
            if(n < 0){
                System.out.println("-1");
                break;
            }
        }

    }
}
