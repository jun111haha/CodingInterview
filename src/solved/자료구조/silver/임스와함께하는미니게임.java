package solved.자료구조.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

/*
12 F
lms0806
powergee
skeep194
lms0806
tony9402
lms0806
wider93
lms0806
mageek2guanaah
lms0806
jthis
lms0806
* */
public class 임스와함께하는미니게임 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int tc = Integer.parseInt(st.nextToken());
        String gameKinds = st.nextToken();

        HashSet<String> hashSet = new HashSet<>();
        int cnt = 0;
        while (tc-->0){
            String strTemp = br.readLine();
            if(hashSet.contains(strTemp)){
                continue;
            }else{
                cnt++;
            }
            hashSet.add(strTemp);
        }

        int game = 0;
        switch (gameKinds){
            case "Y":
                game = 1;
                break;
            case "F":
                game = 2;
                break;
            case "O":
                game = 3;
                break;
        }

        System.out.println(cnt/game);
    }
}
