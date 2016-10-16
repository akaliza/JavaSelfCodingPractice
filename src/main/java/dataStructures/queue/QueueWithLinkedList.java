package dataStructures.queue;

/**
 * Created by florakalisa on 10/15/16.
 */
public class QueueWithLinkedList {


    public static void main(String[] args) {
        //test the queue here
    }
}

class Queue<T>{
    private static class  Node<T>{
        private T item;
        private Node<T> next;

        Node(T item) {
            this.item = item;
        }
    }

    private Node<T> first;
    private Node<T> last;


    public boolean isEmpty(){
        return first == null;
    }

    public void enqueue(T item){

        Node<T> node = new Node<T>(item);
        if(last!=null){
            last.next = node;
        }
        last = node;
        if(first==null){
            first = last;
        }
    }

    public T dequeue() throws Exception {
        if(first == null) throw new Exception("Queue is empty!");

        T item = first.item;
        first = first.next;

        if(first == null){
            last = null;
        }



        return item;
    }

    public T peek() throws Exception {
        if(first == null) throw  new Exception("Queue is empty!");

        return first.item;
    }



}
