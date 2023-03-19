package leetcode.easy.solved;

public class problem58 {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("luffy is still joyboy"));
    }
    public static int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");

        return arr[arr.length - 1].length();
    }
}
