import java.io.IOException;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {
        System.out.println(solution("banana"));
    }

    public static int[] solution(String s) {
        int[] answer = new int[s.length()];

        for(int i=0; i<s.length(); i++){
            if(i != 0){
                int idx = s.substring(0 , i).lastIndexOf(s.charAt(i));
                System.out.println("i " + i);
                System.out.println("idx " + idx);
                if(idx != -1){
                    answer[i] = i - idx;
                }else{
                    answer[i] = idx;
                }
            }else{
                answer[i] = -1;
            }
        }

        System.out.println(Arrays.toString(answer));
        return answer;
    }
}
