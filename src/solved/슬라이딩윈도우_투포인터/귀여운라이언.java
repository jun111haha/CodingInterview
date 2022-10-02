package solved.슬라이딩윈도우_투포인터;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 귀여운라이언 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int [] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i =0; i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int answer = Integer.MAX_VALUE;
        int cnt = 0, lt = 0, rt = 0;
        /*
        * tow pointer 기법
        * */
        while (lt <= rt && rt <= arr.length){
            if(cnt < m){
                if(rt == arr.length){
                    break;
                }
                if(arr[rt] == 1){
                    cnt++;
                }
                rt++;
            }else{
                answer = Math.min(answer, rt - lt);
                if(arr[lt] == 1){
                    cnt--;
                }
                lt++;
            }
        }
        if(answer == Integer.MAX_VALUE){
            System.out.println("-1");
        }else{
            System.out.println(answer);
        }
    }
}
