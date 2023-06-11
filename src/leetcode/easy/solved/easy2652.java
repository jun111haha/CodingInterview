package leetcode.easy.solved;


public class easy2652 {
    public static void main(String[] args) {
        sumOfMultiples(7);
    }

    public static int sumOfMultiples(int n) {
        var arr = new int[n + 1];
        int sum = 0;
        for(int i=1; i<=n; i++){
            arr[i] = i;
        }


        for(int i=0; i<arr.length; i++){
            if(arr[i] % 3 == 0 || arr[i] % 5 == 0 || arr[i] % 7 == 0){
                sum += arr[i];
            }
        }

        return sum;
    }
}
