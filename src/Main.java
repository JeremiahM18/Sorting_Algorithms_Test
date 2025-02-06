public class Main {

    public static void main(String[] args) {
        MergeSort q1 = new MergeSort();
        InsertionSort q2 = new InsertionSort();
        QuickSort q3 = new QuickSort();

        int[] list1 = {1, 25, 31, 16};
        int[] list2 = {-3, 0, 16, 27};
        int[] list3 = {-1, -5, 67, -10, 21, 8, 4, 1};
        int[] list4 = {-5, 42, 6, 19, 11, 25, 26, -3};

        int[] result1 = q1.merge(list1, list2);

        // Print result of merged array manually
        System.out.print("Merged Sorted List: ");
        for (int i = 0; i < result1.length; i++) {
            System.out.print(result1[i] + " ");
        }
        System.out.println();
        System.out.print("Unsorted array: ");
        for(int num : list3){
            System.out.print(num + " ");
        }
        System.out.println();
        q2.insertionSort(list3);

        System.out.print("Insertion Sorted List: ");
        for(int num : list3){
            System.out.print(num + " ");
        }
        System.out.println();

        q3.quickSort(list4, 0, list4.length - 1);
        System.out.print("Quick Sorted List: ");
        for(int num : list4){
            System.out.print(num + " ");

        }

    }
}
