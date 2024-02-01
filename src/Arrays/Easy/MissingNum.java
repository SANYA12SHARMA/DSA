package Arrays.Easy;

import java.util.Scanner;

public class MissingNum {
    public static int missingNumber(int[] array,int n){
        int ans = 0;
        for(int i=0;i<array.length;i++){
            ans = ans ^ array[i];
        }
        for(int i=1;i<=array.length;i++){
            ans = ans ^ i;
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
        int missing_num = missingNumber(array,arr_size);
        System.out.println("Missing Element "+missing_num);
    }
}
//TC: O(N)
//SC: O(1)