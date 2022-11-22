package solved.브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
* 1436 번
* 예제 입력 : 2
* */
public class 영화감독숌 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int six = 666;
        int cnt = 1;
        while (cnt != n){
            six++;

            if(String.valueOf(six).contains("666")){
                cnt++;
            }
        }
        System.out.println(six);
    }
}
