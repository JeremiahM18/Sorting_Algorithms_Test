/*
* Question 6: Implement sorting a list using insertion sort algorithm.
 */

public class InsertionSort {

    // Create a method with array as parameter for unsorted list
    public static int[] insertionSort(int[] arr){

        // initialize variable for length of unsorted list
        int p = arr.length;

        // Outer loop picks each element one by one
        for(int i = 1; i < p; i++){
            int key = arr[i]; // The current element to be inserted

            // pointer to keep track of sorted list
            int j = i - 1;

            // Shift elements that are greater than key to the right
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }

            // Insert the element(key) in its correct position
            arr[j+1] = key;
        }
        return arr;
    }


}
