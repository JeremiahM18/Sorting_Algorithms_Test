/*
* Question 6: Implement sorting a list using Shell Sort algorithm.
 */


public class ShellSort {

    public static int[] ShellSort(int[] arr) {
        int a = arr.length;

        // Start with gap = a/2, reduce by half each iteration
        for(int gap = a/2; gap > 0; gap/=2){
            // Perform gapped insertion sort
            for(int i = gap; i < a; i++){
                int temp = arr[i];
                int j = i - gap;

                // Shift elements that are greater than temp to the right
                while(j >= gap && arr[j] > temp){
                    arr[j] = arr[j - gap];
                    j -= gap;
                }

                // Place temp at its correct position
                arr[j] = temp;
            }

        }
        return arr;
    }
}
