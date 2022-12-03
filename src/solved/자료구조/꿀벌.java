package solved.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

public class 꿀벌 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        LinkedHashMap<String, Integer> hashMap = new LinkedHashMap<>();
        hashMap.put("Re", 0);
        hashMap.put("Pt", 0);
        hashMap.put("Cc", 0);
        hashMap.put("Ea", 0);
        hashMap.put("Tb", 0);
        hashMap.put("Cm", 0);
        hashMap.put("Ex", 0);

        String str = "";
        int total = 0;
        while ((str = br.readLine()) != null && str.length() > 0){
            String[] arr = str.split(" ");
            total += arr.length;
            for(int i =0; i<arr.length; i++){
                hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0 )+ 1);
            }
        }

        for(String key : hashMap.keySet()){
                if(key.equals("Re")){
                    sb.append(key + " " + hashMap.get(key) + " " + String.format("%.2f", (double) hashMap.get(key) / (double) total) + "\n");

                }else if (key.equals("Pt")){
                    sb.append(key + " " + hashMap.get(key) + " " + String.format("%.2f", (double) hashMap.get(key) / (double) total) + "\n");
                }else if (key.equals("Cc")){
                    sb.append(key + " " + hashMap.get(key) + " " + String.format("%.2f", (double) hashMap.get(key) / (double) total) + "\n");

                }else if (key.equals("Ea")){
                    sb.append(key + " " + hashMap.get(key) + " " + String.format("%.2f", (double) hashMap.get(key) / (double) total) + "\n");

                }else if (key.equals("Tb")){
                    sb.append(key + " " + hashMap.get(key) + " " + String.format("%.2f", (double) hashMap.get(key) / (double) total) + "\n");

                }else if (key.equals("Cm")){
                    sb.append(key + " " + hashMap.get(key) + " " + String.format("%.2f", (double) hashMap.get(key) / (double) total) + "\n");

                }else if (key.equals("Ex")){
                    sb.append(key + " " + hashMap.get(key) + " " + String.format("%.2f", (double) hashMap.get(key) / (double) total) + "\n");

                }
        }

        sb.append("Total" + " " + total + " " + "1.00");
        System.out.println(sb);
    }
}
