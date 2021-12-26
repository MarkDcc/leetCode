package alro4.list;

import java.io.PipedReader;
import java.util.Iterator;

/**
 * @author dongchen
 * @Data 2021/1/3
 * @Time 9:59
 */
public class Stack<T> implements Iterable<T> {
    private int N;
    private Node head;

    public Stack() {
        N = 0;
        this.head = new Node(null,null);
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public void push(T t) {
        Node n = head;
        Node oldFirst = head.next;
        Node newNode = new Node(t,null);
        head.next = newNode;
        newNode.next = oldFirst;
        N++;
    }

    public T pop() {
        if(head.next == null){
            return null;
        }
        Node n = head;
        Node oldFirst = head.next;
        head.next = oldFirst.next;
        N--;
        return oldFirst.item;

    }

    @Override
    public Iterator<T> iterator() {
        return new SIterator();
    }

    private class SIterator implements Iterator{
        private Node first;
        public SIterator(){
            this.first = head;
        }

        @Override
        public boolean hasNext() {
            return first.next != null;
        }

        @Override
        public Object next() {
            first = first.next;

            return first.item;
        }
    }


    private class Node{
        private T item;
        private Node next;
        public Node(T item,Node next){
            this.item = item;
            this.next = next;
        }
    }
}
