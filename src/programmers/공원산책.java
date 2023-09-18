package programmers;

public class 공원산책 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"SOO","OXX","OOO"}, new String[]{"E 2","S 2","W 1"}));
    }

    public static int[] solution(String[] park, String[] routes) {
        int startX = 0;
        int startY = 0;
        char[][] arr = new char[park.length][park[0].length()];

        for(int i=0; i<park.length; i++){
            arr[i] = park[i].toCharArray();

            if(park[i].contains("S")){
                startY = i;
                startX = park[i].indexOf("S");
            }
        }

        for(String str : routes){
            String way = str.split(" ")[0];
            int len = Integer.parseInt(str.split(" ")[1]);

            int nx = startX;
            int ny = startY;

            for(int i=0; i<len; i++){
                if(way.equals("E")){
                    nx++;
                }

                if(way.equals("W")){
                    nx--;
                }

                if(way.equals("S")) {
                    ny++;
                }

                if(way.equals("N")){
                    ny--;
                }

                if(nx >= 0 && ny >= 0 && ny < arr.length && nx < arr[0].length){
                    if(arr[ny][nx] == 'X'){
                        break;
                    }

                    if(i == len - 1){
                        startX = nx;
                        startY = ny;
                    }

                }

            }
        }

        int[] answer = {startY, startX};
        return answer;
    }
}
