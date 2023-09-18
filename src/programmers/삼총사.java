package programmers;

public class 삼총사 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{-3, -2, -1, 0, 1, 2, 3}));
    }

    public static int solution(int[] number) {
        int answer = 0;
        for(int i=0; i<number.length; i++){
            for(int j=i+1; j<number.length; j++){
                for(int z=j+1; z<number.length; z++){
                    if(number[i] + number[j] + number[z] == 0){
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
}
