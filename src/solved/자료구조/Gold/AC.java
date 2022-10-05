package solved.자료구조.Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class AC {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int testCase = Integer.parseInt(br.readLine());
        for(int i =0; i<testCase; i++){
            Deque<Integer> deque = new LinkedList<>(); // 배열을 담을 큐
            boolean direction = true; // 순방향 || 역방향
            boolean error = false;

            String p = br.readLine(); // 커맨드
            int n = Integer.parseInt(br.readLine()); // 배열 원소 수
            String temp = br.readLine(); // 배열 원소
            temp = temp.substring(1, temp.length() - 1);
            String [] arr = temp.split(",");

            if (temp != "") {
                for (int j = 0; j < arr.length; j++) { // 배열 큐에 담기
                    deque.add(Integer.parseInt(arr[j]));
                }
            }

            for (int j = 0; j < p.length(); j++) {
                switch (p.charAt(j)) {
                    case 'R':
                        direction = !direction;
                        break;

                    case 'D':
                        if (!deque.isEmpty()) {
                            if (direction) { // 순방향
                                deque.pollFirst();
                            } else { // 역방향
                                deque.pollLast();
                            }
                        } else {
                            error = true;
                        }
                        break;
                    default:
                        break;
                }

                // 비어있는 덱 원소 삭제 시도시
                if (error)
                    break;
            }

            if (error) { // 비어있는 덱 원소 삭제 시도시
                sb.append("error").append("\n");
            } else {
                sb.append("[");
                if (direction) {
                    while (!deque.isEmpty()) {
                        sb.append(deque.pollFirst());
                        if (deque.isEmpty())
                            break;
                        sb.append(",");
                    }

                } else {
                    while (!deque.isEmpty()) {
                        sb.append(deque.pollLast());
                        if (deque.isEmpty())
                            break;
                        sb.append(",");
                    }
                }
                sb.append("]").append("\n");
            }
        }
        System.out.println(sb);
    }
}
