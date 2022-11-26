package solved.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 피보나치함수 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int n = Integer.parseInt(br.readLine());

        int [] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int [] zero = new int[41];
        int [] one = new int[41];

        zero[0] = 0;
        zero[1] = 1;
        one[0] = 1;
        one[1] = 0;
        for(int i =2; i<41; i++){
            zero[i] = zero[i - 1] + zero[i - 2];
            one[i]= one[i - 1] + one[i - 2];
        }

        for(int i =0; i<n; i++){
            sb.append(zero[arr[i]] + " " + one[arr[i]] + "\n");
        }
        System.out.println(sb);
    }

}
