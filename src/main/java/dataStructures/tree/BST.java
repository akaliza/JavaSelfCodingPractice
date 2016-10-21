package dataStructures.tree;

/**
 * Created by florakalisa on 10/21/16.
 * BST : Binary Search Tree, or ordered or sorted binary trees
 * Balanced Tree : insert O(log(n)), find O(log(n))
 * Traversing : InOrder (A, B, C), PreOrder(B, A, C), PostOrder(A,C,B)
 * UnBalanced Tree : insert O(n), find O(n)
 * Search‎: ‎Θ(log n)	Delete‎: ‎Θ(log n)
 * Insert‎: ‎Θ(log n)	Space‎: ‎Θ(n)
 *
 *
 */
public class BST {

    public static void main(String[] args) {
    }

}

class Node {
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;

    }

    boolean checkBST(Node root) {
        return false;
    }

    public void insert(int value){
        if(value <= data){
            if(left == null){
                left = new Node(value);
            }else{
                left.insert(value);
            }

        }else{
            if(right == null){
                right = new Node(value);
            }else{
                right.insert(value);
            }

        }

    }
}
