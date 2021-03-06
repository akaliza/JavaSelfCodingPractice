package algorithms.dynamicConnectivity;

/**
 * Created by florakalisa on 10/4/16.
 * QuickFind is a QuickUnion(UF) algorithm
 * Time complexity :  quadratique time (N*N)
 * Space complexity :
 */
public class QuickFindUF{

    private int [] id;

    public QuickFindUF(int N){

        id = new int[N];
        for(int i =0; i < id.length; i ++){
            id[i] = i; //N arrays accesses, at the beginning none of the nodes are connected
        }
    }

    public boolean connected(int p, int q){
        return id[q]==id[q]; //2 arrays accesses
    }

    public void union(int p, int q){

        int pid= id[p];
        int qid = id[q];

        for(int i =0; i < id.length; i++){//2N +2 arrays accesses
            if(id[i]==pid){
                id[i]=qid;
            }
        }

    }
}
