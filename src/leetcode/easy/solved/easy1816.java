package leetcode.easy.solved;

public class easy1816 {
    public static void main(String[] args) {
        System.out.println(truncateSentence("Hello how are you Contestant", 4));
    }

    public static String truncateSentence(String s, int k) {
        String answer = "";
        var arr = s.split(" ");
        for(int i=0; i<k; i++){
            if(i != k - 1){
                answer+= arr[i] + " ";
            }else{
                answer+= arr[i];
            }
        }

        return answer;
    }
}
