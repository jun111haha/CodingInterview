package solved.자료구조.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
4
3
2 1 2
3 2 3 4
3 4 2 1
* */
public class 캠프파이어 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int musicCnt = 0;
        List<Set> music = new ArrayList<Set>();

        for (int i=0; i<N; i++){
            music.add(new HashSet());
        }

        Loop1 : for(int i = 0; i < M; i++) {
            String[] str = br.readLine().split(" ");

            for(int j = 1; j < str.length; j++) {
                if(str[j].equals("1")) {
                    musicCnt++;

                    for(int k = 1; k < str.length; k++) {
                        int num = Integer.valueOf(str[k]) -1 ;
                        music.get(num).add(musicCnt);
                    }

                    continue Loop1;
                };
            }

            System.out.println(music); //[[1], [1], [], []]
            Set temp = new HashSet();

            for(int j = 1; j < str.length; j++) {
                int num = Integer.valueOf(str[j]) - 1;
                temp.addAll(music.get(num));
            }

            for(int j = 1; j < str.length; j++) {
                int num = Integer.valueOf(str[j]) - 1;
                music.get(num).addAll(temp);
            }
        }

        System.out.println(musicCnt); //2
        System.out.println(music); //[[1, 2], [1, 2], [1], [1, 2]]
        for (int i = 0; i < N; i++) {
            if(music.get(i).size() == musicCnt) System.out.println(i+1);
        }

    }
}
