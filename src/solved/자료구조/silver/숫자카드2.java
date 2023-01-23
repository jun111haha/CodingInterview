package solved.자료구조.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class 숫자카드2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<N; i++){
            int temp = Integer.parseInt(st.nextToken());
            hashMap.put(temp, hashMap.getOrDefault(temp, 0) + 1);
        }
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<M; i++){
            int temp = Integer.parseInt(st.nextToken());
            if(hashMap.containsKey(temp)){
                sb.append(hashMap.get(temp) + " ");
            }else{
                sb.append(0 + " ");
            }
        }

        System.out.println(sb);
    }

//    public static int binarySearch(int key, int low, int high){
//        int mid = 0;
//
//        while (low <= high){
//            mid = (low + high) / 2;
//
//            if(key < arr[mid]){
//                high = mid - 1;
//            }else if(arr[mid] > key){
//                low = mid + 1;
//            }else{
//                return mid;
//            }
//        }
//
//
//        return -1;
//    }
}
