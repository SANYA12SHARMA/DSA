package UCAPrograms;

import java.util.ArrayList;

class DisjointSet {
    //parent
    ArrayList<Integer> parent = new ArrayList<>();
    //rank
    ArrayList<Integer> rank = new ArrayList<>();

    public DisjointSet(int n){
        for(int i = 0; i <= n; i++){
            parent.add(i);
            rank.add(0);
        }
    }

    //find Parent
    public int findUlp(int u){
        if(u == parent.get(u)){
            return u;
        }
        int ulp = findUlp(parent.get(u));
        parent.set(u,ulp);
        return parent.get(u);
    }

    //find Union By Rank of Two Nodes
    public void unionByRank(int u , int v){
        int ulp_u = findUlp(u);
        int ulp_v = findUlp(v);
        if(ulp_u == ulp_v){
            return;
        }
        if(rank.get(ulp_u) < rank.get(ulp_v)){
            parent.set(ulp_u,ulp_v);
        }else if(rank.get(ulp_v) < rank.get(ulp_u)){
            parent.set(ulp_v,ulp_u);
        }else{
            parent.set(ulp_v,ulp_u);
            int rankU = rank.get(ulp_u);
            rank.set(ulp_u,rankU+1);
        }
    }

}
public class Main {
    public static void main (String[] args) {
        DisjointSet ds = new DisjointSet(7);
        ds.unionByRank(1, 2);
        ds.unionByRank(2, 3);
        ds.unionByRank(4, 5);
        ds.unionByRank(6, 7);
        ds.unionByRank(5, 6);

        // if 3 and 7 same or not
        if (ds.findUlp(3) == ds.findUlp(7)) {
            System.out.println("Same");
        } else
            System.out.println("Not Same");

        ds.unionByRank(3, 7);
        if (ds.findUlp(3) == ds.findUlp(7)) {
            System.out.println("Same");
        } else
            System.out.println("Not Same");
    }
}