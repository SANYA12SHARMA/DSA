package Arrays.Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Superior {
    public static List< Integer > superiorElements(int []a) {
        List<Integer> li =new ArrayList<>();
        int maxi = a[a.length-1];
        li.add(maxi);
        for(int i=a.length-2;i>=0;i--){
            if(a[i]>maxi){
                li.add(a[i]);
                maxi=a[i];
            }
        }
        Collections.sort(li);
        return li;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num_len = sc.nextInt();
        int []nums = new int[num_len];
        for(int i=0;i<num_len;i++){
            nums[i] = sc.nextInt();
        }
        List<Integer> li = new ArrayList<>();
                li=superiorElements(nums);
                for(int i=0;i<li.size();i++){
                    System.out.println(li.get(i)+" ");
                }
    }
}
/*
Time Complexity: O(N) { Since the array is traversed single time back to front, it will consume O(N) of time where N = size of the array }.

Space Complexity: O(N) { There is no extra space being used in this approach. But, a O(N) of space for ans array will be used in the worst case }.
* */