public class SelectionSort{
    public static int[] sort(int[] arr){
        //Base Case
        if (arr.length <= 1) return arr;

        int[] sorted = new int[arr.length];
        int index =0;
        int minViable = Integer.MAX_VALUE;

        while(index != arr.length){
            int currentMin = Integer.MAX_VALUE;
            for (int i= 0; i<arr.length; i++){
                if(index == 0 && arr[i] < minViable){
                    minViable = arr[i];
                }
                else{
                    if(arr[i]>minViable && arr[i] <currentMin){
                        currentMin = arr[i];
                    }
                }
            }
            if(index == 0){
                sorted[index] = minViable;
            }
            else{
                sorted[index] = currentMin;
                minViable = currentMin;
            }
            index++;
        }
        return sorted;
    }
}