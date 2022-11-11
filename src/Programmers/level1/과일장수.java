package Programmers.level1;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 과일장수 {
    public static void main(String[] args) {
        int k = 3;
        int m = 4;
        int [] score = {1, 2, 3, 1, 2, 3, 1};
        System.out.println(solution(k, m, score));
    }
    public static int solution(int k, int m, int[] score) {
        int answer = 0;
        if(score.length < m){
            return 0;
        }
        int fruitSum = m * (score.length / m);
        List<Integer> collect = Arrays.stream(score)
                .boxed()
                .sorted(Collections.reverseOrder())
                .limit(fruitSum)
                .collect(Collectors.toList());

        System.out.println(fruitSum);
        return IntStream.range(0, collect.size())
                .filter(i -> i % m == m - 1)
                .map(collect::get)
                .reduce(Integer::sum)
                .getAsInt() * m;
    }
    
    /*
        public int solution(int k, int m, int[] score) {
        int answer = 0;
        Integer[] arr = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, Collections.reverseOrder());

        for(int i=0; i<arr.length;i++){
            if(i<(m*(arr.length/m))){
                if(i%m==m-1){
                    answer+=arr[i]*m;
                }
            }
        }
        return answer;
    }
    */
}
