package alro4.list;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;
import java.awt.print.PrinterException;
import java.util.Iterator;

/**
 * @author dongchen
 * @Data 2021/1/1
 * @Time 9:52
 */
public class TwoWayLinkList<T> implements Iterable<T>{


    private Node head;
    private Node last;
    private int N;

    public TwoWayLinkList() {
        head = new Node(null, null, last);
        last = null;
        N = 0;
    }

    public void clear() {

        head.next = last;
        last = null;
        N = 0;

    }

    public boolean isEmpty() {

        return N == 0;
    }

    public int length() {
        return N;
    }

    public T get(int i) {
        Node n = head.next;
        for (int j = 0; j < i; j++) {
            n = n.next;
        }
        return n.item;
    }

    public void insert(T t) {
        if (last == null) {
            Node newNode = new Node(t, head, null);
            head.next = newNode;
            last = newNode;
        } else {
            Node oldLast = last;
            Node newNode = new Node(t, last, null);
            oldLast.next = newNode;
//            newNode.pre = last;
            last = newNode;
        }
        N++;
    }

    public void insert(int i, T t) {
        Node n = head;
        for (int j = 0; j < i; j++) {
            n = n.next;
        }

        Node newNode = new Node(t,n,n.next);
        n.next = newNode;
        newNode.pre = n;
        newNode.next = n.next;
        N++;

    }

    public T remove(int i) {
        Node pre = head;
        for (int j = 0; j < i; j++) {
            pre = pre.next;
        }
        Node curr = pre.next;
        pre = curr.next;
        curr.next.pre = pre;
        N--;
        return curr.item;


    }

    public int indexOf(T t) {

        Node n = head;
        for (int i = 0; i < N; i++) {
            n = n.next;
            if (n.item.equals(t)){
                return i;
            }
        }
       return -1;
    }

    public T getFirst() {
        if (head.next == null) {
            return null;
        } else {
            return head.next.item;
        }
    }

    public T getLast() {
        if (last == null) {
            return null;
        } else {
            return last.item;
        }
    }

    @Override
    public Iterator iterator() {
        return new ITwoWayLinkList();
    }

    private class ITwoWayLinkList implements Iterator{
        private Node curr = head;


        @Override
        public boolean hasNext() {

            return curr.next != null;
        }

        @Override
        public T next() {
            curr = curr.next;

            return curr.item;
        }
    }

    private class Node {
        private T item;
        private Node pre;
        private Node next;

        public Node(T t, Node pre, Node next) {
            this.item = t;
            this.pre = pre;
            this.next = next;
        }

    }
}
