package algorithms.dynamicConnectivity;

/**
 * Created by florakalisa on 10/4/16.
 */
public interface UnionFind{

    public void union(int p, int q);

    public boolean connected(int p, int q);

}
