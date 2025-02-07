/*
* Question 6: Implement sorting a list using Bubble Sort algorithm.
 */

public class BubbleSort implements SortingAlg{

    public static int[] bubbleSort(int[] arr) {
        int a = arr.length;

        // Initialize a boolean to avoid unnecessary comparisons.
        boolean swapped;

        for (int i = 0; i < a - 1; i++) {
            swapped = false;
            for (int j = 0; j < a - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no swaps occurred, the array is already sorted
            if (!swapped) {
                break;
            }
        }
        return arr;
    }

    @Override
    public int[] sorty(int[] A) {
        return bubbleSort(A);
    }
}
