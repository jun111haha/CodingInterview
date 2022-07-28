package LeetCode.Sorting;

import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {

        int [] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
    /*
    * 조건에서 다수를 차지하는 수는 전체 배열의 반 이상 나타난다고 전제.
    * 배열을 오름차순으로 정렬하고
    * 같은수를 cnt 를 세고 길이/2 값이 크거다 같다면 배열에서 해당값이 다수를 차지한다는뜻 그값을 return
    * 다른수를 만난다면 maxCnt 에 저장하고 cnt 를 다시 1로 초기화한다.
    * */
    public static int majorityElement(int[] nums) {
        int maxCnt = 0;
        int cnt = 0;
        int ele = 0;
        Arrays.sort(nums);

        if(nums.length == 1){
            return nums[0];
        }

        for(int i =0; i<nums.length - 1; i++){
            if(nums[i] == nums[i+1]){
                cnt++;
                if(cnt >= nums.length / 2){
                    return nums[i];
                }
            }else{
                if(maxCnt < cnt){
                    maxCnt = cnt;
                    cnt = 1;
                    ele = nums[i];
                }
            }
        }

        return ele;
    }
}
