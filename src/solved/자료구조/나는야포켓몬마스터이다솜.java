package solved.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class 나는야포켓몬마스터이다솜 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int testCase = Integer.parseInt(st.nextToken());
        int testCase2 = Integer.parseInt(st.nextToken());
        HashMap<String, String> hashMap = new HashMap<>();
        HashMap<String, String> hashMap2 = new HashMap<>();
        for(int i =1; i<=testCase; i++){
            String inputStr = br.readLine();
            hashMap.put(inputStr, String.valueOf(i));
            hashMap2.put(String.valueOf(i), inputStr);
        }

        for(int i= 0; i<testCase2; i++){
            String inputStr = br.readLine();
            String temp = hashMap.get(inputStr);
            String temp2 = hashMap2.get(inputStr);
            if(temp != null){
                System.out.println(temp);
            }
            if(temp2 != null){
                System.out.println(temp2);
            }
        }
    }
}
