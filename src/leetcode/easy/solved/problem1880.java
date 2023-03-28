package leetcode.easy.solved;

import java.util.HashMap;

public class problem1880 {
    public static void main(String[] args) {
        System.out.println(isSumEqual("acb", "cba", "cdb"));
    }

    public static boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        boolean isCheck = false;
        char[] arr = new char[]{'a','b','c','d','e','f','g','h','i','j','k',
                                'l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            hashMap.put(arr[i], i);
        }

        String firstWordSum = "";
        String secondWordSum = "";
        String targetWordSum = "";

        for(int i=0; i<firstWord.length(); i++) firstWordSum += hashMap.get(firstWord.charAt(i));
        for(int i=0; i<secondWord.length(); i++) secondWordSum+= hashMap.get(secondWord.charAt(i));
        for(int i=0; i<targetWord.length(); i++) targetWordSum+= hashMap.get(targetWord.charAt(i));

        if(Integer.parseInt(firstWordSum) + Integer.parseInt(secondWordSum) == Integer.parseInt(targetWordSum)){
            isCheck = true;
        }

        return isCheck;
    }
}
