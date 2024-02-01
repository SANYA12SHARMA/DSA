package Arrays.Easy;

import java.util.Scanner;

public class removeduplicates {
    public static int remove_duplic(int[] array,int n){
        int k=0;
        for(int i=1;i<n;i++){
            if(array[k]<array[i]){
                k++;
                array[k]=array[i];
            }
        }
        return k+1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr_size = sc.nextInt();
        int array[] = new int[arr_size];
        for(int i=0;i<arr_size;i++){
            array[i] = sc.nextInt();
        }
        int new_length = remove_duplic(array,arr_size);
        System.out.println("New Length "+remove_duplic(array,arr_size));
    }
}
//Time Complexity : O(N)
//Space Complexity : O(1)