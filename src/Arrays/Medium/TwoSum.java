package Arrays.Medium;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public static String read(int n,int[]nums,int target){
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i=0;i<n;i++){
            if(hash.containsKey(target-nums[i])){
                return "YES";
            }
            hash.put(nums[i],i);
        }
        return "NO";
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num_len = sc.nextInt();
        int []nums = new int[num_len];
        for(int i=0;i<num_len;i++){
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(read(num_len,nums,target));
    }
}
//TC: O(N)
//SC: 0(N)
//TWO POINTER APPROACH AFTER SORTING ARRAY IF MAP NOT ALLOWED