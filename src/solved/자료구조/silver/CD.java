package solved.자료구조.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
* 투포인터로 해결 다른거는 HashSet 으로 풀면 33% 에서 자꾸 멈춤
3 3
1
2
3
1
2
4
0 0
* */
public class CD {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            if (n == 0 && m == 0){
                break;
            }

            int[] arr_n = new int[n];
            int[] arr_m = new int[m];
            for (int i =0; i<n; i++) {
                arr_n[i] = Integer.parseInt(br.readLine());
            }
            for (int i =0; i<m; i++) {
                arr_m[i] = Integer.parseInt(br.readLine());
            }

            int count_n = 0, count_m = 0, answer = 0;
            while (count_n < n && count_m < m) {
                if (arr_n[count_n] > arr_m[count_m])
                    count_m++;
                else if (arr_n[count_n] < arr_m[count_m])
                    count_n++;
                else {
                    answer++;
                    count_m++;
                    count_n++;
                }
            }

            System.out.println(count_n);
            System.out.println(count_m);
            System.out.println(answer);
        }
    }
}
