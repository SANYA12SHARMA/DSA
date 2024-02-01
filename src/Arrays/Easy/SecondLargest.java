package Arrays.Easy;

import java.util.Scanner;

public class SecondLargest {
    public static int[] getSecondOrderElements(int[] array,int n){
        if(n == 1){
            int arr[]={0,0};
            return arr;
        }
        int maxi = array[0];
        int second_maxi = Integer.MIN_VALUE;
        int mini = array[0];
        int second_mini = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(array[i]>maxi){
                second_maxi=maxi;
                maxi=array[i];
            }
            else if (maxi>array[i] && array[i]>second_maxi){
                second_maxi = array[i];
            }
            if(array[i]<mini){
                second_mini=mini;
                mini = array[i];
            }else if(mini<array[i] && array[i]<second_mini){
                second_mini = array[i];
            }
        }
        int arr[] = new int[2];
        arr[0] = second_maxi;
        arr[1] = second_mini;
        return arr;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr_size = sc.nextInt();
        int array[] = new int[arr_size];
        for(int i=0;i<arr_size;i++){
            array[i] = sc.nextInt();
        }
        int second_order[] = new int[2];
        second_order=getSecondOrderElements(array,arr_size);
        for(int i=0;i<2;i++){
            System.out.println(second_order[i]);
        }
    }
}
//Time Complexity : O(N)
//Space Complexity : O(1)