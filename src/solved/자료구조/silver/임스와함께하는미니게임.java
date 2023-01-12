package solved.자료구조.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class 임스와함께하는미니게임 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int tc = Integer.parseInt(st.nextToken());
        int game = getPlayerExceptLms(st.nextToken().charAt(0));

        HashSet<String> hashSet = new HashSet<>();
        int cnt = 0;
        while (tc-->0){
            String str = br.readLine();
            cnt += hashSet.contains(str) ? 0 : 1;
            hashSet.add(str);
        }
        int answer = cnt/game;
        System.out.println(hashSet);
        System.out.println(answer);
    }

    public static int getPlayerExceptLms(char c) {
        switch (c) {
            case 'Y': return 1;
            case 'F': return 2;
            case 'O': return 3;
        }
        return -1;
    }
}
