package Programmers.level1;

import java.util.HashMap;

public class 완주하지못한선수 {
    public static void main(String[] args) {
        String [] participant = {"mislav", "stanko", "mislav", "ana"};
        String [] completion  = {"stanko", "ana", "mislav"};

        System.out.println(solution(participant, completion));

    }

    /*
    * 참가자 해시맵에 getOrDefault 메서드 활용 값을 넣어준다.
    * 완주자는 해시맵에서 get 해 값을 -1 해준다.
    * 0 값이 아닌값만 answer 에 넣어주고 return (완주하지 못한 사람)
    * */
    public static String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String , Integer> hashMap = new HashMap<>();
        for(int i =0; i<participant.length; i++){
            hashMap.put(participant[i], hashMap.getOrDefault(participant[i], 0 )+ 1);
        }

        for(int i =0; i<completion.length; i++){
            hashMap.put(completion[i], hashMap.get(completion[i]) - 1);
        }

        for(String key : hashMap.keySet()){
            if(hashMap.get(key) != 0){
                answer = key;
            }
        }
        return answer;
    }
}
