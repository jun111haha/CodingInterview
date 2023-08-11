package leetcode.easy.solved;

import java.util.Arrays;

public class no2373 {
    public static void main(String[] args) {
        System.out.println(largestLocal(new int[][]{
                 {9,9,8,1}
                ,{5,6,2,6}
                ,{8,2,6,4}
                ,{6,2,2,2}
        }));
    }

    public static int[][] largestLocal(int[][] grid) {
        int answer[][] = new int[grid.length - 2][grid.length - 2];
        for(int i=0; i<grid.length - 2; i++){
            for(int j=0; j<grid.length - 2; j++){
                answer[i][j] = findMax(grid, i , j);
            }
        }

        System.out.println(Arrays.deepToString(answer));
        return answer;
    }

    public static int findMax(int[][] grid, int a, int b){
        int max = 0;
        for(int i=a; i<a + 3; i++){
            for(int j=b; j<b + 3; j++){
                max = Math.max(grid[i][j], max);
            }
        }

        return max;
    }
}
