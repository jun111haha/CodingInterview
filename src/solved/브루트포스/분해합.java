package solved.브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 분해합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int result = 0;
        for(int i =0; i<n; i++){
            int number = i;
            int sum = 0;

            //각 숫자 자릿수 sum 에 다 더해주기
            while (number != 0){
                sum += number % 10;
                number = number / 10;
            }

            if(sum + i == n){
                result = i;
                break;
            }
        }

        System.out.println(result);
    }
}
