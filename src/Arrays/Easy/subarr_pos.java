package Arrays.Easy;

import java.util.Scanner;

public class subarr_pos {
    public static int longestSubarrayWithSumK(int[] nums,int n,long k){
        long sum = nums[0];
        int left = 0;
        int right = 0;
        int maxLen=0;
        while(right<n){
            while(left<=right && sum>k){
                sum -= nums[left];
                left++;
            }
            if(sum==k){
                maxLen = Math.max(maxLen,right-left+1);
            }
            right++;
            if(right<n){
                sum += nums[right];
            }
        }
        return maxLen;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num_len = sc.nextInt();
        int []nums = new int[num_len];
        for(int i=0;i<num_len;i++){
            nums[i] = sc.nextInt();
        }
        long k = sc.nextLong();
        int lengthSubArray = longestSubarrayWithSumK(nums,num_len,k);
        System.out.println(lengthSubArray);

    }
}
//TC: O(2*N) as innerloop will run for n times in total
//SC:0(1)