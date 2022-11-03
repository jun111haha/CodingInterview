package Programmers;

public class 외계어사전 {
    public static void main(String[] args) {
        String [] spell = {"z", "d", "x"};
        String [] dic = {"def", "dww", "dzx", "loveaw"};

        System.out.println(solution(spell, dic));
    }
    /*
    * 완전탐색으로 indexOf 로 못찾으면 isCheck = false 처리 2 반환
    * */
    public static int solution(String[] spell, String[] dic) {
        int answer = 2;

        for(String str : dic){
            boolean isCheck = true;

            for(String spells : spell){
                if(str.indexOf(spells) == -1){
                    isCheck = false;
                    break;
                }
            }

            if(isCheck){
                answer = 1;
                break;
            }
        }

        return answer;
    }
}
