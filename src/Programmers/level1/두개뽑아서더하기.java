package Programmers.level1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class 두개뽑아서더하기 {
    public static void main(String[] args) {
        int [] nums = {2,1,3,4,1};
        int [] num = solution(nums);
        System.out.println(Arrays.toString(num));

    }

    public static int[] solution(int[] numbers) {
        HashSet<Integer> hashSet = new HashSet<>();

        Arrays.sort(numbers);
        int sum =0;
        for(int i =0; i< numbers.length - 1; i++){
            for(int j = i+1; j< numbers.length; j++){
                sum =numbers[i] + numbers[j];
                hashSet.add(sum);
            }
        }

        int [] answer = new int[hashSet.size()];
        Iterator iter = hashSet.iterator();
        int i =0;
        while (iter.hasNext()){
            answer[i] = (int) iter.next();
            i++;
        }

        Arrays.sort(answer);
        return answer;
    }
}
