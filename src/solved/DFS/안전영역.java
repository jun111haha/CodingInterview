package solved.DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class 안전영역 {
    static int [][] arr;
    static boolean [][] visit;
    public static ArrayList<Integer> list;

    //상하좌우 좌표
    static int dx[] = {0, 0, -1, 1};
    static int dy[] = {-1, 1, 0, 0};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int testCase = Integer.parseInt(br.readLine());
        arr = new int[testCase][testCase];
        visit = new boolean[testCase][testCase];


        int maxArr = 0;
        for(int i =0; i<testCase; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<testCase; j++){
                int x = Integer.parseInt(st.nextToken());
                arr[i][j] = x;
                if(maxArr < arr[i][j]){
                    maxArr = arr[i][j];
                }
            }
        }

        list = new ArrayList<>();
        /*
        * 비가와서 잠기는 영역을 depth 로 지정
        * 아직 방문하지 않는곳을 안전영역을 생성한다.
        * dfs 호출횟수가 안전영역의 갯수 이 값을 리스트에 담고 최댓값을 뽑는다.
        * */
        for(int depth =0; depth<=maxArr; depth++){
            int count = 0;
            for(int i =0; i<testCase; i++){
                for(int j=0; j<testCase; j++){
                    if(arr[i][j] > depth && !visit[i][j]){
                        count++;
                        dfs(i,j,depth);
                    }
                }
            }

            for(boolean isCheck[]: visit){
                //fill() 배열을 채우는 자바 11 메서드
                Arrays.fill(isCheck, false);
            }

            list.add(count);
        }
        int max = Collections.max(list);
        System.out.println(max);
    }

    public static void dfs(int x, int y, int depth){
        visit[x][y] = true;

        for(int i = 0 ; i < 4 ; i ++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < arr.length && ny < arr.length) {
                if (arr[nx][ny] > depth && !visit[nx][ny])
                    dfs(nx, ny, depth);
            }
        }
    }
}
