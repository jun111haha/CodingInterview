package leetcode.easy.solved;

import java.util.Arrays;

public class easy1859 {
    public static void main(String[] args) {
        System.out.println(sortSentence("is2 sentence4 This1 a3"));
    }

    public static String sortSentence(String s) {
        var arr = s.split(" ");
        String[] strArr = new String[arr.length];

        for(int i=0; i<arr.length; i++){
            for(int j=arr[i].length()-1; j>0; j--){
                strArr[Character.getNumericValue(arr[i].charAt(j)) - 1] = arr[i];
                break;
            }
        }

        String answer = "";
        for(int i=0; i<strArr.length; i++){
            if(i != strArr.length - 1){
                answer+= strArr[i] + " ";
            }else{
                answer+= strArr[i];
            }
        }

        return answer.replaceAll("\\d", "");
    }
}
