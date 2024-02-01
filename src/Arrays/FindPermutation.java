package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FindPermutation {
        public static void findAllPermutations(String s,int idx,int n,List<String> ans){
            if(idx == n){
                String ds = "";
                for(int i=0;i<n;i++){
                    ds+=s.charAt(i);
                }
                if(!ans.contains(ds)){
                    ans.add(ds);
                }

                return;
            }
            for(int i=idx;i<n;i++){
                s=swap(s,i,idx);
                findAllPermutations(s,idx+1,n,ans);
                s=swap(s,i,idx);
            }
        }
        public static String swap(String str, int i, int j)
        {
            StringBuilder sb = new StringBuilder(str);
            sb.setCharAt(i, str.charAt(j));
            sb.setCharAt(j, str.charAt(i));
            return sb.toString();
        }
        public static List<String> find_permutation(String S) {
            List<String> ans = new ArrayList<>();
            findAllPermutations(S,0,S.length(),ans);
            Collections.sort(ans);
            return ans;
        }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            String ch = sc.next();
            List<String> ans = new ArrayList<>();
            ans=find_permutation(ch);
            for(int i=0;i<ans.size();i++){
                System.out.println(ans.get(i)+" ");
            }
        }
}
//TIME complexity : O(n! X n)
//Space Complexity : 0(n)+O(n)