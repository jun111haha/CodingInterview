package leetcode.easy.solved;

public class easy1678 {
    public static void main(String[] args) {
        System.out.println(interpret("G()(al)"));
    }
    public static String interpret(String command) {
        String ans = "";
        String temp = "";
        for(int i=0; i<command.length(); i++){
            temp += command.charAt(i);
            if(temp.equals("G")){
                ans += "G";
                temp = "";
            }else if(temp.equals("()")){
                ans += "o";
                temp = "";
            }else if(temp.equals("(al)")){
                ans += "al";
                temp = "";
            }

        }

        return ans;
    }
}
