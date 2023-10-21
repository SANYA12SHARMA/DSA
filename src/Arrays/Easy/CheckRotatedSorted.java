package Arrays.Easy;

import java.util.Scanner;

public class CheckRotatedSorted {
    public static boolean isSorted(int[] array,int n){
        int cnt = 0;
        for(int i=0;i<n-1;i++){
            if(array[i]>array[i+1]){
                cnt++;
            }
        }
        if(array[n-1]>array[0]){
            cnt++;
        }
        return cnt<=1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr_size = sc.nextInt();
        int array[] = new int[arr_size];
        for(int i=0;i<arr_size;i++){
            array[i] = sc.nextInt();
        }
        boolean check_is_sorted = isSorted(array,arr_size);
        System.out.println("Check if array is sorted or not: "+check_is_sorted);
    }
}
