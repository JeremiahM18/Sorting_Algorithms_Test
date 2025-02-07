/*
* Question 6: Implement sorting a list using Quick Sort algorithm.
 */


public class QuickSort implements SortingAlg{

    public static int[] quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int pivot = partition(arr, left, right);

            quickSort(arr, left, pivot - 1); // Sort left subarray
            quickSort(arr, pivot + 1, right); // Sort right subarray
        }
        return arr;
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choose last element as pivot
        int i = low - 1;       // Index for smaller elements

        // Traverse the array and move smaller elements to the left
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++; // Increment the index for the smaller element
                swap(arr, i, j); //Swap if arr[j] is smaller than pivot
            }
        }

        // Swap the pivot element with the element at i + 1
        swap(arr, (i + 1), high);

        return i + 1; // Return the index of the pivot
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    @Override
    public int[] sorty(int[] A) {
        quickSort(A, 0,A.length - 1);
        return A;

    }
}
