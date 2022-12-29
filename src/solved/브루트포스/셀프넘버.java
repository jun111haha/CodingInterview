package solved.브루트포스;

public class 셀프넘버 {
    public static void main(String[] args) {
        boolean[] arr = new boolean[10001];
        for(int i=1; i<10001; i++){
            int selfNum = self(i);
            if(selfNum <= 10000){
                arr[selfNum] = true;
            }
        }
        for(int i=1; i<10001; i++){
            if(!arr[i]){
                System.out.println(i);
            }
        }
    }

    public static int self(int num) {
        int sum = num;
        while(num != 0) {
            sum += num % 10; // 첫 째 자리수
            num /= 10; // 10을 나누어 첫 째 자리를 없앤다
        }

        return sum;
    }
}
