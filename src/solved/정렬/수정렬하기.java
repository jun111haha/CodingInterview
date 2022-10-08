package solved.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
5
5
2
3
4
1
* */
public class 수정렬하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int testCase = Integer.parseInt(br.readLine());
        int [] arr = new int[testCase];
        for(int i =0; i<testCase; i++) {
            int n = Integer.parseInt(br.readLine());
            arr[i] = n;
        }
        quickSort(arr, 0, arr.length - 1);

        for(int x : arr){
            System.out.println(x);
        }
    }

    public static void quickSort(int[] data, int start, int end) {
        if (start >= end) {
            return;
        }

        int pivot = start;
        int i = start + 1;
        int j = end;
        int temp;

        while (i <= j) { // 엇갈릴 때 까지 반복 j가 i보다 크거나 같으면 while문 종료
            while (i <= end && data[i] < data[pivot]) { // 피봇 값보다 큰 값을 만날 때 까지
                i++;
            }
            while (j > start && data[j] >= data[pivot]) { // 피봇 값보다 작은 값을 만날 때 까지
                j--;
            }
            if (i > j) { // 현재 엇갈린 상태라면
                temp = data[j];
                data[j] = data[pivot];
                data[pivot] = temp;
            } else {
                temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }
        }
        quickSort(data, start, j-1);
        quickSort(data, j+1, end);
    }
}
