package dataStructures;

/**
 * Created by florakalisa on 10/15/16.
 * LIFO : Last In Fist Out
 * With linkedList, no problem with the size
 */
public class StackWithLinkedList {

    public static void main(String[] args) {

        //test the stack here

    }

}

class Stack<T>{


    static class  Node<T>{


        private T item;
        private Node<T> next;

        Node(T item) {
            this.item = item;
            next = null;
        }
    }

    private Node<T> first = null;
    public void push(T item){

        Node node = new Node(item);
        node.next = first;
        first= node;


    }

    public T pop() throws Exception {
        if(first==null) {
            throw new Exception("stack empty!");
        }
        T item = first.item;
        first = first.next;
        return item;
    }

    public T peek() throws Exception {
        if(first == null) {
            throw new Exception("stack empty!");
        }
        return first.item;
    }



    public boolean isEmpty(){
        return first == null;
    }

}
