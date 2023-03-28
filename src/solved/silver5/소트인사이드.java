package solved.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 소트인사이드 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int[] arr = new int[str.length()];
        for(int i=0; i<str.length(); i++){
            arr[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }

        quickSort(0, arr.length - 1, arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int start, int end, int[] arr){
        if(start >= end)
            return;

        int pivot = start;
        int left = start + 1;
        int right = end;

        while (left <= right){
            while (left <= end && arr[left] >= arr[pivot]){
                left++;
            }
            while (right > start && arr[right] <= arr[pivot]){
                right--;
            }
            if(left > right){
                swap(arr, right, pivot);
            }else{
                swap(arr, left, right);
            }
        }

        quickSort(start, right - 1, arr);
        quickSort(right + 1, end, arr);
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
