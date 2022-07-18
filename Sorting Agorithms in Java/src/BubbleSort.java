public class BubbleSort {
    public static void sort(int[] arr){
        boolean sorted;
        int i =0;

        while(true){
            if(i == arr.length-1) i=0;
            sorted = true;
            for(int j = 0; j < arr.length-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                    sorted = false;
                }
            }
            if(sorted) break;
        }
    }
}
