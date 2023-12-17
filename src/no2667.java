import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Node{
    int x;
    int y;

    Node(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class no2667 {
    static boolean[][] check;
    static int [][] arr;
    static ArrayList<Integer> list = new ArrayList<>();
    static int tc;
    static int[] dirX = {-1, 0, 1, 0}; // 상 하 좌 우
    static int[] dirY = {0, 1, 0, -1}; // 상 하 좌 우

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        tc = Integer.parseInt(br.readLine());

        arr = new int[tc][tc];
        check = new boolean[tc][tc];
        for(int i=0; i<tc; i++){
            String temp = br.readLine();
            for(int j=0; j<tc; j++){
                arr[i][j] = temp.charAt(j) - '0';
            }
        }

        for(int i=0; i<tc; i++){
            for(int j=0; j<tc; j++){
                if(arr[i][j] == 1 && !check[i][j]){
                    bfs(i , j);
                }
            }
        }

        Collections.sort(list);
        System.out.println(list.size());
        list.stream().forEach(System.out::println);
    }

    public static void bfs(int x, int y){
        Queue<Node1> queue = new LinkedList<>();
        check[x][y] = true;
        queue.offer(new Node1(x, y));

        int cnt = 0;
        while (!queue.isEmpty()){
            Node1 temp = queue.poll();
            int nx = temp.x;
            int ny = temp.y;
            cnt++;

            for(int i=0; i<4; i++){
                int nowX = nx + dirX[i];
                int nowY = ny + dirY[i];

                if(nowX >= 0 && nowY >= 0 && nowX < tc && nowY < tc
                        && !check[nowX][nowY] && arr[nowX][nowY] == 1){
                    check[nowX][nowY] = true;
                    queue.offer(new Node1(nowX, nowY));

                }

            }
        }

        list.add(cnt);
    }
}
