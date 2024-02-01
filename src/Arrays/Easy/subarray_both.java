package Arrays.Easy;

import java.util.HashMap;
import java.util.Scanner;

public class subarray_both {
    public static int longestSubarrayWithSumK(int[] nums,int n,long k){
        long prefixSum = 0;
        int maxLen=0;
        HashMap<Long,Integer> hash =new HashMap<>();
        for(int i=0;i<n;i++){
            prefixSum+=nums[i];
            if(prefixSum == k){
                maxLen = i+1;
            }else if(hash.containsKey(prefixSum-k)){
                    maxLen = Math.max(maxLen,i-hash.get(prefixSum-k));
        }
            if(!hash.containsKey(prefixSum)){
                hash.put(prefixSum,i);
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
//TC:O(N)
//SC:O(N)