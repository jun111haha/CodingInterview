package solved.자료구조.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 자료구조는정말최고야 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        boolean isCheck = true;
        for(int i =0; i<M; i++){
            int dummy = Integer.parseInt(br.readLine());
            String[] strArr = br.readLine().split(" ");
            int preValue = Integer.MAX_VALUE;
            for(int j =0; j<dummy; j++){
                if(Integer.parseInt(strArr[j]) > preValue){
                    isCheck = false;
                    break;
                }else{
                    preValue = Integer.parseInt(strArr[j]);
                }
            }
        }

        if(isCheck){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
