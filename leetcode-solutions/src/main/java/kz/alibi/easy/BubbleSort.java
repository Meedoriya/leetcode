package kz.alibi.easy;

public class BubbleSort {

    public void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = true;
            for (int j = 0; j > n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = false;
                }
            }
            if (!swapped) break;
        }
    }
}
