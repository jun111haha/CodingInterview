package solved.자료구조.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashSet;
import java.util.StringTokenizer;

public class 회사에있는사람 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        HashSet<String> hashSet = new HashSet<>();
        for(int i =0; i<tc; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String name = st.nextToken();
            String value = st.nextToken();

            if(value.equals("enter")){
                hashSet.add(name);
            }else{
                hashSet.remove(name);
            }

        }

        hashSet.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
