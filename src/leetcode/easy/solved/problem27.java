package leetcode.easy.solved;

public class problem27 {
    public static void main(String[] args) {
        problem27 problem27 = new problem27();
        System.out.println(problem27.removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));
    }

    public int removeElement(int[] nums, int val) {
        int idx = 0;
        if(nums.length < 1) return idx;

        for(int i=0; i<nums.length; i++){
            int temp = nums[i];
            if(temp != val){
                nums[idx] = temp;
                idx++;
            }else{
                continue;
            }
        }

        return idx;
    }
}
