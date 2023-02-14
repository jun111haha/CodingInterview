package solved.자료구조.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class 서로다른부분문자열의개수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        HashSet<String> hashSet = new HashSet<>();
        for (int i=0; i<str.length(); i++){
            String name = "";
            for (int j=i; j<str.length(); j++){
                name += str.substring(j, j+1);
                hashSet.add(name);
            }
        }
        System.out.println(hashSet.size());

    }
}
