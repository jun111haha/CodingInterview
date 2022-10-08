package solved.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 수정렬하기2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int testCase = Integer.parseInt(br.readLine());
        int [] arr = new int[testCase];
        for(int i =0; i<testCase; i++) {
            int n = Integer.parseInt(br.readLine());
            arr[i] = n;
        }
        mergeSort(arr, 0, arr.length - 1);

        for(int x : arr){
            System.out.println(x);
        }

    }

    private static void mergeSort(int[] a, int left, int right) {

        if(left < right) {
            int mid = (left + right) / 2;
            mergeSort(a,left,mid);
            mergeSort(a,mid+1,right);

            merge(a,left,mid,right);
        }
    }
    private static void merge(int[] a, int left, int mid, int right) {

        int lidx = left;
        int ridx = mid+1;
        int[] b = new int[a.length];
        int bidx = left;

        while(lidx <= mid && ridx <= right) {

            if(a[lidx] <= a[ridx]){
                b[bidx] = a[lidx];
                lidx += 1;
            } else {
                b[bidx] = a[ridx];
                ridx += 1;
            }
            bidx +=1;
        }

        if(lidx > mid) {
            for(int i = ridx; i<= right; ++i,++bidx)
                b[bidx] = a[i];
        } else {
            for(int i = lidx; i<= mid; ++i, ++bidx)
                b[bidx] = a[i];
        }
        for(int i=left; i<=right; ++i)
            a[i] = b[i];
    }

}
