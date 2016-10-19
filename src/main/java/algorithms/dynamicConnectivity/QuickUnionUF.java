package algorithms.dynamicConnectivity;

/**
 * Created by florakalisa on 10/4/16.
 * QuickUnion is a QuickUnion(UF) algorithm
 * the tree can be tall, for skinny tree
 */
public class QuickUnionUF{

    private int [] id;

    public QuickUnionUF(int N){

        id = new int[N];
        for(int i =0; i < id.length; i ++){
            id[i] = i; //N arrays accesses
        }
    }


    private int root(int i){

        while(i != id[i])  i = id[i];
        return i;

    }
    public void union(int p, int q){
        int i = root(p);
        int j = root(p);
        id[i] = j;
    }

    public boolean connected(int p, int q){
        return root(p) ==root(q);
    }



}


