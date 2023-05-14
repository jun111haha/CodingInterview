package leetcode.easy.solved;

public class easy1108 {
    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.1.1.1"));
    }

    public static String defangIPaddr(String address) {
        String ans = "";
        for(int i=0; i<address.length(); i++){
            char ch = address.charAt(i);
            if(ch == '.'){
                ans += '[';
                ans += '.';
                ans += ']';
            }else{
                ans += ch;
            }
        }

        return ans;
    }

}
