package dataStructures.queue;

/**
 * Created by florakalisa on 10/15/16.
 */
public class QueueWithArray {

    public static void main(String[] args) {

        //test my queue here
    }
}


class QueueArray<T>{

    T[] myArray = null;


    QueueArray(int capacity){
        myArray = ( T[])new Object[capacity];
    }

   private int head;
    private int tail;



    boolean isEmpty(){

        return false;
    }

    public T dequeue() throws Exception {

        return null;

    }


    public void enqueue(T item) throws Exception {


    }
}