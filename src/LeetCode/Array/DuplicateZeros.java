package LeetCode.Array;

public class DuplicateZeros {
    public static void main(String[] args) {
        int [] arr = {1,0,2,3,0,4,5,0};
        duplicateZeros(arr);
    }
    /*
    * 추가배열을 사용하면 안되고, 배열을 덮어써야하기 때문에 마지막 인덱스부터 시작
    * cnt 는 쉬프트 횟수와 같음 arr[i + cnt] = arr[i] 로 값을 갱신해줍니다.
    * 단 , i + cnt 인덱스가 배열의 길이보다 작아야 합니다.
    * arr[i] 가 0 이라면 그 즉시 arr[i + cnt] 에 0을 넣고 인덱스를 하나 당겨준다.
    * 시간복잡도 O(n)
    * */
    public static void duplicateZeros(int[] arr) {
        int cnt = 0;

        for(int i : arr){
            if(i == 0) cnt++;
        }

        int n = arr.length;
        for(int i = n -1; i >= 0; i--){
            int j = i + cnt;

            if(arr[i] == 0){
                if(j < n) {
                    arr[j] = 0;
                }
                cnt--;
                j--;
            }

            if(j < n) arr[j] = arr[i];
        }

//        int[] source = arr.clone();
//
//        int i = 0;
//        for(int v : source) {
//            if (i == arr.length) break;
//            arr[i++] = v;
//            if (i == arr.length) break;
//            if (v == 0) {
//                arr[i++] = 0;
//            }
//        }
    }
}
