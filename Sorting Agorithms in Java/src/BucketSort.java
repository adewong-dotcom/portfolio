import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {
    int array[];
    
    public BucketSort(int array[]){
        this.array = array;
    }
    void sort(){
        int numBuckets = (int) Math.round(Math.sqrt(array.length));
        int maxValue = Integer.MIN_VALUE;

        for(int i = 0; i<array.length; i++){
            maxValue = Math.max(array[i], maxValue);
        }
        ArrayList<Integer>[] buckets = new ArrayList[numBuckets];
        for (int i = 0; i<buckets.length; i++){
            buckets[i] = new ArrayList<Integer>();
        }

        for(int value: array){
            int bucket = appropriateBucket(value, numBuckets, maxValue);
            buckets[bucket-1].add(value);
        }

        int j = 0;
        for(ArrayList<Integer> bucket: buckets){
            Collections.sort(bucket);
            for(int num: bucket){
                array[j] = num;
                j++;
            }
        }
    }
    public static int appropriateBucket(int value, int numBuckets, int max){
        double operation = (float)value * numBuckets / max;
        int bucket = (int) Math.ceil(operation);
        return bucket;
    }
}
