package LeetCode.Array;

import java.util.ArrayList;
import java.util.List;

public class Triangle {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(generate(num));
    }
    /*
    파스칼 삼각형
    * 1. 현재 입력해야하는 인덱스가 라인의 양 끝일 경우 1을 입력.
    * 2. 라인의 양 끝이 아닐 경우, 값을 구하기 위해 이전 라인 리스트 객체를 받아옴.
    * 3. 받아온 리스트 객체(윗줄) 이전의 인덱스(j-1)와 현재 인덱스(j)를 합친다.
    * 4. 합한 정수를 현재 리스트(라인)에 추가한다.
    * 5. 반복문을 통해 생성된 한 리스트를 result 에 추가한다.
    * */
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0; i<numRows; i++) {
            List<Integer> list = new ArrayList<>();
            for(int j=0; j<=i; j++){
                if(j == 0 || j == i){
                    list.add(1);
                }else{
                    int prev = result.get(i - 1).get(j - 1);
                    int next = result.get(i - 1).get(j);
                    list.add(prev + next);
                }
            }
            result.add(list);
        }
        return result;
    }
}
