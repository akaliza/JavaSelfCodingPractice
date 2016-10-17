package designpatterns;

import java.util.Iterator;

/**
 * Created by florakalisa on 10/16/16.
 * Iterable interface :  has a method that returns an Iterator
 * Iterator interface : has 2 methods :
 * Thatnks to Iterable pattern, we can use foreach statement on client side
 *
 */
public class TestIterable {

    public static void main(String[] args) {


    }
}

//My stack
class StackLindedList<T> implements Iterable<T> {

    private static class Node<T>{


        private T item;
        private Node<T> next = null;

        Node(T item) {
            this.item = item;
        }
    }

    private Node<T> first;

    @Override
    public Iterator<T> iterator() {
        return new MyListIterator();
    }


    private class MyListIterator implements Iterator<T> {

        private Node current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            T item = (T) current.item;
            current = current.next;
            return item;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("remove is not supported");
        }
    }
}

//
class StackArray<T> implements Iterable<T> {


    @Override
    public Iterator<T> iterator() {
        return new MyListIterator();
    }

    private int N;
    private T[] myArray ;


    class MyListIterator implements Iterator<T> {

        private int current = N;

        @Override
        public boolean hasNext() {
            return current > 0;
        }

        @Override
        public T next() {
            return myArray[--current];
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("remove is not supported");
        }
    }
}

