import java.util.Random;

public class Tester {

   SortingAlg salg;

    public Tester(SortingAlg sa){

        salg = sa;
    }
    public Tester(){

    }

    public static double singleTest(int size, SortingAlg sort){
        Random rand = new Random();
        int[] array = new int[size];

        for(int i = 0; i < size; i++){
            array[i] = rand.nextInt();
        }

        double startTime = (double) System.nanoTime();
        sort.sorty(array);
        double endTime = (double) System.nanoTime();

        double total = (endTime - startTime)  / 1000000000;
        System.out.println("Total time: " + total);
        return total;
    }

    public double test(int iterations, int size, SortingAlg sort){
        double total = 0;
        for(int i = 0; i < iterations; i++){
            total += singleTest(size, sort);
        }
        total /= iterations;
        return total;
    }

    public static int[] generateKSorted(int[] input){
        int size = input.length;
        for(int gap  = size / 10; gap > 0; gap = 0){
            for(int i = gap; i < size; i++){
                int temp = input[i];
                int j = i;
                while(j >= gap && input[j - gap] > temp){
                    input[j] = input[j - gap];
                    j = j - gap;
                }
                input[j] = temp;
            }
        }
        return input;
    }

    public double testKVar(int iterations, int size, SortingAlg sort){
        Random rand = new Random();
        int[] array = new int[size];

        for(int i = 0; i < size; i++){
            array[i] = rand.nextInt();
        }

        array = generateKSorted(array);

        double startTime = (double) System.nanoTime();
        sort.sorty(array);
        double endTime = (double) System.nanoTime();

        double total = (endTime - startTime)  / 1000000000;
        System.out.println("Total time: " + total);
        return total;
    }


}
