package leetcode.easy.solved;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class easy1773 {
    public static void main(String[] args) {
        List<List<String>> item = new ArrayList<>(Arrays.asList(
                Arrays.asList("phone","blue","pixel"),
                Arrays.asList("computer","silver","lenovo"),
                Arrays.asList("phone","gold","iphone")
        ));

        System.out.println(countMatches(item, "color", "silver"));

    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ans = 0;
        int type;
        if(ruleKey.equals("type")){
            type = 0;
        }else if (ruleKey.equals("color")){
            type = 1;
        }else{
            type = 2;
        }


        for(int i=0; i<items.size(); i++){
            String[] temp = items.get(i).toArray(new String[0]);
            for(int j=0; j<temp.length; j++){
                if(j == type && temp[j].equals(ruleValue)){
                    ans++;
                }
            }
        }

        return ans;
    }
}
