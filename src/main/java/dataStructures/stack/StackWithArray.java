package dataStructures.stack;

/**
 * Created by florakalisa on 10/15/16.
 * LIFO : Last In First Out
 * With arrays, we need to think of resizing the arrays
 * Consideration:resizing the array ,null items, loitering(reference to an object when no longer needed)
 * Java does not allow generic array creation => (T[]) new Object[capacity]
 */
public class StackWithArray {

    public static void main(String[] args) {

    }



}

class StackArray<T>{

    private T [] myArray = null;
    private int i = 0;

    StackArray(int capacity){
        myArray = (T[]) new Object[capacity];
    }


    public T pop() throws Exception {
        if(i==0){
            throw new Exception("the array is empty!");
        }

        myArray[i]=null;

        if(i>0 && i ==  myArray.length/4){
            resize(myArray.length/2);
        }
        return myArray[--i];

    }


    public void push(T item) throws Exception {
        if(i==myArray.length){
            resize(myArray.length*2);

        }
        myArray[i++]= item;
    }

    public T peek() throws Exception {

        return null;
    }

    public boolean isEmpty() throws Exception {
        return i==0;
    }

    private void resize(int capacity){

        T[] copy = (T[])new Object[capacity];
        for(int i=0; i< myArray.length;i++){
            copy[i]=myArray[i];
        }
        myArray = copy;

    }

}