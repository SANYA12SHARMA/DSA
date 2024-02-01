package Arrays.Easy;

import java.util.Scanner;

public class moveZero {
    public static int[] moveZeros(int n,int[] a){
        int break_point = 0;
        for(int i=0;i<n;i++){
            if(a[i]==0){
                break_point=i;
                break;
            }
        }
        for(int j=break_point;j<n;j++){
            if(a[j]!=0){
                int temp=a[break_point];
                a[break_point]=a[j];
                a[j]=temp;
                break_point++;
            }
        }
        return a;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num_len = sc.nextInt();
        int []nums = new int[num_len];
        for(int i=0;i<num_len;i++){
            nums[i] = sc.nextInt();
        }
        nums = moveZeros(num_len,nums);
        System.out.println("Array After Moving Zeroes ");
        for(int i=0;i<num_len;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
