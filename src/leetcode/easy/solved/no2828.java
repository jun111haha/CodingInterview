package leetcode.easy.solved;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class no2828 {
    public static void main(String[] args) {
        System.out.println(isAcronym(Arrays.asList("alice","bob","charlie"), "abc"));

    }

    public static boolean isAcronym(List<String> words, String s) {
        ArrayList<String> list = new ArrayList<>();

        for(int i=0; i<words.size(); i++){
            for(int j=0; j<words.get(i).length(); j++){
                String temp = words.get(i);
                list.add(temp.substring(0, 1));
                break;
            }
        }


        if (list.size() != s.length()){
            return false;
        }else{
            if(list.stream().collect(Collectors.joining()).equals(s)){
                return true;
            }else{
                return false;
            }

        }


    }
}
