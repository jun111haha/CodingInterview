package LeetCode.Array;

public class EvenNumberofDigits {
    public static void main(String[] args) {
        int [] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }

    public static int findNumbers(int[] nums) {
        int answer = 0;
        for(int i=0; i<nums.length; i++){
            String tmp = String.valueOf(String.valueOf(nums[i]).length());
            int temp = Integer.parseInt(tmp);
            if(temp % 2 == 0){
                answer++;
            }
        }
        return answer;
    }
}
