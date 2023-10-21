package Arrays.Easy;

import java.util.Scanner;

public class SingleEle {
    public static int getSingleElement(int[] array,int n){
        int ans=0;
        for(int i=0;i<n;i++){
            ans = ans ^ array[i];
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr_size = sc.nextInt();
        int array[] = new int[arr_size];
        for(int i=0;i<arr_size;i++){
            array[i] = sc.nextInt();
        }
        int single_ele=getSingleElement(array,arr_size);
        System.out.println("Single Element "+single_ele);
    }
}
