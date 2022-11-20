package solved.브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Body {
    int h;
    int w;

    Body(int h, int w){
        this.h = h;
        this.w = w;
    }
}
/*
5
55 185
58 183
88 186
60 175
46 155
* */
public class 덩치 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int n = Integer.parseInt(br.readLine());
        ArrayList<Body> list = new ArrayList<>();

        for(int i =0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            list.add(new Body(h, w));
        }

        for(int i =0; i<list.size(); i++){
            int rank =1;
            for(int j = 0; j<list.size(); j++){
                if(i == j) {
                    continue;
                }else if(list.get(i).h < list.get(j).h && list.get(i).w < list.get(j).w){
                    rank++;
                }
            }
            sb.append(rank + " ");
        }
        System.out.println(sb);
    }
}
