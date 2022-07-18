import java.lang.management.ManagementFactory.*;

public class App {
    public static void printLoop(int[] arr){
        for(int i=0; i<arr.length; i++){
            if(i < arr.length-1){
                System.out.print(arr[i] + ", ");
            }
            else{
                System.out.print(arr[i]);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        int[] unsorted = {50,31,21,28,72,41,73,93,68,43,45,78,5,17,97,71,69,61,88,75,99,44,55,9};
        printLoop(unsorted);
        //double startTime = System.currentTimeMillis();
        //int[] sorted = SelectionSort.sort(unsorted);
        //System.out.println("Sorted array using SelectionSort: ");
        //printLoop(sorted);
        int[] sortedInsertion = InsertionSort.sort(unsorted);
        System.out.println("Sorted array using InsertionSort: ");
        printLoop(sortedInsertion);
        //System.out.println("Sorted array using BubbleSort: ");
        //BubbleSort.sort(unsorted);
        BucketSort bucket = new BucketSort(unsorted);
        bucket.sort();
        System.out.println("Sorted array using BucketSort: ");
        printLoop(bucket.array);
        //double endTime = System.currentTimeMillis();
        //printLoop(unsorted);
        //System.out.println("Bubblesort took: " + (endTime - startTime) + " ms");
        //System.out.println("Runtime based on RuntimeMXBean: " );
    }
}
