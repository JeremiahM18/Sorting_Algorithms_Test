import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class MainKSort {

    public static void main(String[] args) {


        File outputFile = new File("KSortTimes.txt");
        SortingAlg[] sorts = {new BubbleSort(), new InsertionSort(),
                new MergeSort(), new SelectionSort(),
                new QuickSort(), new ShellSort()};

        int[] arr = {100, 500, 1000, 2000, 5000, 10000, 20000, 75000, 150000};

        try {
            PrintWriter writer = new PrintWriter(outputFile, StandardCharsets.UTF_8);

            Tester tester = new Tester();
            for (int i = 0; i < sorts.length; i++) {
                writer.println("Sorting algorithm - " +
                        sorts[i].getClass().getSimpleName());
                for (int j = 0; j < arr.length; j++) {
                    writer.print("Sorted " + arr[j] + " elements in ");
                    writer.print(tester.testKVar(20, arr[j], sorts[i]) + " s(avg)");
                    writer.println();
                }
                writer.println();
            }

            writer.close();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

