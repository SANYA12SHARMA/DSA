package Test;
import ds.MyHeap;

import java.util.Arrays;
import java.util.Random;

public class MyHeapTest {
    private static final int capacity = 5;
    public static void TestMinHeap(){
        System.out.println("Testing Min Heap");
        MyHeap minHeap = new MyHeap(capacity);
        int arr[] = new int[capacity];
        Random r = new Random();
        for(int i = 0; i < capacity; i++){
            int temp = (int)(r.nextFloat()*capacity*10);
            arr[i] = temp;
            minHeap.insert(temp);
            System.out.println(minHeap);
        }
        Arrays.sort(arr);

        for(int i = 0; i < capacity; i++){
            assert arr[i] == minHeap.delMin();
        }
    }
    public static void TestMaxHeap(){
        System.out.println("Testing Max Heap");
        MyHeap maxHeap = new MyHeap(capacity,true);
        int arr[] = new int[capacity];
        Random r = new Random();
        for(int i = 0; i < capacity; i++){
            int temp = (int)(r.nextFloat()*capacity*10);
            arr[i] = temp;
            maxHeap.insert(temp);
            System.out.println(maxHeap);
        }
        Arrays.sort(arr);
        System.out.println(maxHeap);
        for(int i = 0; i < capacity; i++){
            assert arr[capacity-1-i] == maxHeap.delMax();
        }
    }
    public static void main(String[] args){
        TestMinHeap();
        TestMaxHeap();
        System.out.println("All test cases passed");
    }

}
