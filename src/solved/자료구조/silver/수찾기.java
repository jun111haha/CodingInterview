package solved.자료구조.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 수찾기 {
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int tc1 = Integer.parseInt(br.readLine());
        arr = new int[tc1];
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");

        for(int i=0; i<tc1; i++){
            arr[i] = Integer.parseInt(st1.nextToken());
        }

        int tc2 = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        Arrays.sort(arr);
        for(int i=0; i<tc2; i++){
            int n = Integer.parseInt(st2.nextToken());
            if(binarySearch(n, 0, arr.length - 1) >= 0){
                sb.append("1" + "\n");
            }else{
                sb.append("0" + "\n");
            }
        }

        System.out.println(sb);
    }

    // 반복적 탐색 (이분탐색)
    public static int binarySearch(int key, int low, int high) {
        int mid;

        while(low <= high) {
            mid = (low + high) / 2;

            // key값이 중간 위치의 값보다 작을 경우
            if(key < arr[mid]) {
                high = mid - 1;
            }
            // key값이 중간 위치의 값보다 클 경우
            else if(key > arr[mid]) {
                low = mid + 1;
            }
            // key값과 중간 위치의 값이 같을 경우
            else {
                return mid;
            }
        }

        return -1; // 탐색 실패
    }
}
