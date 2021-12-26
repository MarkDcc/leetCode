package alro4.list;

import java.util.Iterator;

/**
 * @author dongchen
 * @Data 2021/1/3
 * @Time 10:51
 */
public class Queue<T> implements Iterable<T>{
    private Node head;
    private int N;
    private Node last;

    public Queue() {
        this.head = new Node(null, null);
        N = 0;
        last = null;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public T dequeue() {
        if (head.next == null) {
            return null;
        }
        Node first = head.next;
        head.next = first.next;
        N--;
        if(head.next == null){
            last = null;
        }
        return first.item;

    }

    public void enqueue(T t) {
        Node newNode = new Node(t, null);
        if(last == null){

            head.next = newNode;
            last = newNode;
        }else {
            Node oldLast = last;
            oldLast.next = newNode;
            last = newNode;
        }
        N++;

    }

    @Override
    public Iterator<T> iterator() {
        return new QItetator();
    }

    private class QItetator implements Iterator{
        private Node n ;

        public QItetator(){
            n = head;
        }

        @Override
        public boolean hasNext() {
            return n.next != null;
        }

        @Override
        public Object next() {
            n = n.next;
            return n.item;
        }
    }


    private class Node {
        private T item;
        private Node next;

        public Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }
    }
}
