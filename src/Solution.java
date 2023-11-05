import java.io.IOException;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {
        System.out.println(solution(new String[]{".#...", "..#..", "...#."}));
    }

    public static int[] solution(String[] wallpaper) {
        int[] answer = {};
        int top = Integer.MAX_VALUE;
        int left = Integer.MAX_VALUE;
        int bottom = Integer.MIN_VALUE;
        int right = Integer.MIN_VALUE;

        for(int i=0; i<wallpaper.length; i++){
            String wal = wallpaper[i];
            for(int j=0; j<wal.length(); j++){
                if(wal.charAt(j) == '#'){
                    top = Math.min(i , top);
                    left = Math.min(i + 1, left);
                    bottom = Math.max(j, bottom);
                    right = Math.max(j + 1, right);
                }
            }
        }


        System.out.println(Arrays.toString(new int[]{top, left, bottom, right}));
        return answer;
    }
}
