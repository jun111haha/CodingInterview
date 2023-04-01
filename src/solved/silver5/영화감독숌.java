package solved.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 영화감독숌 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int six = 666;
        int cnt = 1;

        while (cnt != N) {
            six++;

            if(String.valueOf(six).contains("666")){
                cnt++;
            }
        }

        System.out.println(six);
    }
}
