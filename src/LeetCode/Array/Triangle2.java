package LeetCode.Array;

import java.util.ArrayList;
import java.util.List;

public class Triangle2 {
    public static void main(String[] args) {
        System.out.println(getRow(3));
    }

    public static List<Integer> getRow(int rowIndex){
        List<List<Integer>> result = new ArrayList<>();

        for(int i=0; i<=rowIndex; i++){
            ArrayList<Integer> list = new ArrayList<>();
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

        return result.get(rowIndex);
    }
}
