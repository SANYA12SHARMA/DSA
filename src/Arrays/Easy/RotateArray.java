package Arrays.Easy;

import java.util.Scanner;

public class RotateArray {
    public static void rotate(int[] nums,int num_len,int k){
        int[] nums1 = new int[num_len];
        for(int i=0;i<num_len;i++){
            nums1[(i+k)%num_len] = nums[i];
        }
        for(int i=0;i<num_len;i++){
            nums[i]=nums1[i];
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num_len = sc.nextInt();
        int []nums = new int[num_len];
        for(int i=0;i<num_len;i++){
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        rotate(nums,num_len,k);
        System.out.println("Array After Rotation ");
        for(int i=0;i<num_len;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
