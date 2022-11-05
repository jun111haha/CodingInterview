package Programmers.level1;

public class 삼총사 {
    public static void main(String[] args) {
        int [] numbers = {-3, -2, -1, 0, 1, 2, 3};
        System.out.println(solution(numbers));
    }
    /*
    * 모든 경우의수를 다 더해서 0 하고 비교
    * */
    public static int solution(int[] number) {
        int answer = 0;
        for(int i =0; i< number.length; i++){
            for(int j =i + 1; j< number.length; j++){
                for(int z = j + 1; z<number.length; z++){
                    if(number[i] + number[j] + number[z] == 0){
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
}
