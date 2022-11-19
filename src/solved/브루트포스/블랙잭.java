package solved.브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 블랙잭 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int result = 0;
        //완전탐색
        for(int i =0; i< n-2; i++){
            for(int j =i+1; j< n-1; j++){
                for(int k =j+1; k< n; k++){
                    int temp = arr[i] + arr[j] + arr[k];

                    if (temp == m) {
                        System.out.println(temp);
                        return;
                    }

                    //가장 인접한 수
                    if(result < temp && temp < m){
                        result = temp;
                    }
                }
            }
        }

        System.out.println(result);
    }
}
