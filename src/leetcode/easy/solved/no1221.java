package leetcode.easy.solved;

public class no1221 {
    public static void main(String[] args) {
        System.out.println(balancedStringSplit("RLRRLLRLRL"));
    }

    public static int balancedStringSplit(String s) {
        int bal = 0;
        int ans = 0;

        for(int i=0; i<s.length(); i++){
            char temp = s.charAt(i);
            if(temp == 'R'){
                bal--;
            }

            if(temp == 'L'){
                bal++;
            }

            if(bal == 0) ans++;
        }

        return ans;
    }
}
