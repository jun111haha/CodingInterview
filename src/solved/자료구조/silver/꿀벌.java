package solved.자료구조.silver;

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
                hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0) + 1);
            }
        }

        int finalTotal = total;
        hashMap.forEach((key, value) -> {
          if(key.equals("Re")){
              sb.append("Re" + " " + value + " " + String.format("%.2f", (double) value / (double) finalTotal) + "\n");
          }else if(key.equals("Pt")){
              sb.append("Pt" + " " + value + " " + String.format("%.2f", (double) value / (double) finalTotal) + "\n");
          }else if(key.equals("Cc")){
              sb.append("Cc" + " " + value + " " + String.format("%.2f", (double) value / (double) finalTotal) + "\n");
          }else if(key.equals("Ea")){
              sb.append("Ea" + " " + value + " " +  String.format("%.2f", (double) value / (double) finalTotal) + "\n");
          }else if(key.equals("Tb")){
              sb.append("Tb" + " " + value + " " + String.format("%.2f", (double) value / (double) finalTotal) + "\n");
          }else if(key.equals("Cm")){
              sb.append("Cm" + " " + value + " " + String.format("%.2f", (double) value / (double) finalTotal) + "\n");
          }else if(key.equals("Ex")){
              sb.append("Ex" + " " + value + " " +  String.format("%.2f", (double) value / (double) finalTotal) + "\n");
          }
      });

        sb.append("Total" + " " + total + " " + "1.00");
        System.out.println(sb);
    }
}
