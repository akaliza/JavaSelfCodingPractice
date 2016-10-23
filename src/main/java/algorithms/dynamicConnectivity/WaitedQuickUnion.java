package algorithms.dynamicConnectivity;

/**
 * Created by florakalisa on 10/7/16.
 * deeth of any node x is at most log(N)
 */
public class WaitedQuickUnion {

    private int [] id;
    private int [] sz;

    public WaitedQuickUnion(int N){

        id = new int[N];
        sz = new int[N];

        for(int i =0; i < id.length; i ++){
            id[i] = i;
        }
    }


    private int root(int i){

        while(i != id[i])  i = id[i];
        return i;

    }
    public void union(int p, int q) {

        int i = root(p);
        int j = root(q);

        if(i ==j )return;
        if(sz[i] < sz[j]){
            id[i] = j; sz[j]+=sz[i];
        }else{
            id[j] = i; sz[i] += sz[j];
        }

    }

    public boolean connected(int p, int q) {
        return root(p)==root(q);
    }
}
