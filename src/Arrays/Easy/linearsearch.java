package Arrays.Easy;

import java.util.Scanner;

public class linearsearch {
    public static int linearSearch(int n,int[] array,int num){
        if(n==0) return -1;
        for(int i=0;i<n;i++){
            if(num==array[i]) return i;
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr_size = sc.nextInt();
        int array[] = new int[arr_size];
        for(int i=0;i<arr_size;i++){
            array[i] = sc.nextInt();
        }
        int num = sc.nextInt();
        int find_idx = linearSearch(arr_size,array,num);
        System.out.println("Find at which index "+find_idx);
    }
}
//Time Complexity : O(N)
//Space Complexity : O(1)