public class InsertionSort {
    public static int[] sort(int[] arr){
        //Base cases
        if(arr.length <= 1) return arr;
        int[] sorted = new int[arr.length];
        int index = 0;
        int current = 0;

        while(index != arr.length){
            if(index==0) sorted[index] = arr[current];
            for(int i = index-1; i >= 0; i--){
                if(arr[current] < sorted [i]){
                    sorted[i+1] = sorted[i];
                    sorted[i] = arr[current];
                }
                else{
                    sorted[i+1] = arr[current];
                    break;
                }
            }
            current++;
            index++;
        }
        return sorted;
    }
}

