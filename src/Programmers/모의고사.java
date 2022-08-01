package Programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class 모의고사 {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5};
        System.out.println(solution(arr));
    }
    /*
    * 수포자들의 답과 실제답을 비교 맞은개수를 score 에 저장
    * 제일 많이 맞은개수 체크 오름차순으로 정렬 -> 많이 맞은 개수? arr[2] 에 저장
    * score 에 있는 값을 arr[2] 와 같으면 list 에 +1 씩 증가하여 제일 많이 맞은사람 체크
    * 모든사람이 같은 문제를 맞췄으면 list 에 [1,2,3] 저장하여 출력
    * */
    public static int[] solution(int[] answers) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        int [] score = {0, 0, 0};

        //수포자들이 답 찍는패턴
        int [] arr1  = {1, 2, 3, 4, 5};
        int [] arr2  = {2, 1, 2, 3, 2, 4, 2, 5};
        int [] arr3  = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        for(int i =0; i<answers.length; i++){
            if(arr1[i % 5]  == answers[i]) { score[0]++; }
            if(arr2[i % 8]  == answers[i]) { score[1]++; }
            if(arr3[i % 10] == answers[i]) { score[2]++; }
        }

        int [] arr = new int[score.length];
        for(int i =0; i<score.length; i++){
            arr[i] = score[i];
        }

        Arrays.sort(arr);
        for(int i =0; i<arr.length; i++){
            if(score[i] == arr[2]){
                arrayList.add(i + 1);
            }
        }

        System.out.println(arrayList);
        int [] answer =new int[arrayList.size()];
        for(int i = 0; i < arrayList.size(); i++){
            answer[i] = arrayList.get(i);
        }
        return answer;
    }

}
