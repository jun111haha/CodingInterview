package solved.자료구조.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 암기왕 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int tc = Integer.parseInt(br.readLine());

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        int M = Integer.parseInt(br.readLine());

        HashSet<Integer> hashSet = new HashSet<>();
        for(int i=0; i<N; i++){
            int temp = Integer.parseInt(st1.nextToken());
            hashSet.add(temp);
        }

        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<M; i++){
            int temp = Integer.parseInt(st2.nextToken());
            if(hashSet.contains(temp)){
                sb.append("1" + "\n");
            }else{
                sb.append("0" + "\n");
            }
        }

        System.out.println(sb);
    }

//    // 반복적 탐색 (이분탐색)
//    public static int binarySearch(int key, int low, int high, int[] arr) {
//        int mid;
//
//        while(low <= high) {
//            mid = (low + high) / 2;
//
//            if(key < arr[mid]) { // key값이 중간 위치의 값보다 작을 경우
//                high = mid - 1;
//            } else if(key > arr[mid]) { // key값이 중간 위치의 값보다 클 경우
//                low = mid + 1;
//            } else {             // key값과 중간 위치의 값이 같을 경우
//                return mid;
//            }
//        }
//
//        return -1; // 탐색 실패
//    }

}
