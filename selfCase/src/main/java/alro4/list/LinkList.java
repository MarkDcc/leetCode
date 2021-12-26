package alro4.list;

import java.util.Iterator;

/**
 * @author dongchen
 * @Data 2020/12/30
 * @Time 18:53
 */
public class LinkList<T> implements Iterable<T> {
    private Node head;
    private int N;

    public LinkList() {
        head = new Node(null, null);
        N = 0;
    }

    public void clear() {
        head.next = null;
        N = 0;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int length() {
        return N;
    }

    public T get(int i) {

        Node n = head;
        for (int j = 0; j < i; j++) {
            n = n.next;
        }
        return n.item;
    }

    public void insert(T t) {
        Node n = head;
        while (n.next != null) {
            n = n.next;
        }
        n.next = new Node(t, null);
        N++;
    }

    public void insert(int i, T t) {
        Node pre = head;

        for (int j = 0; j < i - 1; j++) {
            pre = pre.next;
        }
        //当前node
        Node curr = new Node(t, pre.next);
        pre.next = curr;
        N++;

    }

    public T remove(int i) {
        Node n = head;
        for (int j = 0; j < i - 1; j++) {
            n = n.next;
        }
        T result = n.next.item;
        n.next = n.next.next;

        N--;

        return result;
    }

    public int indexOf(T t) {
        Node n = head.next;
        for (int i = 0; i < N; i++) {
            if (n.item.equals(t)) {
                return i;
            }
            n = n.next;

        }
        return -1;
    }

    //单链表反转
    public void reverse(){
        Node curr = head;
        reverse(head.next);
    }

    public Node reverse(Node curr){
        if(curr.next == null){
            head.next = curr;
            curr.next = null;
            return curr;
        }
        //返回的是反转后当前节点的上一个节点,如原链1->2->3，当前节点是2，则返会的是3
        Node pre = reverse(curr.next);
        pre.next = curr;
        curr.next = null;
        return curr;
    }

    @Override
    public Iterator<T> iterator() {
        return new LIterator();
    }

    private class LIterator implements Iterator<T> {
        private Node pre;

        public LIterator() {
            this.pre = head;
        }

        @Override
        public boolean hasNext() {

            return pre.next != null;
        }

        @Override
        public T next() {
            pre = pre.next;
            return pre.item;
        }
    }

    private class Node {
        public T item;
        public Node next;

        public Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }
    }

}
