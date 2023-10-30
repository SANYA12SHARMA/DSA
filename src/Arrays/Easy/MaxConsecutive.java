package Arrays.Easy;

import java.util.Scanner;

public class MaxConsecutive {
    public static int traff(int n,int m,int[] vehicle){
        int left = 0;
        int right = 0;
        int flipped = 0;
        int maxi = 0;
        while( right < n){

            if(flipped <= m && vehicle[right] == 0){
                flipped++;
            }
            while( flipped > m && left <= right ){
                if(vehicle[left] == 0){
                    flipped--;

                }
                left++;

            }

            maxi = Math.max(maxi,right-left+1);
            right++;
        }
        return maxi;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num_len = sc.nextInt();
        int []nums = new int[num_len];
        for(int i=0;i<num_len;i++){
            nums[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int traffic = traff(num_len,m,nums);
        System.out.println(traffic);
    }
}
