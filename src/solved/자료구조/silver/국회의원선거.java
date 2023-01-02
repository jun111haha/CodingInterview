package solved.자료구조.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 국회의원선거 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int tc = Integer.parseInt(br.readLine());
        int[] arr = new int[tc];

        for(int i=0; i<tc; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int answer = 0;
        while (true){
            int max = 0;
            for(int i=0; i<tc; i++) {
                if (arr[i] >= arr[max]) {
                    max = i;
                }
            }

            if(max == 0){
                break;
            }

            arr[0]++;
            arr[max]--;
            answer++;

        }
        System.out.println(answer);
    }
}
