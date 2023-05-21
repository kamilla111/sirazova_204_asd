package hw_aisd;

import java.util.*;

public class QuickFind {
    public static void main(String[] args) {
        QuickFind neqGraf = new QuickFind(7);
        neqGraf.union(4, 6);
        System.out.println(neqGraf.connected(4, 5));
        System.out.println(neqGraf.toString());
    }
    int[] id;

    public QuickFind(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++){
            id[i] = i;
        }
    }

    public String connected(int p, int q) {
        if(id[p] == id[q]){
            return "("+p+","+q+")";
        }
        return null;
    }

    public void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i < id.length; i++){
            if (id[i] == pid){
                id[i] = qid;
            }
        }
    }

    @Override
    public String toString() {
        return "QuickFind{" +
                "id=" + Arrays.toString(id) +
                '}';
    }
}