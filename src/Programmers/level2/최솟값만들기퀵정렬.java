package Programmers.level2;

public class 최솟값만들기퀵정렬 {
    public static void main(String[] args) {
        int []A = {2,1};
        int []B = {4,3};
        System.out.println(getMinSum(A,B));

    }

    public static int getMinSum(int []A, int []B) {
        int answer = 0;
        int length = A.length;


        quickSort(A, 0, A.length-1);
        quickSort(B, 0, B.length-1);

        for(int i = 0 ; i < length ; i++){
            answer += A[i] * B[length-1-i];
        }

        return answer;
    }

    public static void quickSort(int[] arr, int left, int right) {
        int i, j, pivot, tmp;

        if (left < right) {
            i = left;
            j = right;
            pivot = arr[left];
            //분할 과정
            while (i < j) {
                while (arr[j] > pivot) j--;
                while (i < j && arr[i] <= pivot) i++;

                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
            arr[left] = arr[i];
            arr[i] = pivot;

            //정렬 과정
            quickSort(arr, left, i - 1);
            quickSort(arr, i + 1, right);
        }
    }
}
