package solved.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
* 26
* */
public class 더하기사이클 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        int copy = tc;
        int cnt = 0;

        while (true){
            int left = copy / 10; // 첫째자리수 2
            int right = copy % 10; // 마지막자리수 6

            copy = right * 10 + (left + right) % 10; // 8
            cnt ++;
            if (copy == tc){
                break;
            }
        }
        System.out.println(cnt);
    }
}
