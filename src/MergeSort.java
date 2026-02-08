/*
* Question 6: Implement sorting a list using Merge Sort algorithm.
 */

public class MergeSort implements SortingAlg {

    // Main mergeSort function to recursively divide the array
    public static int[] mergeSort(int[] arr) {
        int a = arr.length;
        // Base case: In the array only has one element, it's already sorted
        if(a <= 1){
            return arr;
        }
        // Find the middle index
        int mid = a/2;

        // Create left and right subarrays
        int[] left = new int[mid];
        int[] right = new int[a - mid];

        // Recursively sort both halves
        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }

    // Create a method with two arraylist as parameters to initialize variables
    public static int[] merge(int[] list1, int[] list2) {
        // First we need to create the new empty merge array with length size list1 + list2
        int n1 = list1.length;
        int n2 = list2.length;
        int[] result = new int[n1 + n2];

        // // We need three points to keep track of indexes of lists 1, 2, and final list
        int i = 0, j = 0;
        int k = 0;

        // while loop to compare elements and merge from both lists
        while (i < n1 && j < n2) {
            if (list1[i] < list2[j]) {
                result[k] = list1[i];
                i++;
            } else {
                result[k] = list2[j];
                j++;
            }
            k++;
        }

        // Copy any remaining elements from list1
        while (i < n1) {
            result[k] = list1[i];
            i++;
            k++;
        }

        // Copy any remaining elements from list2
        while (j < n2) {
            result[k] = list2[j];
            j++;
            k++;
        }
        return result;
    }

    @Override
    public int[] sorty(int[] A) {
        return mergeSort(A);
    }
}
