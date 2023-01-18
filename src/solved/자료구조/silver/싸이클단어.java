package solved.자료구조.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

/*
5
picture
turepic
icturep
word
ordw
* */
public class 싸이클단어 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        HashSet<String> hashSet = new HashSet<>();
        int cnt = tc;
        for (int i=0; i<tc; i++) {
            char[] word = br.readLine().toCharArray();

            for (int j=0; j<word.length; j++) {
                if (!hashSet.contains(String.valueOf(word))) {
                    char first = word[0];
                    for (int k=1; k<word.length; k++) {
                        word[k - 1] = word[k];
                    }
                    word[word.length - 1] = first;
                } else {
                    cnt--;
                    break;
                }
            }

            hashSet.add(String.valueOf(word));
        }
        System.out.println(hashSet); //[word, picture]
        System.out.println(cnt); //2
    }
}
