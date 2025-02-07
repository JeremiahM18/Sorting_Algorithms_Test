/*
* Question 6: Implement sorting a list using Selection Sort algorithm.
 */

public class SelectionSort implements SortingAlg {

    public static int[] selectionSort(int[] arr) {
        int a = arr.length;
        for (int i = 0; i < a -1; i++) {
            int min = i;
            for (int j = i + 1; j < a; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            // Swap the found minimum element with the first element of the unsorted part
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    @Override
    public int[] sorty(int[] A) {
        return selectionSort(A);
    }
}
