import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class no1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        int cnt = 0;

        for(int i=0; i<tc; i++){
            String str = br.readLine();
            boolean[] arr = new boolean[26];
            boolean check = true;

            for(int j=0; j<str.length(); j++){
                int index = str.charAt(j) - 'a';
                if(arr[index]){
                    if(str.charAt(j) != str.charAt(j - 1)){
                        check = false;
                        break;
                    }

                }else{
                    arr[index] = true;
                }
            }

            if (check) cnt++;
        }

        System.out.println(cnt);

    }
}
