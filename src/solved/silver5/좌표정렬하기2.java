package solved.silver5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Point{
    int x;
    int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

}

public class 좌표정렬하기2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int tc = Integer.parseInt(br.readLine());

        Point[] arr = new Point[tc];
        for (int i = 0; i < tc; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[i] = new Point(x, y);
        }

        Arrays.sort(arr, new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                if(o1.y == o2.y){
                    return o1.x - o2.x;
                }else{
                    return o1.y - o2.y;
                }
            }
        });

        StringBuilder sb = new StringBuilder();
        for(Point point : arr){
            sb.append(point.x + " " + point.y + "\n");
        }

        System.out.println(sb);
    }
}
